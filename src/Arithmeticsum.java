public class Arithmeticsum {
    public static double add(double a,double b){
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }
    public static double add(double a,double b,double c,double d){
        return a+b+c+d;

    }
    public static void main(String[] args){
        System.out.println("Adding method using 2 arguments:"+add(10,15));
        System.out.println("Adding method using 2 arguments:"+add(10,15,50));
        System.out.println("Adding method using 2 arguments:" +add(10,15,50,60));


    }
}
