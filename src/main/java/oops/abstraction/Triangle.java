package oops.abstraction;

public class Triangle extends Shape{
    public void displayShape() {
        System.out.println("display shape triangle");
    }

    public static void main(String[] args){
        Triangle obj = new Triangle();
        obj.a = 2;
        System.out.println(obj.a);
        obj.displayShape();
        obj.displayName();

        Shape obj1 = new Triangle();
        obj1.displayShape();
    }
}
