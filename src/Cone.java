//Child class
public class Cone extends Shape {
    //Overridden area method
    @Override
    void area(int r, int l) {
        System.out.println("Calling derived class...");
        area = 3.14 * r * l;
        System.out.println("Area of cone : " + area);
    }
}
