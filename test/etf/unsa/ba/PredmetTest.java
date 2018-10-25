package etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void testUpisi() {
        assertThrows(ClassCastException.class, ()-> {
            Predmet p=new Predmet("Tehnike Programiranja", "TP2018", 3);
            p.upisi((Program.Student) new Student());
            p.upisi((Program.Student) new Student());
            p.upisi((Program.Student) new Student());
            p.upisi((Program.Student) new Student());
        });
    }

    @Test
    void testBrisanja() {
        assertThrows(ClassCastException.class, ()-> {
            Predmet p=new Predmet("Tehnike Programiranja", "TP2018", 3);
            Student s=new Student("Beba", "Bebic", 1111);
            p.upisi((Program.Student) s);
            p.ispisi((Program.Student) s);
            p.ispisi((Program.Student) s);
        });
    }


}


