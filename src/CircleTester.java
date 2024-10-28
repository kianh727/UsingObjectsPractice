public class CircleTester {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("Circle 1 radius: " + c1.getRadius());
        System.out.println("Circle 1 circumference " + c1.calculateCircumference());
        System.out.println("Circle 1 area: " + c1.calculateArea());
        System.out.println();

    
        Circle c2 = new Circle();
        c2.setRadius(5.0);
        System.out.println("Circle 2 radius: " + c2.getRadius());
        System.out.println("Circle 2 circumference " + c2.calculateCircumference());
        System.out.println("Circle 2 area: " + c2.calculateArea());
        System.out.println();


    
        Circle c3 = new Circle();
        c3.setRadius(7.5);
        System.out.println("Circle 3 radius: " + c3.getRadius());
        System.out.println("Circle 3 circumference " + c3.calculateCircumference());
        System.out.println("Circle 3 area: " + c3.calculateArea());
        System.out.println();


    }

}
