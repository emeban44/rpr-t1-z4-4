package etf.unsa.ba;
public class Predmet {
    private String naziv = "Nepostojeci predmet";
    private int sifra = 0;
    private int maxbrstudenata = 0;
    private Program.Student[] nizStudenata = null;
    private int brojStudenata = 0;

    public Predmet(){
        naziv = "Tehnike Programiranja";
        sifra = 0;
        maxbrstudenata=0;

    }

    public Predmet(String n, int s, int br) {
        naziv = n;
        sifra = s;
        maxbrstudenata = br;
        nizStudenata = new Program.Student[maxbrstudenata];
        brojStudenata = 0;
    }

    public Predmet(String tehnike_programiranja, String tp2018, int br) {
        naziv = "Nepostojeci predmet";
        sifra = 0;
        maxbrstudenata = 0;
        nizStudenata = new Program.Student[maxbrstudenata];
        brojStudenata = 0;
    }

    public void upisi(Program.Student s) {
        if (brojStudenata < maxbrstudenata) {
            nizStudenata[brojStudenata] = (Program.Student) s;
            brojStudenata++;
            System.out.println("Student je uspjesno upisan");
        } else {
            System.out.println("Predmet je popunjen, nemoguce upisati studenta");
        }
    }

    public void ispisi(Program.Student s) {
        if (brojStudenata > 0) {
            boolean ima = false;
            for (int i = 0; i < brojStudenata; i++) {
                if (s.getBrindeksa() == nizStudenata[i].getBrindeksa()) {
                    for (int j = i; j < brojStudenata - 1; j++)
                        nizStudenata[j] = nizStudenata[j + 1];
                    brojStudenata--;
                    ima = true;
                    break;
                }
            }
            if (!ima)
                System.out.println("Student nije upisan na predmet, nemoguce ispisati studenta");
            else
                System.out.println("Student je uspjesno ispisan");
        } else
            System.out.println("Predmet nema upisanih studenata");
    }

    public void ispisiStudente() {
        for (int i = 0; i < brojStudenata; i++)
            System.out.println((i + 1) + ". " + nizStudenata[i]);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public int getMaxbrstudenata() {
        return maxbrstudenata;
    }


}