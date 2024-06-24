public class Numberofobjects {
    static int count =0;
    Numberofobjects()
    {
        count++;
    }

    public static void main(String[] args) {
        Numberofobjects obj1= new Numberofobjects();
        Numberofobjects obj2 = new Numberofobjects();
        Numberofobjects obj3 = new Numberofobjects();

        System.out.println(count);
    }
}
