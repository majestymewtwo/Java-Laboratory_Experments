class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("j = " + i);
        }
    }
}

class C extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("k = " + i);
        }
    }
}

public class Priority {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.setPriority(1);
        b.setPriority(5);
        c.setPriority(10);
        a.start();
        b.start();
        c.start();
    }
}
