public class Main {
    public static void main(String[] args) {
        //100000
        Singleton j =  Singleton.getInstance();
        j.modifyString("my string here");


        //22000
        Singleton s = Singleton.getInstance();

        s.printIt();
        j.printIt();
        SingletonUser k= new SingletonUser();
    }
}
