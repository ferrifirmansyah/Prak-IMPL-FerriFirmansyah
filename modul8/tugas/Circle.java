public class Circle extends Shape {
    private float radius;
    private static int counter;
    private Point center;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
        counter++;
    }

    public double area(int radius) {
        return Math.PI * radius * radius;
    }

    public double area(int radius, float focus) {
        // Implementation for area with focus
        return 0; // Placeholder
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Implementation for drawing a circle
    }

    @Override
    public void erase() {
        // Implementation for erasing a circle
    }

    @Override
    public void move() {
        // Implementation for moving a circle
    }

    @Override
    public void resize() {
        // Implementation for resizing a circle
    }
}
