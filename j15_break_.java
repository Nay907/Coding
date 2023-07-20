public class j15_break_ {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            System.out.println(i);
            if(i==2){
                System.out.println("loop ends here");
            break;
            }
            
            
        }
        int b = 7;
        while( b<15){
            System.out.println(b);
            if(b==10){
                System.out.println("loop ends");
                break;
            }
            b++;
        }
        int c = 6;
        do{
            System.out.println(c);
            if(c==8){
                System.out.println();
                break;
            }c++;
        }while(c<10);
    }
    
}
