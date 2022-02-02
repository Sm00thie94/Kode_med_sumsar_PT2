package opgave14;

public class Player {
    private String name;
    private int hp;
    private int maxHP;
    private int damage;

    public Player (String name, int hp, int maxHP, int damage){
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.damage = damage;

    } public void loseHP (int hp) {
        this.hp = getHp() - hp;
        if(this.hp <= 0){
            System.out.println("Shit man! du døde");

        }
    } public void healHP (int hp) {
        this.hp = this.hp + hp;
        if (this.hp > maxHP)
            this.hp = maxHP;
    } public void printHP () {
        System.out.println("Du har nu " + hp + " HP tilbage");
    }public int getHp () {
        return hp;
    }



}
