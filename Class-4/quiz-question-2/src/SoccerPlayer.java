public class SoccerPlayer implements Comparable<SoccerPlayer>  {
    private String lastName;
    private int jerseyNumber;

    SoccerPlayer(final String lastName, final int jerseyNumber) {
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "lastName='" + lastName + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }

    @Override
    public int compareTo(final SoccerPlayer s) {
        return  s.jerseyNumber - this.jerseyNumber;
    }
}
