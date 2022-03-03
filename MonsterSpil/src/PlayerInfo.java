public class PlayerInfo {
    private int speed;
    private int strength;
    private int damage;
    private boolean injured;
    private int legs;
    private int arms;
    private int body;
    private double bloodAmount;
    private String name;


    public PlayerInfo(int speed, int strength, int damage, boolean injured, int legs, int arms, int body, double bloodAmount, String name) {
        this.speed = speed;
        this.strength = strength;
        this.damage = damage;
        this.injured = injured;
        this.legs = legs;
        this.arms = arms;
        this.body = body;
        this.bloodAmount = bloodAmount;
        this.name = name;
    }

    public void loseBlood() {
        bloodAmount--;
        noBlood();

    }

    public void noBlood() {
        if (bloodAmount <= 0 && injured) {
            System.out.println("GAME OVER");
            System.out.println("You bled out from you're injuries");
        }
    }

    public void printPlayerStats() {
        System.out.println("Speed: " + speed);
        System.out.println("Strength: " + strength);
        System.out.println("Injured?: " + injured);
        if (injured) {
            System.out.println("Your injuries are as follows:");
            if (arms == 1) {
                System.out.println("Your left arm is heavily injured, and is unusable");
            } else if (arms <= 0) {
                System.out.println("Both your arms are heavily injured, and unusable");
            }
            if (legs == 1) {
                System.out.println("Your left leg is heavily injured, and is unusable");
            } else if (legs == 0) {
                System.out.println("Both your legs are heavily injured, and unusable");
            }
            if (body == 0) {
                System.out.println("Your chest is heavily injured, and you're quickly losing blood - Get help as soon as possible!");
            }
            if (bloodAmount < 10) {
                System.out.println("You've lost blood! You only have " + bloodAmount + "liters of blood left. If you bleed out, you will die!");
            }
        }
    }
}

