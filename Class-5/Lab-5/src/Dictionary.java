import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {
    List<String> titles;

    Dictionary() {
        titles = new ArrayList<>();
        String[] data = {
                "jab", "jabbed", "jabber", "jabbered", "jabbering", "jabbers", "jabberwocky",
                "jabbing", "jabot", "jabots", "jabs", "jacaranda", "jacarandas", "jacinth",
                "jack", "jackal", "jackals", "jackanapes","jackanapeses", "jackass","jackasses",
                "jackboot", "jackboots", "jackdaw", "jackdaws", "jacked", "jacket", "jacketed",
                "jacketing", "jackets", "jackhammer", "jackhammers", "jackie", "jacking",
                "jackknife", "jackpot", "jackpots", "jacks", "jackson", "jacksonville", "jaclyn",
                "jacob", "jacobean", "jacobian", "jacobin", "jacobins", "jacobite", "jacobites",
                "jacobs", "jacquard", "jacquards", "jacqueline", "jacques", "jactitation",
                "jactitations", "jactus", "jacuzzi", "jacuzzis", "jade", "jaded", "jadeite",
                "jadeites", "jades", "jading", "jaeger", "jaffa", "jag", "jagged", "jaggedly",
                "jaggedness", "jagger", "jags", "jaguar", "jaguars", "jai", "jail", "jailed",
                "jailer", "jailers", "jailhouse", "jailing", "jailor", "jailors", "jails", "jaipur",
                "jakarta", "jake", "jalopies", "jalopy", "jalousie", "jalousies", "jam", "jamaica",
                "jamaican", "jamaicans", "jamb", "jamboree", "jamborees", "jambs", "james", "jamey",
                "jamie", "jammed", "jamming", "jammy", "jams", "jan", "jane", "janeiro", "janet",
                "jangle", "jangled", "jangles", "jangling", "janice", "janitor", "janitorial",
                "janitors", "january", "januarys", "janus", "japan", "japanese", "japanned",
                "japanning", "japans", "jape", "japed", "japer", "japers", "japery", "japes",
                "japing", "japonica", "japonicas", "jar", "jardiniere", "jardinieres", "jarful",
                "jarfuls", "jargon", "jargons", "jarred", "jarring", "jarringly", "jarrow",
                "jars", "jasmine", "jasmines", "jason", "jasper", "jaspers", "jaundice", "jaundiced",
                "jaunt", "jaunted", "jauntier", "jauntiest", "jauntily", "jaunting", "jaunts", "jaunty",
                "java", "javanese", "javelin", "javelins", "jaw", "jawbone", "jawbones", "jawboning",
                "jawbreaker", "jawbreakers", "jawed", "jawing", "jaws", "jay", "jays", "jayvees",
                "jaywalk", "jaywalked", "jaywalker", "jaywalkers", "jaywalking", "jaywalks",
                "jazz", "jazzed", "jazzes", "jazzier", "jazziest", "jazzing", "jazzman", "jazzmen",
                "jazzy"
        };
        titles = Arrays.stream(data).toList();
    }

    public String getWords(String word, int number, Wordable w) {
        return w.createString(word, number);
    }
}