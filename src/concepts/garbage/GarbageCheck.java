package concepts.garbage;

import javax.sound.midi.Soundbank;

public class GarbageCheck {
    static void main() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            String data = new String("Data");
        }
        long end = System.currentTimeMillis();
        System.gc();
        System.out.println(end-start);
    }
}
