public class RectangleRunner {
    public static void main(String[] args) {
        System.out.println("\n");
        // Instantiate a rectangle with 10x10 dimensions
        Rectangle r1 = new Rectangle();
        // print info about the rectangle
        System.out.println(r1.toString());
        
        // Instantiate a rectangle with w=4 and h=8
        Rectangle r2 = new Rectangle(4, 8);
        // print info about the 2nd rectangle
        System.out.println(r2);

        // TODO 5 create a 3rd rectangle with a w=8 and h=10
        Rectangle r3 = new Rectangle(8, 10);

        // print the 3rd rectangles information
        System.out.println(r3);

        // TODO 7 Modify the `toString` in the Rectangle Class to include the area
        // This will update all of the print statements above.

        // TODO 8 Use the setter method to change the 1st rectangle's width to a random 
        // integer value between 5 and 10.
        int newWidth = (int)(Math.random() * 6 + 5);
        r1.setWidth(newWidth);

        // TODO 8b print a single line of code that says "Rectangle 1 width is: <width>"
        // where <width> is the new width that was just assigned. You need to use a getter method.
        System.out.println("Rectangle 1 width is: " + r1.getWidth());

        // TODO 9a Use the setter method to change the 2nd rectangle's height to a random 
        // integer value between 5 and 10.
        int newHeight = (int)(Math.random() * 6 + 5);
        r2.setHeight(newHeight);
        
        // TODO 9b print a single line of code that says "Rectangle 2 ht is: <height>"
        // where <height> is the new height that was just assigned. You need to use a getter method.
        System.out.println("Rectangle 2 height = " + r2.getHeight());

        // TODO 10 Use the setter method to change the 3rd rectangle's width and height to random 
        // integer values between 5 and 10.
        newWidth = (int)(Math.random() * 6 + 5);
        newHeight = (int)(Math.random() * 6 + 5);
        r3.setHeight(newHeight);
        r3.setWidth(newWidth);


        // TODO 11 Reprint all rectangle information (in order of how they were created 1st, 2nd, 3rd)
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        

        // TODO 12 Reprint all rectangle information (in order from smallest to largest)
        // Note, this might not be easy...

        //calculate all 3 areas
        Rectangle big, mid, small;
        // compare them

        // if r1Area > r2Area and r1Area > r3Area  then biggest is r1
        if(r1.calcArea() < r2.calcArea() && r1.calcArea() < r3.calcArea()){
            small = r1;
        }
        else if (r1.calcArea() > r2.calcArea() && r1.calcArea() > r3.calcArea()) {
            big = r1;
        }
        else{
            mid = r1;
        }



    }
}
