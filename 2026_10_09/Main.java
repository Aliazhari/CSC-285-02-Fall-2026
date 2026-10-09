public class Main {
    
    public static void main(String[] args) throws InterruptedException {
         Counter c1 = new Counter();

        Thread task1 = new Thread(() -> {
            for (int i= 0; i < 1000; i++)
            c1.increment();
        });

        Thread task2 = new Thread(() -> {
            for (int i= 0; i < 1000; i++)
            c1.increment();
        });

        task1.start();
        task2.start();

         task1.join();
        task2.join();
       

        c1.print();
        
    }
}
