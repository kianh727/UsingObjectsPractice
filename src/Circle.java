public class Circle {
    //What fields would a Circle need?
    private double radius;

    public Circle(){
        this.radius = 10;
    }


    public Circle(double radius){
        this.radius = radius;
    }

    //What constructor(s) will a Circle need?



    //What methods will a circle need?
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calculateCircumference(){

        return 2 * Math.PI * radius;
    }

    public double getRadius(){

        return radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

}
