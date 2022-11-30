public class SingletonUser {

        public String s;
        // Constructor
        // Here we will be creating private constructor
        // restricted to this class itself
        public SingletonUser()
        {
            Singleton s = Singleton.getInstance();
            s.printIt();
        }

}
