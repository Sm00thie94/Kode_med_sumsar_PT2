public class PlayerInfo {
    private int speed;
    private int Strength;
    private int damage;
    private boolean injured;
    private int legs;
    private int arms;
    private int body;
    private int bloodAmount;
    private String name;

    public PlayerInfo(int speed, int strength, int damage, boolean injured, int legs, int arms, int body, int bloodAmount, String name) {
        this.speed = speed;
        this.Strength = strength;
        this.damage = damage;
        this.injured = injured;
        this.legs = legs;
        this.arms = arms;
        this.body = body;
        this.bloodAmount = bloodAmount;
        this.name = name;
    }
}
