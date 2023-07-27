public class j21_method_in_java {
   static int  logic(int x, int y){
       int z;
       if(x>y){
           z = x+y;
       }
       else{
           z = x+y/2;
       }
       return z;
   }
   public static void main(String[] args) {
       int a=6;
       int b=7;
       int c;
       c=logic(a,b);
       System.out.println(c);
   }
}
    

