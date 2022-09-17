package ca.bcit.comp2601.lesson1.monikaszucs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p;

    @BeforeEach
    void setUp() {
        p = new Person("Woods");
    }

    @AfterEach
    void tearDown() {
        p = null;
    }

    @Test
    void getLastName() {
        assertEquals("Woods", p.getLastName());
    }
}