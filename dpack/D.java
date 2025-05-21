package dpack;

import bpack.B;
import cpack.C;

public class D {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        System.out.println("From class B");
        b.display();
        System.out.println();
        System.out.println("From class C");
        c.display();
    }
}

// Output
//From class B
//Protected: 20
//Public: 40
//
//From class C
//Public: 40
