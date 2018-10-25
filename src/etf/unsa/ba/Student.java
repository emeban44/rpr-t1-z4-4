package etf.unsa.ba;

public class Student {

    private String ime = "Niko";
    private String prezime = "Nikic";
    private int brindeksa = 0;

    public Student(String n, String p, int br) {
        ime = n;
        prezime = p;
        brindeksa = br;
    }

    public Student() {
        ime = "Niko";
        prezime = "Nikic";
        brindeksa = 0;
    }

    public String toString() {
        return getPrezime() + " " + getIme() + " (" + getBrindeksa() + ")";
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrindeksa() {
        return brindeksa;
    }

    public void setBrindeksa(int brindeksa) {
        this.brindeksa = brindeksa;
    }
}
