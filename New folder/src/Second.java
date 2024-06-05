public class Second {
    public static void main(String[] args){
        Shape w=new Rectangle(1,3);
        System.out.println(w.perimeter());
        System.out.println(w.area());
        Shape q=new Square(1);
        System.out.println(q.perimeter());
        System.out.println(q.area());
    }
}
abstract class Shape{
    abstract int perimeter();

    abstract int area();

}
class Rectangle extends Shape{
    int q,s;
    Rectangle(int a,int b){
        q=a;
        s=b;
    }
    int perimeter(){
        System.out.println("Perimeter of length :"+q+" and breadth :"+s+" is");
        return 2*(q+s);
    }
    int area(){
        System.out.println("Area of length : "+q+" and breadth : "+s+ " is");
        return s*q;
    }
}
class Square extends Shape{
    int e;
    Square(int s){
        e=s;
    }
    int perimeter(){
        System.out.println("Perimeter of side: "+e+" is ");
        return 4*e;
    }
    int area(){
        System.out.println("Area "+e+" is ");
        return e*e;
    }
}