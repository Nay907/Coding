class cellphone{
    public void ring(){
        System.out.println("ringing......");

    }
    public void vibrate(){
        System.out.println("vibtrate.....");
    }
    public void callfriend(){
        System.out.println("calling papa......");
    }
   
    
}
class tummy{
    public void pickup(){
        System.out.println("pickup the gun");
    }
    public void fire(){
        System.out.println("fire on the enemy");
    }
    public void run(){
        System.out.println("rum away towards enemy");
    }
    
}

public class j27_practice {
    public static void main(String[] args) {
        //problem 1
        cellphone vivo = new cellphone();
        vivo.callfriend();
        vivo.ring();
        vivo.vibrate();
        //problem 2
        tummy player = new tummy();
        player.pickup();
        player.fire();
        player.run();
    
    }

}
