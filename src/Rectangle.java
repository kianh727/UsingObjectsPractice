public class Rectangle {
    private double height;
    private double width;
    
    public Rectangle() {
        height = 10;
        width = 10;
    }

    /**
     * 
     * @param w - the width of the Rectangle
     * @param h - the height of the Rectangle
     */
    public Rectangle(double w, double h) {
        this.height = h;
        this.width = w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    /**
     * 
     * @return - the area of the rectangle in square units
     */
    public double calcArea(){
        return this.height * this.width;
    }

    @Override
    public String toString(){
        // TODO 7 Modify this method to include the area of the rectangle
        return "Rectangle with w= " + width + ", h= " + height + ", area = " + calcArea();
    }
}
