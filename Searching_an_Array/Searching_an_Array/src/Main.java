import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String nameList[] = {"Bob", "Billy", "Joe", "Clara", "Mary"};
        System.out.println("Our array: " + Arrays.toString(nameList));
        String toFind = "Joe";

        for(int i = 0; i < nameList.length; i++){
            System.out.println("Checking... " + nameList[i]);
            if(nameList[i].equals(toFind)){
                System.out.println("It matched!");
                break;
            }
        }

    }
}
