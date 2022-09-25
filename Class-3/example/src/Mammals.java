import java.util.List;

public abstract class Mammals implements  Speakable, Moveable {


    @Override
    public void speak(){

        System.out.println("making mouth noises");
    }
}
