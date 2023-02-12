public class Main {
    public static void main(String[] args) {

        class Zebra{
            String name;
            int age;

            //Constructor
            Zebra(String ParamName, int ParamAge){
                System.out.println("Making a new Zebra...");
                name = ParamName;
                age = ParamAge;
                talk();

            }

            void talk(){
                System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
            }
            void ageup(){
                age++;
                System.out.println("I'm now " + age);
            }
        }

        Zebra zebra1 = new Zebra("George", 21);
        Zebra zebra2 = new Zebra("Terry", 22);


    }
}
