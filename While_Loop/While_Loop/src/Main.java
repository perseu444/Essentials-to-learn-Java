public class Main {

    public static void main(String[] args) {
        /*int number = 1;

        while(number <= 100){
            System.out.println(number);
            number++;*/

        double[] test_scores = {23.50, 55.0, 75.50, 88.90, 100.00, 15.00};
        int index = 0;

        while (index < test_scores.length){
            System.out.println("Score: " + test_scores[index]);
            if (test_scores[index] < 50){
                System.out.println(test_scores[index] + " is a Bad score");
            }else{
                System.out.println(test_scores[index] + " is a Good score");
            }
            index++;
        }
    }
}
