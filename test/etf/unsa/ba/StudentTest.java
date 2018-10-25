package etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StudentTest {

    @Test
    void getIme() {
        Student s= new Student();
        String novi = "Nikic Niko (0)";

        assertEquals( s.toString(), novi);

    }
}