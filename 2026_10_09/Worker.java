public class Worker implements Runnable  {
    
    private  static  boolean running = true;

    @Override
    public void run() {
       while (running) {
      System.out.println("I am runing");
   
   }
 }
 public static void stopRunning() {
    running = false;
 }

 


}

