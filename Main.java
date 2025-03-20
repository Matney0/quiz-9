import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your favorite color: ");
        String favoriteColor = scanner.next();

        //Output 
        System.out.println("Hello, " + firstName + " " + lastName + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + favoriteColor + ".");
        
    }
}
