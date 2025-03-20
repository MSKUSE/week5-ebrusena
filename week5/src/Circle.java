public class Circle {

    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius<0){
        this.radius = 0;
            System.out.println("cannot be negative");
    }

    private int radius;

}
