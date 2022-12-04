public class EmailSystem {
    public static void main(String args[]) {
        Store n1 = new Store("21Store");
        Subscriber s1 = new Subscriber("Viki");
        Subscriber s2 = new Subscriber("Rachel");
        n1.addSubscriber(s1);
        n1.addSubscriber(s2);
        n1.sendNews("Summer sales!");
        n1.removeSubscriber(s2);
        n1.sendNews("Only in August");
    }
}