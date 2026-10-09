class Eating implements Runnable {




    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Eating  printing " + (i + 1));

            // try {
            //     Thread.sleep(3000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    
    }

}

class Drinking implements Runnable {

   

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Drinking printing " + (i + 1));
        }
    }
    }