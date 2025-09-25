package concepts.custom.singleton;

import java.io.*;

public class CustomSingletonDriver {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CustomSingletonEager a = CustomSingletonEager.getInstance();
        CustomSingletonEager b = CustomSingletonEager.getInstance();
        CustomSingletonEager c = CustomSingletonEager.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        if (a == b && a == c && b == c) {
            System.out.println("EAGER SINGLETON IMPLEMENTED WITH SIMPLEST APPROACH");
        } else {
            System.out.println("NOT SINGLETON");
        }
        System.out.println("-----------------------------------------------");

        CustomSingletonLazy d = CustomSingletonLazy.getInstance();
        CustomSingletonLazy e = CustomSingletonLazy.getInstance();
        CustomSingletonLazy f = CustomSingletonLazy.getInstance();

        System.out.println(d.hashCode());
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());

        if (d == e && d == f && e == f) {
            System.out.println("LAZY SINGLETON IMPLEMENTED WITH THREAD SAFE");
        } else {
            System.out.println("NOT SINGLETON");
        }
        System.out.println("-----------------------------------------------");

        CustomSingletonStatic g = CustomSingletonStatic.getInstance();
        CustomSingletonStatic h = CustomSingletonStatic.getInstance();
        CustomSingletonStatic i = CustomSingletonStatic.getInstance();

        System.out.println(g.hashCode());
        System.out.println(h.hashCode());
        System.out.println(i.hashCode());

        if (g == h && g == i && h == i) {
            System.out.println("STATIC SINGLETON IMPLEMENTED WITH TRY CATCH BLOCK");
        } else {
            System.out.println("NOT SINGLETON");
        }
        System.out.println("-----------------------------------------------");

        CustomSingletonBillPaugh j = CustomSingletonBillPaugh.getInstance();
        CustomSingletonBillPaugh k = CustomSingletonBillPaugh.getInstance();
        CustomSingletonBillPaugh l = CustomSingletonBillPaugh.getInstance();

        System.out.println(j.hashCode());
        System.out.println(k.hashCode());
        System.out.println(l.hashCode());

        if (j == k && j == l && k == l) {
            System.out.println("STATIC SINGLETON IMPLEMENTED WITH TRY CATCH BLOCK");
        } else {
            System.out.println("NOT SINGLETON");
        }
        System.out.println("-----------------------------------------------");
        CustomSIngletonEnum m = CustomSIngletonEnum.INSTANCE;
        CustomSIngletonEnum n = CustomSIngletonEnum.INSTANCE;
        CustomSIngletonEnum o = CustomSIngletonEnum.INSTANCE;

        System.out.println(j.hashCode());
        System.out.println(k.hashCode());
        System.out.println(l.hashCode());

        if (m == n && m == o && n == o) {
            System.out.println("STATIC SINGLETON IMPLEMENTED WITH ENUM");
        } else {
            System.out.println("NOT SINGLETON");
        }

        System.out.println("-----------------------------------------------");
        CustomSngletonSerilizable instanceOne = CustomSngletonSerilizable.getInstance();
        ObjectOutput op = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        op.writeObject(instanceOne);
        op.close();

        ObjectInput ip = new ObjectInputStream(new FileInputStream("filename.ser"));
        CustomSngletonSerilizable instanceTwo = (CustomSngletonSerilizable) ip.readObject();
        ip.close();

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

        System.out.println("-----------------------------------------------");

        CustomSingletonSecured p = CustomSingletonSecured.getInstance();
        CustomSingletonSecured q = CustomSingletonSecured.getInstance();
        CustomSingletonSecured r = CustomSingletonSecured.getInstance();

        System.out.println(p.hashCode());
        System.out.println(q.hashCode());
        System.out.println(r.hashCode());

        if (p == q && p == r && q == r) {
            System.out.println("SECURED SINGLETON IMPLEMENTED");
        } else {
            System.out.println("NOT SINGLETON");
        }

        CustomSingletonSecured singletonSecuredOne = CustomSingletonSecured.getInstance();
        ObjectOutput sop = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        sop.writeObject(singletonSecuredOne);
        sop.close();

        ObjectInput sip = new ObjectInputStream(new FileInputStream("filename.ser"));
        CustomSingletonSecured singletonSecuredTwo = (CustomSingletonSecured) sip.readObject();
        sip.close();

        System.out.println(singletonSecuredOne.hashCode());
        System.out.println(singletonSecuredTwo.hashCode());

        if (singletonSecuredOne == singletonSecuredTwo) {
            System.out.println("SECURED SINGLETON IMPLEMENTED BY SERIALIZABLE");
        } else {
            System.out.println("NOT SINGLETON");
        }
    }
}
