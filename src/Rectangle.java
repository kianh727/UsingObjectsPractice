public class Rectangle {
    private double height;
    private double width;
    
    public Rectangle() {
        height = 10;
        width = 10;
    }

    /**
     * 
    //  * - the width of the Rectangle
    //  *  - the height of the Rectangle
     */
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

     public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 
     *  - the area of the rectangle in square units
     */
    public double calcArea(){
        return height * width;
    }
     public double calcPerimeter(){
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        // TODO 7 Modify this method to include the area of the rectangle
        return "Rectangle with w= " + width + ", h= " + height;
    }
}
