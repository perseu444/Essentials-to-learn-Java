public interface Animal { //It is a interface called Animal

    default void talk(){ //It is a default method called Talk
        System.out.println("Talking...");

    }

    void walking(); //It is a normal method called walking
}
