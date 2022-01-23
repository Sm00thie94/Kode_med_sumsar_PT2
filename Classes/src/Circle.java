public class Circle {
    double radius;

    public Circle(int radius1){
        radius = radius1;
    }
    public double getDiameter () {

        return radius * 2;
    }


    public void circleInfo() {

        System.out.println(radius);
    }

}
