//create a class circle and use inheritance to create another class cylinder from it
class circle1 {
    public int radius;

    public circle1(int radius) {
        this.radius = radius;
    }

    public int getradius() {
        return radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

class cylinder1 extends circle1 {
    public int height;

    public cylinder1(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getheight() {
        return height;
    }

}

public class j36_practice {
    public static void main(String[] args) {
        circle1 c = new circle1(5);
        System.out.println(c.getradius());
        System.out.println(c.area());

        cylinder1 c1 = new cylinder1(5, 6);
        System.out.println(c1.getradius());
        System.out.println(c1.getheight());

    }

}
