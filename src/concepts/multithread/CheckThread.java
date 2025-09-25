package concepts.multithread;

public class CheckThread extends Thread {

    public CheckThread(String name) {
        super(name);
    }

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon Thread!");
        } else {
            System.out.println(getName() + " is User Thread!");
        }
    }

    public static void main(String[] args) {
        CheckThread c1 = new CheckThread("c1");
        CheckThread c2 = new CheckThread("c2");
        CheckThread c3 = new CheckThread("c3");

        c1.setDaemon(true);
        c1.start();
        c2.start();
        c3.setDaemon(true);
        c3.start();
    }
}
