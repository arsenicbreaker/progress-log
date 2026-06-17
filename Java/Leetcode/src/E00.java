public class E00 {

    public static double average(int[] scores) {
        double totalscores = 0;
        for (int score : scores) {
            totalscores += score;
        }
        double calculatedaverage = totalscores / scores.length;
        return calculatedaverage;
    }

    public static void main(String[] args) {
        int[] scores = {75, 88, 92, 65, 80, 70, 95, 60, 85, 78};
        double finalaverage = average(scores);
        System.out.println("Rata-rata final: " + finalaverage);
    }
}
