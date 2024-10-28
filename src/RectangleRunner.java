public class RectangleRunner {
    public static void main(String[] args) throws Exception {
        // TODO 1 Instantiate a rectangle with 10x10 dimensions
        Rectangle rect1 = new Rectangle(10, 10);

    
        // TODO 2 print info about the rectangle
        System.out.println("Rectangle 1: " + rect1.toString());
        
        // TODO 3 Instantiate a rectangle with w=4 and h=8
        Rectangle rect2 = new Rectangle(4, 8);
        // TODO 4 print info about the 2nd rectangle
        System.out.println("Rectangle 2: " + rect2.toString());

        // TODO 5 create a 3rd rectangle with a w=8 and h=10
        Rectangle rect3 = new Rectangle(8, 10);
        // TODO 6 print the 3rd rectangles information
        System.out.println("rectangle 3: " + rect3.toString());

        // TODO 7 Modify the `toString` in the Rectangle Class to include the area
        // This will update all of the print statements above.

        int newWidth1 = 7;
        rect1.setWidth(newWidth1);

        // TODO 8 Use the setter method to change the 1st rectangle's width to a random 
        // integer value between 5 and 10.
        System.out.println("updated Rectangle 1 width is:" + rect1.getWidth());
        // TODO 8b print a single line of code that says "Rectangle 1 width is: <width>"
        // where <width> is the new width that was just assigned. You need to use a getter method.

        // TODO 9a Use the setter method to change the 2nd rectangle's height to a random 
        // integer value between 5 and 10.
        int newHeight2 = 9;
        rect2.setHeight(newHeight2);

        // TODO 9b print a single line of code that says "Rectangle 2 ht is: <height>"
        // where <height> is the new height that was just assigned. You need to use a getter method.

        System.out.println("Updated Rectangle 2 height is: " + rect2.getHeight());

        // TODO 10 Use the setter method to change the 3rd rectangle's width and height to random 
        // integer values between 5 and 10.

        rect3.setWidth(7);
        rect3.setHeight(9);



        // TODO 11 Reprint all rectangle information (in order of how they were created 1st, 2nd, 3rd)
        System.out.println("Final Rectangle 1: " + rect1.toString());
        System.out.println("Final Rectangle 2: " + rect2.toString());
        System.out.println("Final Rectangle 3: " + rect3.toString());



        // TODO 12 Reprint all rectangle information (in order from smallest to largest)
        // Note, this might not be easy...



    }
}
