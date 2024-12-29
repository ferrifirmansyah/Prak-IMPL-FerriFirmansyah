public class Main {
    public static void main(String[] args) {
        // 1. Testing Point Class
        Point point1 = new Point(10, 20);
        Point point2 = new Point(30, 40);
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");

        // 2. Testing Circle Class
        Circle circle = new Circle(point1, 15.5f);
        System.out.println("Circle Area (radius=15): " + circle.area(15));
        circle.setCenter(point2);
        System.out.println("Circle New Center: (" + circle.area(20) + ")");

        // 3. Testing Rectangle Class
        Rectangle rectangle = new Rectangle();
        System.out.println("\nTesting Rectangle:");
        rectangle.draw();
        rectangle.move();

        // 4. Testing Polygon Class
        Polygon polygon = new Polygon();
        System.out.println("\nTesting Polygon:");
        polygon.draw();
        polygon.resize();

        // 5. Testing Window Class
        Window window = new Window();
        System.out.println("\nTesting Window:");
        window.open();
        window.display();
        window.close();

        // 6. Testing Frame Class
        Frame frame = new Frame();
        System.out.println("\nTesting Frame:");
        frame.open();
        frame.move();
        frame.close();

        // 7. Testing DrawingContext Class
        DrawingContext drawingContext = new DrawingContext();
        System.out.println("\nTesting DrawingContext:");
        drawingContext.setPoint(point1);
        drawingContext.clearScreen();
        System.out.println("Vertical Size: " + drawingContext.getVerticalSize());
        System.out.println("Horizontal Size: " + drawingContext.getHorizontalSize());

        // 8. Testing Event Class
        Event event = new Event();
        System.out.println("\nTesting Event Class:");
        window.handleEvent(event);

        // 9. Testing DialogBox Class
        DialogBox dialogBox = new DialogBox();
        System.out.println("\nTesting DialogBox:");
        // Add functionality if necessary

        // 10. Testing DataController Class
        DataController dataController = new DataController();
        System.out.println("\nTesting DataController:");
       
        System.out.println("\nAll tests completed successfully.");
    }
}
