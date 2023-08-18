class base {
    public int x;

    public void setx(int x) {
        System.out.println("I am in base and setting x");
        this.x = x;
    }

    public int getx() {
        return x;
    }

    public base(int x) {
        System.out.println("I am a constructor");
        this.x = 5;
    }
}

class Derived extends base {
    public int y;

    public void sety(int y) {
        this.y = y;
    }

    public int gety() {
        return y;
    }

    public Derived(int y, int x) {
        super(x);
        this.y = 8;

    }
}

public class j32_inheritence {
    public static void main(String[] args) {
        // creating an object of base class
        base b = new base(5);
        System.out.println(b.getx());
        // creating an object of derived class
        Derived d = new Derived(8, 5);
        System.out.println(d.gety());
        System.out.println(d.getx());
    }

}
