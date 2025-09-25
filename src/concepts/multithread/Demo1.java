package concepts.multithread;

public class Demo1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running by interface");
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.run();
        demo1.run();
        Thread tobj = new Thread(demo1);
        tobj.start();
    }
}
