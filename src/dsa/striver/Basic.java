package dsa.striver;

public class Basic {
    static void main() {
        /*
         * Byte ranges from -128 to 127 ==8 bit
         *If we put beyond -127 and 127 we will compile time error
         */
        byte num = 127;
        System.out.println("The number is " + num);
        /*
         * short range from -32k to -31 k == 16 bit
         */
        short num2 = 31000;
        System.out.println("The number is " + num2);

        /*
         * int range 32 bit
         */
        int num3 = 2147483647;
        System.out.println("The number is " + num3);

        /*
         * long range 64 bit
         */
        long num4 = 9223372036854775807l;
        System.out.println("The number is " + num4);

        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
    }
}
