public class Main {
    public static void main(String[] args) {
        //PARENT CLASS OBJECT
        Shape s = new Shape();
        s.area(2, 5);

        //CHILD CLASS OBJECT
        Shape c = new Cone();
        c.area(7, 3);
    }
}