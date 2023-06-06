import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String name = Scanner.nextLine();
        System.out.println("What would you like to order today? ");
        String order = Scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Ok " + name + " your " + order + " will be ready shortly please wait.");
    }
}
