public class Drug {
    String name;
    int time;

    public Drug (String namedrug,int affectionTime) {
        name = namedrug;
        time = affectionTime;

    }
    public void print () {
        System.out.println("Stoffet hedder: " + name);
        System.out.println("Stoffet har effekt i: " + time + " timer");
    }
}
