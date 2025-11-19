package concepts.designpatterns.creational;

import java.sql.SQLOutput;

public class AbstractFactoryPattern {
    interface Button {
        void paint();
    }

    interface Checkbox {
        void checkBox();
    }

    static class WinButton implements Button {

        @Override
        public void paint() {
            System.out.println("Win Button");
        }
    }

    static class MacButton implements Button {

        @Override
        public void paint() {
            System.out.println("Mac Button");
        }
    }

    interface GUIFactory {
        Button createButton();

        Checkbox createCheckBox();
    }

    static class WinFactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new WinButton();
        }

        @Override
        public Checkbox createCheckBox() {
            return () -> System.out.println("Win Checkbox");
        }
    }

    static class Macfactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new MacButton();
        }

        @Override
        public Checkbox createCheckBox() {
            return () -> System.out.println("Mac Checkbox");
        }
    }
}
