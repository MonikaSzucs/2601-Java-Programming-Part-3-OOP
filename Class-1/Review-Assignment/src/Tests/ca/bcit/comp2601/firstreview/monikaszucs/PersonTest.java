package ca.bcit.comp2601.firstreview.monikaszucs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDetails() {
        Name nameOne = new Name("Albert", "Einstein");
        Date birthdateOne = new Date(1879, 3, 14);
        Date deathDateOne = new Date(1955, 4, 18);
        Person albertEinstein = new Person(nameOne, birthdateOne, deathDateOne);

        assertEquals("Albert Einstein (died monday, April 18, 1955) was born on friday, March 14, 1879!", albertEinstein.getDetails());
    }




}