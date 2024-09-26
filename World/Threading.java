package World;

public class Threading {
    public static void TestDriver1(){
        C c1=new C();
        D d1=new D();
        Thread t3=new Thread(c1);
        Thread t4=new Thread(d1);
        t3.start();
        t4.start();
    }
        public static void TestDriver(){
            A a1=new A();
            B b1=new B();
            Thread t1=new Thread(a1);
            Thread t2=new Thread(b1);
            t1.start();
            t2.start();
        }
    }
class C extends Thread{
    public void run(){
        f2();
    }
    public void f2(){
        for(int j=1;j<=10;j++)
            System.out.println("j=" +j);
    }
}
class D extends Thread{
    public void run(){
        f1();
    }
    public void f1(){
        for(int i=1;i<=10;i++)
            System.out.println("i=" +i);
    }
}
    class B implements Runnable{
        public void run(){
            f2();
        }
        public void f2(){
            for(int j=1;j<=10;j++)
                System.out.println("j=" +j);
        }
    }
    class A implements Runnable{
        public void run(){
            f1();
        }
        public void f1(){
            for(int i=1;i<=10;i++)
                System.out.println("i=" +i);
        }
    }
    class Example {
        public static void main(String[] args) {
            Threading.TestDriver1();
        }

    }

