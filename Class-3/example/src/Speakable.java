import java.util.List;

public interface Speakable {
    // all data inside an interface is
    // automatically public, static and final
    // whether or not it is labeled that way

    int MIN_DB = 0; // also: public static and final

    // this one you must override
    void speak(); // also: public and abstract

    // default means concrete and not abstract
    /**
     *
     * @return the absolute min Decibel level
     */
    default int getMinDb(){
        return MIN_DB;
    }
}
