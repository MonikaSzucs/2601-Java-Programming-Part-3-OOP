import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tester implements MovableAdapter{
    private final Movable bugattiVeyron;
    private Movable luxuryCars;

    Tester(Movable bugattiVeyron) {
        this.bugattiVeyron = bugattiVeyron;
    }

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        PrimeMinister primeMinisterOne;
        PrimeMinister primeMinisterTwo;
        PrimeMinister primeMinisterThree;
        PrimeMinister primeMinisterFour;

        primeMinisterOne = PrimeMinister.getInstance("Justin", "Trudeau");
        primeMinisterTwo = PrimeMinister.getInstance("Stephen", "Harper");
        primeMinisterThree = PrimeMinister.getInstance("Paul", "Martin");
        primeMinisterFour = PrimeMinister.getInstance("Jean", "Chretien");

        System.out.println(primeMinisterOne);
        System.out.println(primeMinisterTwo);
        System.out.println(primeMinisterThree);
        System.out.println(primeMinisterFour);

        BugattiVeyron bv;
        bv = new BugattiVeyron();

        System.out.println(bv.getSpeed());

        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile("\\files\\countries.txt")));
        textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile("\\files\\countries.txt")));

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

    @Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new Tester(bugattiVeyron);

        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
    }

}


