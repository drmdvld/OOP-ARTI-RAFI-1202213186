public class Restaurant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return foodNumber;
    }

    public void makeFood() {
        synchronized(Restaurant.lock) {

            if (this.waitingForPickup) {
                try {
                    System.out.println("Food Machine: Waiting for the Waiter to deliver the Food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            waitingForPickup = true;
            System.out.println("Food Machine:  Making Food Number " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Food Machine: Telling the waiter to get the Food\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}
