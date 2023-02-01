import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

/*        String katy = "Katy";

        switch(katy){
            case "Bob":
                System.out.println("Bob");
                break;
            case "Clara":
                System.out.println("Clara");
                break;
            case "John":
                System.out.println("John");
                break;
            default:
                System.out.println("You're not in the list");*/

        int month = 9;
        String season = null;

        switch(month){

            case 12:
            case 1:
            case 2:
                System.out.println("Summer");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Autumn");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Winter");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Spring");

            default:
                System.out.println("This month doesn't even exist");



        }
    }
}
