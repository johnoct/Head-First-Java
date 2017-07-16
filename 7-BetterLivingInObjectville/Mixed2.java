public class Mixed2{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        // Option 1
        b.m1();
        c.m2();
        a.m3();
        // Output 1
        // B's M1, 
        // A's M2, 
        // A's M3,

        // Option 2
        c.m1();
        c.m2();
        c.m3();
        // Output 2
        // B's m1,
        // A's m2, 
        // C's m3, 6

        // Option 3
        a.m1();
        b.m2();
        c.m3();
        // Output 3
        // A's m1,
        // A's m2,
        // C's m3, 6

        // Option 4
        a2.m1();
        a2.m2();
        a2.m3();
        // Output 4
        // A's m1,
        // A's m2,
        // C's m3, 13
    }
}