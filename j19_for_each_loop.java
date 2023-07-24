public class j19_for_each_loop {
    public static void main(String[] args) {
        int [] marks = {98, 76, 90, 80, 86 };
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        
        System.out.println("printing using for loop");
        for( int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        

        System.out.println("printing using for loop in reverse order");
        for( int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);

        }
        System.out.println("printing using for each loop");
        for(int element: marks){
            System.out.println(element);
        }
        
    }
    
}
