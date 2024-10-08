interface M{
    int x=10;
    void fun();
}

interface N{
    int x =20;
    void fun();
}

class C implements M,N{
    public void fun(){
        System.out.println("Hello, I'm function in C");
        System.out.println(M.x); //Ambiguity resolved through using fully qualified name
        System.out.println(N.x);
        System.out.println(M.super.hashCode());
        System.out.println(N.super.hashCode());

    }
}

interface O extends M,N{ //Multiple inheritance through interfaces
    void fun();
}

class D implements O{
    public void fun(){
        System.out.println("Hello, I'm function in D");
    }
}

public class MultipleInheritanceStudy {
    public static void main(String[] args) {
        C c= new C();
        D d = new D();
        c.fun();
        d.fun();

    }
}
