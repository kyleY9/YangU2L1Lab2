import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {

        // Objects
        Scanner scan = new Scanner(System.in);
        ChatBot debbie = new ChatBot("Debbie", 7);

        // Method calls
        System.out.print("What is your name?");
        String yourName = scan.nextLine();
        debbie.greeting(yourName);
        System.out.println();

        debbie.weather();
        System.out.println();

        System.out.print("Hey, how many feet tall are you?");
        int feet = scan.nextInt();
        System.out.println("There are " + debbie.convertFeetToMeters(feet) + " meters in " + feet + " feet!");
        System.out.println();

        System.out.print("What is your favorite number?");
        int yourNum = scan.nextInt();
        debbie.favoriteNumber(yourNum);
        System.out.println();

        System.out.print("Now give me a random number!");
        int num1 = scan.nextInt();
        System.out.print("Another one please!");
        int num2 = scan.nextInt();
        System.out.print("Last one, I promise!");
        int num3 = scan.nextInt();
        System.out.println("The sum of your numbers is " + debbie.addNumbers(num1, num2, num3) + "!");
        System.out.println();

        debbie.relax();
        System.out.println();

        System.out.print("How many siblings do you have?");
        int sib = scan.nextInt();
        System.out.println(debbie.siblings(sib));
        System.out.println();

        System.out.println(debbie.goodbye());
    }
}