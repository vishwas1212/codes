package concepts.designpatterns.structural;
/*
Use Case: Integrate legacy code into a new system
 */
public class OldPPrinter {

    public void print() {
        System.out.println("Printing from old printer");
    }
}

interface NewPrinter {
    void print();
}

class PrinterAdapter implements NewPrinter {
    private OldPPrinter oldPPrinter;

    public PrinterAdapter(OldPPrinter oldPPrinter) {
        this.oldPPrinter = oldPPrinter;
    }

    @Override
    public void print() {
        oldPPrinter.print();
    }
}
