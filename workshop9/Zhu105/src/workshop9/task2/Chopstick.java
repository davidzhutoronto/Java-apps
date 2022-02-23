package workshop9.task2;

import java.util.concurrent.locks.ReentrantLock;

class Chopstick extends ReentrantLock {
    String name;

    public Chopstick(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "chopstick{" + name + '}';
    }
}
