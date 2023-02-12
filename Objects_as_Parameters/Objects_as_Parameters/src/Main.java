class Tiger{
    String name;
    int age;

    Tiger(String name, int age){
        this.name = name;
        this.age = age;
    }
    Tiger(){
        this.name = null;
        this.age = -1;
    }
    Tiger(Tiger object){
        this.name = object.name;
        this.age = object.age;
    }

    public String getName() {
        if (this.name == null){
            return "You didn't provide a name.";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void talk(){
        System.out.println("Hi, I'm " + this.name + " the tiger, nice to meet you.");
        System.out.println("and I'm " + this.age + " years old.");
    }

    }

public class Main {
    public static void main(String[] args) {

        Tiger tiger1 = new Tiger();
        tiger1.talk();

        Tiger tiger2 = new Tiger(tiger1);
        tiger2.setAge(10);
        tiger2.talk();



    }
}
