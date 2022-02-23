package workshop9.task2;

import java.util.Random;

class Philosopher extends Thread {
    Chopstick left;
    Chopstick right;

    public Philosopher(String name, Chopstick left, Chopstick right) {
        super(name);
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        while (true) {
            if(left.tryLock()){
                try {
                    
                    if (right.tryLock()) {
                        try {
                            eat();
                        }finally {
                            right.unlock();
                        }
                    }
                }finally {
                    left.unlock();
                }
            }
        }
    }

    Random random = new Random();
    private void eat()  {
       try {
    	
    	   System.out.println(Thread.currentThread().getName() + " is eating...");
    	Thread.sleep(1000);
       }
    catch(InterruptedException ex) 
    {
        Thread.currentThread().interrupt();
    }
    }
}
