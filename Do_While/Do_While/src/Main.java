import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        char choice;
        do{
            System.out.println("Option one: Green");
            System.out.println("Option two: Blue");
            System.out.println("Option three: Red");
            System.out.println("Option four: Yellow");
            System.out.println("Option five: Purple");

            choice = (char) System.in.read();

        }while(choice < '1' || choice > '5');

        switch(choice){

            case '1':
                System.out.println("You chose Green");
                break;
            case '2':
                System.out.println("You chose Blue");
                break;
            case '3':
                System.out.println("You chose Red");
                break;
            case '4':
                System.out.println("You chose Yellow");
                break;
            case '5':
                System.out.println("You chose Purple");
                break;
        }
    }
}
