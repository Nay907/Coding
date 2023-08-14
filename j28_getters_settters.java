class myemployee {
    private int id;
    private String name;

    public void setid(int i) {
        id = i;
    }

    public int getid() {
        return id;
    }

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }
}

public class j28_getters_settters {
    public static void main(String[] args) {
        myemployee gaurav = new myemployee();
        // gaurav.id=5;
        // gaurav.name="gaurav katiyar" ----> throws an error due to private access
        // modifier
        gaurav.setid(234);
        System.out.println(gaurav.getid());
        // int id = gaurav.getid();
        // System.out.println(id);
        gaurav.setname("gaurav katiyar");
        System.out.println(gaurav.getname());
        // String name = gaurav.getname();
        // System.out.println(name);

    }

}
