public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        String s1 = new String("ali");
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);
        Point p2 = new Point( 3 , 4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);
        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Rectangle r1 = new Rectangle(
                new Point(3,4),
                tLeft,
                sideA:3
                sideB:4
        );
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().yCoord);
        System.out.println(r1.getTopLeft().xCoord);

        Circle c1 = new Circle(
                new Point(x:3,y:4),
                radius:5
        );
        System.out.println(c1.getRadius());
        c1.setRadius(-21);
        System.out.println(c1.getRadius());
    }
}