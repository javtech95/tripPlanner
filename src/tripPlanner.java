import java.util.Scanner;
public class tripPlanner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you "+name+ ", where are you travelling to? ");
        String city = input.nextLine();
        System.out.println("Great! "+city+ " sounds like a great trip");
        System.out.println("***********");

        System.out.println();
        System.out.print("How many days are you going to spend travelling? ");
        int day = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String curr = input.next();
        System.out.print("How many " + curr +" are there in 1 USD? ");
        double amount = input.nextDouble();
        double BudgetPerDay = (money*amount)/day;

        System.out.println();
        System.out.println("If you are travelling for "+ day +" days that is the same as "+ day*24 + " hours or " + (day*24)*60 + " minutes");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $"+ money/day + " USD");
        System.out.print("Your total budget in "+ curr+ " is "+ money*amount + " "+ curr);
        System.out.printf(", which per day is %.2f",BudgetPerDay);
        System.out.println(" " + curr);
        System.out.println("***********");

        System.out.println();
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int time = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be "+ ((24+time)%24)+ ":00 in your travel destination");
        System.out.println("and when it is noon at home it will be "+((12+time)%24)+ ":00");

        System.out.println("***********");
        System.out.println();
        System.out.print("What is the square area of your destination country in km2? ");
        double area = input.nextDouble();
        double miles = area*0.62137;
        System.out.printf("In miles that is %.2f", miles);
        System.out.println();
        System.out.println("***********");
    }
}