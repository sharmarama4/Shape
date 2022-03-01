package graphics;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(21, 87, 96, 37);
        Circle circle = new Circle(74, 36, 54);
        Triangle triangle = new Triangle(89, 41, 33, 68, 78);
        IsoScelesTriangle isoScelesTriangle = new IsoScelesTriangle(27, 63, 87, 12, 14);

        Square square = new Square(25, 35, 78);
        Square copy = new Square(square);

        Shape[] shapes = new Shape[10];
        shapes[0] = rectangle;
        shapes[1] = circle;
        shapes[2] = triangle;
        shapes[3] = isoScelesTriangle;
        shapes[4] = square;
        shapes[5] = copy;
        shapes[6] = new Circle(65, 57, 41);
        shapes[7] = new Triangle(65, 57, 41);
        shapes[8] = new Square(65, 57, 41);
        shapes[9] = new IsoScelesTriangle(65, 57, 41, 87, 96);
        System.out.println("square and copy have the same values:" + square.equals(copy));

       // System.out.println(rectangle);
        //System.out.println(square);
       // System.out.println(triangle);
       // System.out.println(isoScelesTriangle);
     printShapes(shapes);

    }

    private static void printShapes(Shape[] shapes) {
       for (Shape s : shapes) {
           System.out.println(s.getClass());
            System.out.println("Area:" + s.getArea());
            System.out.println("perimeter:" + s.getPerimeter());
            System.out.printf("position:(%d,%d)", s.getX(), s.getY());

            if (s instanceof Rectangle) {
                System.out.println("Height: " + ((Rectangle) s).getHeight());
                System.out.println("weidth:" + ((Rectangle) s).getWeidth());
            } else if (s instanceof Circle) {
                System.out.println("Radius:" + ((Circle) s).getRadius());
            } else if (s instanceof Triangle) {
                System.out.println("Height :"+((Triangle)s).getHeight());
                System.out.println("weidth :"+((Triangle)s).getWeidth());
                System.out.println("perpendicular:"+((Triangle)s).getPerpendicular());

            }

        }
       System.out.println();
    }
}