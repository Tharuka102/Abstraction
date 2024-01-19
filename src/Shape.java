
abstract class Shape {
    abstract void draw ();

}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing Rectangle");
    }
}
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
}
class test{
    public static void main(String[] args) {
        Shape s =new Rectangle();
        Shape s1 =new Triangle();
        s.draw();
        s1.draw();
    }
}
