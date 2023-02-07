public class Main {

    public static void main(String[] args) {

        class Human{

            void talk(String name, int age){
                System.out.println("I'm "+ name +" and I'm " + age + " years old.");
            }
            int calculate(int one, int two, int three){
                return one * two * three;
            }

        }

        Human human1 = new Human();
        int product1 = human1.calculate(1,2,3);
        human1.talk("Joel", 10);

        Human human2 = new Human();

        int product2 = human2.calculate(4,5,6);
        human2.talk("Sarah",12);

        System.out.println("The first product: " + product1 + " and the second one: " + product2);
    }
}
