import java.util.Scanner;
public class Sumof2bytes {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    byte b1 = sc.nextByte();
    byte b2 = sc.nextByte();
    int num1 = (int)b1;
    int num2 = (int)b2;
    int result = num1 + num2;
    System.out.println("The sum of two bytes is" +result);
    }
}
