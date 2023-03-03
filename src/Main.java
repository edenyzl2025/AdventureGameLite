import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int pointCounter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oh! You've awakened! Would you like a briefing of where you are?");
        int i = 0;
        while (i < 1) {
            String userInput = scanner.next();
            if (userInput.equals("yes")) {
                System.out.println("You are currently on Planet Cookie! Your home planet! And you're a frog! With a jetpack! And your jetpack can propel you out into space! \nFor your convenience, I recommend typing all commands in lowercase! Begin below! (if you need a hint, try 'hint')");
                i++;
            } else if (userInput.equals("no")) {
                System.out.println("Alright then, let the game begin!");
                i++;
            } else {
                System.out.println("This isn't a command I understand. Please enter either yes or no to proceed.");
            }
        }
        pointCounter = planetCookie(pointCounter);


//        System.out.println("You have won! With a grand total of "+pointCounter+" points!");

    }

    public static int planetCookie(int pointCounter) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        while(!userInput.equals("take off")) {
            //commands like jump or wtv using if loops
            if(userInput.equals("jump")==true){
                System.out.println("YAY! you jumped! using your frog legs! now do something else!");
                pointCounter++;
            }
            //command for if user input !equal any viable commands, print this is not a command I understand
            else System.out.println("This isn't a command I understand :(");
            userInput = scanner.nextLine();
        }

    return pointCounter;
    }
}