public class Main {

    public static void main(String[] args) {

        class Human{
            String name;
            int age;
            boolean isMale;
        }

        Human human1 = new Human();

        human1.name = "Bob";
        System.out.println(human1.name);
        human1.age = 22;
        System.out.println(human1.age);
        human1.isMale = true;
        System.out.println(human1.isMale);

        Human human2 = new Human();

        human2.name = "Sarah";
        System.out.println(human2.name);
        human2.age = 23;
        System.out.println(human2.age);
        human2.isMale = false;
        System.out.println(human2.isMale);

        class Dog{
            String name;
            int age;
            String breed;
        }

        Dog dog1 = new Dog();
        dog1.name = "Hot";
        System.out.println(dog1.name);
        dog1.age = 30;
        System.out.println(dog1.age);
        dog1.breed = "dragon";
        System.out.println(dog1.breed);




    }
}
