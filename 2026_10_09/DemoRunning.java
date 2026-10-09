public class DemoRunning {

        public static void main(String[] args) throws InterruptedException {
    
    Worker worker = new Worker();
    Thread  thread = new Thread(worker);

    thread.start();
  
    System.out.println("Stopping the worker");
    Worker.stopRunning();
    System.out.println("Should have stopped");

 }
    }
    

