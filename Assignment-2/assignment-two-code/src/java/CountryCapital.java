class CountryCapital {
    private String country;
    private String capital;

    CountryCapital(final String country, final String capital) {
        this.country = country;
        this.capital = capital;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "CountryCapital{" +
                "country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
