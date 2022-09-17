class Dolphin extends Mammal{
    Dolphin(final int weightKg, final int yearBorn) {
        super(weightKg, yearBorn);
    }

    @Override
    public void speak(final int times) {
        System.out.println("ee eee ee");
    }


}
