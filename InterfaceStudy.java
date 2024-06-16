interface  shape{
    double pi = 3.14; //public, static, final
    double getSquare(double r); //public, abstract
}

class Circle implements shape{
    public double getSquare(double r){
        return r*r;
    }
    void fun(){
        System.out.println("Hey, I implemented an interface named shape");
    }
}

public class InterfaceStudy {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getSquare(5));
        c.fun();
    }
    
}