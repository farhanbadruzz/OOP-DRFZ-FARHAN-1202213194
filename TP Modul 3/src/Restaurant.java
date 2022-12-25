public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int food_number = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return food_number;
    }

    public void makeFood() {
        synchronized (Restaurant.lock) {

            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            System.out.println("Restaurant: Making Food Number " + food_number++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the food\n");
            waitingForPickup = true;
        }

    }

    public static Object getLock() {
        return lock;
    }    
}
