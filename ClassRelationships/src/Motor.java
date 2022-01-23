public class Motor {
    String model;
    int horsePower;

    public Motor (String modelType, int horsePowers) {
        model = modelType;
        horsePower = horsePowers;
    }
    public void print () {
        System.out.println("Motor modellen er: " + model);
        System.out.println("Motoren har " + horsePower + " hæstekrafter");
    }
}
