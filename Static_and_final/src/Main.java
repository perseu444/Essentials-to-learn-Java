
class StaticExample{

    static{
        System.out.println("Static example."); //run every time StaticExample class run
    }






}
public class Main {
    public static void main(String[] args) {

        StaticExample static1 = new StaticExample();

        final int FinalExample = 10; //It can't be changed after set (never)
        // FinalExample = 10; (error)
        System.out.println(FinalExample);



    }
}