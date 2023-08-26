/*question 1
abstract class pen{
   abstract void write();
    abstract void refil();
}
class fountainpen extends pen{
   public void write(){
       System.out.println("writing.....");
   }
   public void refil(){
       System.out.println("refilling.....");
   }
   public void changenip(){
       System.out.println("changing the nip.....");
   }
}
public class j40_practice {
   public static void main(String[] args) {
      /* pen fp = new fountainpen();
       fp.write();
        fp.refil();
       // fp.changenip(); //throws an error
       fountainpen p = new fountainpen();
       p.changenip();
       // p.write();    //throws an error
       // p.refil();    //throws an eroor
       
   }
   
}*/
/* question  2
interface basicanimal{
    void  eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("jumping.....");
    }
    void bite(){
        System.out.println("biting.....");
    }
}
class human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("eating.....");
    }
    public void sleep(){
        System.out.println("sleeping.....");
    }

}
public class j40_practice {
    public static void main(String[] args) {
        human  h = new human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
        monkey m = new human();
        m.jump();
        m.sleep();
    }
}*/
/*question 4
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smarttelephone extends telephone{
    public void ring(){
        System.out.println("ringing.....");
    }
    public void lift(){
        System.out.println("lifting.....");
    }
    public void disconnect(){
        System.out.println("disconncting......");
    }

}
public class j40_practice {
    public static void main(String[] args) {
        telephone t = new smarttelephone();
        t.ring();
        t.lift();
        t.disconnect();
    }
}*/
//question 5
interface tvremote {
    void press5();
}

interface smarttvremote extends tvremote {
    void press6();
}

class tv implements smarttvremote {
    public void press5() {
        System.out.println("preesing....5");
    }

    public void press6() {
        System.out.println("pressing.....6");
    }

}

public class j40_practice {
    public static void main(String[] args) {
        tv t = new tv();
        t.press5();
        t.press6();

    }
}
