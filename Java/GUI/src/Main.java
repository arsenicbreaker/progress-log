import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    private final JTextField display = new JTextField();
    private String current = "";     // angka yang sedang diketik
    private double acc = 0.0;        // akumulator (hasil sementara)
    private String op = "";          // operator terakhir: + - * /
    private boolean justEvaluated = false; // supaya setelah "=" ketik angka langsung ganti

    public Main() {
        super("Kalkulator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 420);
        setLocationRelativeTo(null);

        // Display
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
        display.setBorder(BorderFactory.createEmptyBorder(12,12,12,12));
        add(display, BorderLayout.NORTH);

        // Tombol-tombol
        String[] keys = {
                "1","2","3","/",
                "4","5","6","*",
                "7","8","9","-",
                "0",".","C","+",
                "⌫","="
        };

        JPanel panel = new JPanel(new GridLayout(5,4,8,8));
        panel.setBorder(BorderFactory.createEmptyBorder(12,12,12,12));

        for (String k : keys) {
            JButton b = new JButton(k);
            b.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
            b.addActionListener(this);
            // untuk "⌫" dan "=" dibikin lebih lebar dengan GridLayout susah, jadi biarkan normal
            panel.add(b);
        }

        // Isi grid 5x4 butuh 20 sel, tombol kita 18 → tambahkan spacer 2 buah
        panel.add(new JLabel());
        panel.add(new JLabel());

        add(panel, BorderLayout.CENTER);
        updateDisplay("0");
    }

    private void updateDisplay(String text) {
        display.setText(text);
    }

    private String format(double v) {
        if (Math.abs(v - Math.rint(v)) < 1e-12) {
            return String.valueOf((long)Math.round(v)); // buang .0
        }
        return String.valueOf(v);
    }

    private double apply(double a, String operator, double b) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (Math.abs(b) < 1e-12) throw new ArithmeticException("Pembagian dengan nol");
                return a / b;
            default:  return b; // jika belum ada operator, ambil b
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String k = ((JButton)e.getSource()).getText();

        if (k.matches("[0-9]")) {
            if (justEvaluated) { // setelah "=", mulai angka baru
                current = "";
                justEvaluated = false;
            }
            // hindari leading zero berlebih
            if (current.equals("0")) current = "";
            current += k;
            updateDisplay(current);
            return;
        }

        if (k.equals(".")) {
            if (justEvaluated) { current = ""; justEvaluated = false; }
            if (!current.contains(".")) {
                if (current.isEmpty()) current = "0";
                current += ".";
                updateDisplay(current);
            }
            return;
        }

        if (k.equals("C")) {
            acc = 0.0; op = ""; current = "";
            updateDisplay("0");
            return;
        }

        if (k.equals("⌫")) {
            if (!current.isEmpty()) {
                current = current.substring(0, current.length()-1);
                updateDisplay(current.isEmpty() ? "0" : current);
            }
            return;
        }

        // Operator atau "="
        if ("+-*/".contains(k) || k.equals("=")) {
            try {
                double value = current.isEmpty() ? acc : Double.parseDouble(current);
                if (op.isEmpty()) {
                    // belum ada operasi → set acc ke value
                    acc = value;
                } else {
                    acc = apply(acc, op, value);
                }
                updateDisplay(format(acc));
                current = "";
                justEvaluated = k.equals("=");
                if (!k.equals("=")) op = k; else op = "";
            } catch (NumberFormatException ex) {
                updateDisplay("Input tidak valid");
                current = "";
            } catch (ArithmeticException ex) {
                updateDisplay(ex.getMessage()); // "Pembagian dengan nol"
                acc = 0.0; op = ""; current = "";
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
