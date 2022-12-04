public class Province {
    private final String name;
    private final int population;
    private static final int NONE = 0;

    public Province(final String name, final int population) {
        if(population < NONE) {
            throw new IllegalArgumentException("bad population");
        }
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}
