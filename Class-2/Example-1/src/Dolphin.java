class Dolphin extends Mammal{
    Dolphin(final int weightKg, final int yearBorn) {
        super(weightKg, yearBorn);
    }

    @Override
    public void speak(final int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("ee eee ee");
        }
    }

    @Override
    public void move() {
        System.out.println("swim");
    }
}
