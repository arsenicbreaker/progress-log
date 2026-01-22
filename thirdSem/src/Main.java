//player
class Player {
    String name;
    double health;
    int level;
    //object
    Weapon weapon;
    Armor armor;
}
//senjata
class Weapon {
    double attackPower;
    Weapon(double attackPower) {
        this.attackPower = attackPower;
    }
}

//armor
class Armor {
    double defencePower;
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Haiiii");
    }
}