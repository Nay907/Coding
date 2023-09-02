class thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {

            System.out.println("method is running");
            i++;
        }
    }
}

class thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("thread is running");
            i++;
        }
    }

}

public class j45_threads {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();

    }

}
