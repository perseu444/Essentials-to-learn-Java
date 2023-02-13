class Number{
    int number;

    Number(int giveMeANumber){
        this.number = giveMeANumber;
    }

    Number square(){
        Number temporaryObject = new Number(this.number * this.number);
        return temporaryObject;
    }

    public int getNumber() {
        return number;
    }
}


public class Main {

    public static void main(String[] args) {

        Number friend = new Number(5);
        Number friend2 = friend.square();
        System.out.println("Old number from the first number " + friend.getNumber());
        System.out.println("New number from the second number " + friend2.getNumber());

    }
}
