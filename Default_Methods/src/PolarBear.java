public class PolarBear implements Animal{ //PolarBear implements Animal...

    public void walking(){ //It is the walk method from interface Animal...
        System.out.println("Walking...");
    }

    public void talk(){ //Override class from the father to the son (subclass)
        System.out.println("Now the Bear is talking...");

    }
}
