class cylinder {
    private int height;
    private int radius;

    public cylinder(int radius, int height) {
        this.radius = 5;
        this.height = 7;
    }

    public int getradius() {
        return radius;
    }

    public void setradius(int r) {
        radius = r;
    }

    public void setheight(int h) {
        height = h;
    }

    public int getheight() {
        return height;
    }

    public double surfaceArea() {
        return 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius; // A=2πrh+2πr^2
    }

    public double volume() {
        return 3.14 * radius * radius * height; // V=πr^2 h
    }
}

class rectangle {
    private int length;
    private int breadth;

    public rectangle() {
        this.length = 6;
        this.breadth = 7;
    }

    public void setlength(int l) {
        this.length = l;
    }

    public int getlength() {
        return length;
    }

    public void setbreadth(int b) {
        this.breadth = b;
    }

    public int getbreadth() {
        return breadth;
    }

}

class circle {
    private int radius;

    public circle(int r) {
        this.radius = 10;
    }

    public void setradius(int r) {
        this.radius = r;

    }

    public int getradius() {
        return radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public int diameter() {
        return 2 * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

}

class square {
    private int side;

    public square(int s) {
        this.side = 50;
    }

    public void setside(int s) {
        this.side = s;
    }

    public int getside() {
        return side;
    }

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }

}

public class j31_practise {
    public static void main(String[] args) {

        cylinder mycylinder = new cylinder(5, 7);
        // mycylinder.setradius(5);
        System.out.print("The radius of cylinder is : ");
        System.out.println(mycylinder.getradius());
        // mycylinder.setheight(7);
        System.out.print("The height of cylinder is : ");
        System.out.println(mycylinder.getheight());
        System.out.print("The surface area of cylinder is : ");
        System.out.println(mycylinder.surfaceArea());
        System.out.print("The volume of cylinder is : ");
        System.out.println(mycylinder.volume());

        rectangle rec = new rectangle();
        System.out.print("The length of rectangle is : ");
        System.out.println(rec.getlength());
        System.out.print("The breadth of rectangle is : ");
        System.out.println(rec.getbreadth());

        circle cir = new circle(10);
        System.out.print("The radius of circle is : ");
        System.out.println(cir.getradius());
        System.out.print("The area of circle is : ");
        System.out.println(cir.area());
        System.out.print("The diameter of circle is : ");
        System.out.println(cir.diameter());
        System.out.print("The perimeter of circle is : ");
        System.out.println(cir.perimeter());

        square sqr = new square(50);
        System.out.print("The side of square is : ");
        System.out.print(sqr.getside());
        System.out.println("The area of square is : ");
        System.out.print(sqr.area());
        System.out.print("The perimeter of square is : ");
        System.out.println(sqr.perimeter());
    }

}
