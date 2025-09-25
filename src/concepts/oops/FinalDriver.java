package concepts.oops;

public class FinalDriver extends FinalCheck {

    public static void main(String[] args) {
        FinalCheck finalCheck = new FinalCheck();
        finalCheck.something();
        System.out.println(finalCheck.a);
        FinalCheck.b = 11;
        System.out.println(FinalCheck.b);
    }
}
