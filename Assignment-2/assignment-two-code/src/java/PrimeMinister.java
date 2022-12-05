class PrimeMinister {
    private static PrimeMinister pm;

    static {
        pm = null;
    }

    private PrimeMinister(final String firstName, final String lastName) {

    }

    static PrimeMinister getInstance(final String firstName, final String lastName) {
        if(pm == null) {
            pm = new PrimeMinister(firstName, lastName);
        }

        return pm;
    }


}
