package concepts.designpatterns.structural;

public class StructuralDriver {
    public static void main(String[] args) {
        OldPPrinter oldPPrinter = new OldPPrinter();
        NewPrinter newPrinter = new PrinterAdapter(oldPPrinter);
        newPrinter.print();
    }
}
