package chapter9.homework.p2;

public class OtherPackage {
    OtherPackage() {
        chapter9.homework.p1.Protection p = new chapter9.homework.p1.Protection();
        System.out.println("other package constructor");

        // class or package only
        // System.out.println("n = " + p.n);

        // class only
        // System.out.println("n_pri = " + p.n_pri);

        // class, subclass or package only
        // System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
