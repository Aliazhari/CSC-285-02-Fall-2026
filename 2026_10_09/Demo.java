public class Demo {
    
    public static void main(String[] args) throws InterruptedException {
        
        Runnable task1 = new Eating();
       Runnable task2 = new Drinking();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
  

        // for (int i =0 ; i < 100; i++) {
        //     System.out.println("Sleeping " + (i+1));
        // }
    }
}
