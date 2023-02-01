public class Main {

    public static void main(String[] args) {

        int myAge = 20;
        int requiredAge = 21;

        /*if (myAge == requiredAge){
            System.out.println("I'm cool");

        }else{
            System.out.println("You're not cool");
        }*/
        
        if(myAge < 18){
            System.out.println("You're a minnor.");
        }else if(myAge >= 18 && myAge < 80){
            System.out.println("You're an adult.");
        }else if(myAge >= 80 && myAge < 100){
            System.out.println("You're old.");
        }else{
            System.out.println("You're dead...");

        }
    }
}
