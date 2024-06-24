public class AreaUsingMethodOverloading {
    public static double Area(double side){
       return side * side;

    }
    public static double Area(double length,double breadth){
        return length * breadth;
    }
    public static float Area(float radius){
        return (float) (3.14*radius*radius);

    }
    public static void main(String [] args){
        System.out.println("Area of Square is : "+Area(13.0));
        System.out.println("Area of Rectangle is : "+Area(12,10));
        System.out.println("Area of Circle is : "+Area(12));


    }
}
