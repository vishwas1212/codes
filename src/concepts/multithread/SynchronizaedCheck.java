package concepts.multithread;

public class SynchronizaedCheck {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

    static void main() {
        SynchronizaedCheck check = new SynchronizaedCheck();
        check.increment();
        System.out.println(check.getCount());
    }
}
