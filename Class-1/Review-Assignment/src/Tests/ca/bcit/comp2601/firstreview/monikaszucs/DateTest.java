package ca.bcit.comp2601.firstreview.monikaszucs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDay() {
        Date date = new Date(1977, 10, 31);
        assertEquals(31, date.getDay());
    }

    @Test
    void getMonth() {
        Date date = new Date(1977, 10, 31);
        assertEquals(10, date.getMonth());
    }

    @Test
    void getYear() {
        Date date = new Date(1977, 10, 31);
        assertEquals(1977, date.getYear());
    }

    @Test
    void getYYYYMMDD() {
        Date date = new Date(1977, 10, 31);
        assertEquals("1977-10-31", date.getYYYYMMDD());
    }

    @Test
    void getDayOfTheWeek() {
        Date dateThree = new Date(1820, 3, 15);
        assertEquals("wed", dateThree.getDayOfTheWeek());

        Date date = new Date(1977, 10, 31);
        assertEquals("mon", date.getDayOfTheWeek());

        Date dateTwo = new Date(2021, 3, 15);
        assertEquals("mon", dateTwo.getDayOfTheWeek());

    }
}