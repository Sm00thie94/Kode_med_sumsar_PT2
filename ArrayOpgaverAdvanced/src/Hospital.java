import java.util.Locale;

public class Hospital{
    private String name;
    private int beds;

    public Hospital(String name, int beds){
        this.name = name;
        this.beds = beds;
    }

    public void printInfo (){
        System.out.print(name);
        String lowercaseName = name.toLowerCase();
        if (!lowercaseName.contains("hospital")){
            System.out.print(" Hospital");
        }
        System.out.println();
        System.out.println("Hospitalet har: " + beds + " senge");
        System.out.println();
        System.out.println();

    }
    public int getBeds () {
        return beds;
    }

}
