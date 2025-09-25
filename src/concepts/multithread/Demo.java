package concepts.multithread;

public class Demo extends Thread {

    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.start();
    }
}
