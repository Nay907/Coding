class master {
    private int id;
    private String name;

    public master() {
        this.id = 35;
        this.name = "GAURAV KATIYAR";
    }

    public master(int yourid, String yourname) {
        this.id = 70;
        this.name = "GAURAV";

    }

    public void setid(int i) {
        this.id = i;
    }

    public int getid() {
        return id;
    }

    public void setame(String n) {
        this.name = n;
    }

    public String getname() {
        return name;
    }

}

public class j30_constructors {
    public static void main(String[] args) {
        master gaurav = new master(70, "GAURAV");
        // master gaurav = new master();
        System.out.println(gaurav.getid());
        System.out.println(gaurav.getname());
    }

}
