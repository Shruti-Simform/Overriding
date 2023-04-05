public class Shape {
    double area;
    void area(int l, int b) {
        System.out.println("Calling parent class...");
        area = l * b;
        System.out.println("Area of shape: " + area);
    }
}
