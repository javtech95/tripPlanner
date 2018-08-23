public class Main {
//Calling the Static method on the Main method
    public static void main(String[] args){
        method1();
        method2();
        mathPrimitives();
        variables();
        mathOperations();
    }
//    Static method with statement
    private static void method1(){
        System.out.println("Hello Idiots");
    }
    private static void method2(){
        method1();
        System.out.println("Hello rejects");
    }
    private static void mathPrimitives(){

    }
    private static void variables(){
        int x = 10;
        System.out.println("My variable x contains " + x);
        x = 15;
        System.out.println("My variable x contains " + x);
        String mystring = "My variable x contains ";
        System.out.println(mystring + x);
    }
    private static void mathOperations(){
        double x = 10;
        int y = 3;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));

        x++;
        y += 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        var a = 1 + 0 + "0" + 5 * 10;
        System.out.println(a);


    }
}
