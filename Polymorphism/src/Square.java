public class Square extends Shape{
    private double length;
    private double height;

    public Square (double length, double height){
        this.length = length;
        this.height = height;
    } public double getArea (){
        return height * length;
    }
}
