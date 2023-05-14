package World.Atmosphere;
public class Sky {

    Ocean ocean1 = new Ocean();

    //We don't need to make a subclass cuase Sky is in the same package as Ocean :)
    void doThings (){
        System.out.println(ocean1.numberOfWaves);
    }



}
