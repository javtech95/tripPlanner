import java.util.Scanner;
public class LearnScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("What is your name?");
        String name = input.next();
        System.out.println("Hello " + name);


        Scanner console = new Scanner(System.in);
        System.out.print("How much money do you have? ");
        double money = console.nextDouble();
        System.out.println(money);
    }

}
