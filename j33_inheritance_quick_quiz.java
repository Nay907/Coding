class animal {
    public String name;

    // public void setname(String s) {
    //     this.name = s;
    // }

    public String getname() {
        return name;
    }

    public animal(String s) {
        this.name = s;
    }
}

class dog extends animal {
    public String colour;

    // public void setcolour(String c) {
    //     this.colour = c;
    // }

    public String getcolour() {
        return colour;
    }

    public dog(String c, String s) {
        super(s);
        this.colour = c;

    }

}

public class j33_inheritance_quick_quiz {
    public static void main(String[] args) {

        animal a = new animal("bob");
        System.out.println(a.getname());

        dog d = new dog("Black", "bob");
        System.out.println(d.getcolour());
        System.out.println(d.getname());
    }
}
