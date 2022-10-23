@FunctionalInterface
interface Helloable {
    void hi();
}

class Student{
    void greet(final Helloable h) {
        h.hi();
    }
}

class PoliceOfficer {
    void shout(final Helloable h) {
        h.hi();
    }
}

class Main {
    public static void main(final String[] args) {
        PoliceOfficer p = new PoliceOfficer();
        p.shout(() -> System.out.println("FREEZE"));

        Student s = new Student();
        s.greet(() -> {
            System.out.println("Hi I study at bcit");
        });

        Student s2 = new Student();
        s2.greet(() -> {
            System.out.println("Leave me alone i'm studying");
            for(int i = 0; i < 3; i++) {
                System.out.println("Whatever");
            }
        });
    }
}
