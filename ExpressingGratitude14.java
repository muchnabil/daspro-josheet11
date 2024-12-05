import java.util.Scanner;
public class ExpressingGratitude14 {
    public static String getGreetingsRecipient(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = sc.nextLine();
        sc.close();
        return recipientName;
    }
    public static void sayThankyou(String greet){
        String name = getGreetingsRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world. \n" + 
        "You inspired in me love for learning and made me feel like i could ask you anything.");
        System.out.println("The Blade is " + greet);
    }
    public static void main(String[] args) {
        sayThankyou("Me");
    }
}