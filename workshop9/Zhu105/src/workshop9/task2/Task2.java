package workshop9.task2;

public class Task2 {
		
	public static void main(String args[]) {
		Chopstick c1 = new Chopstick("c1");
        Chopstick c2 = new Chopstick("c2");
        Chopstick c3 = new Chopstick("c3");
        Chopstick c4 = new Chopstick("c4");
        Chopstick c5 = new Chopstick("c5");
        new Philosopher("A", c1, c2).start();
        new Philosopher("B", c2, c3).start();
        new Philosopher("C", c3, c4).start();
        new Philosopher("D", c4, c5).start();
        new Philosopher("E", c5, c1).start();


	}
}
