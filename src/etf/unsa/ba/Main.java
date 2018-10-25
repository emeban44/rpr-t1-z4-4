package etf.unsa.ba;

import java.util.Scanner;

import java.util.*;

public class Predmet {
    private String naziv="Nepostojeci predmet";
    private int sifra=0;
    private int maxbrstudenata=0;
    private Student[] nizStudenata=null;
    private int brojStudenata=0;

    public Predmet(String n, int s, int br){
        naziv=n;
        sifra=s;
        maxbrstudenata=br;
        nizStudenata=new Student[maxbrstudenata];
        brojStudenata=0;
    }

    public Predmet(){
        naziv="Nepostojeci predmet";
        sifra=0;
        maxbrstudenata=0;
        nizStudenata=new Student[maxbrstudenata];
        brojStudenata=0;
    }

    public void upisi(Student s){
        if(brojStudenata<maxbrstudenata) {
            nizStudenata[brojStudenata] = s;
            brojStudenata++;
            System.out.println("Student je uspjesno upisan");
        }
        else{
            System.out.println("Predmet je popunjen, nemoguce upisati studenta");
        }
    }

    public void ispisi(Student s){
        if(brojStudenata>0) {
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
        }
        else
            System.out.println("Predmet nema upisanih studenata");
    }

    public void ispisiStudente(){
        for(int i=0;i<brojStudenata;i++)
            System.out.println((i+1)+". "+nizStudenata[i]);
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

public class Student {

    private String ime="Niko";
    private String prezime="Nikic";
    private int brindeksa=0;

    public Student(String n,String p,int br){
        ime=n;
        prezime=p;
        brindeksa=br;
    }

    public Student(){
        ime="Niko";
        prezime="Nikic";
        brindeksa=0;
    }

    public String toString(){
        return getPrezime()+" "+getIme()+" ("+getBrindeksa()+")";
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

public class Program{

    public static void main(String[] args) {
        Predmet p=new Predmet();
        Student s=new Student();
        for(;;){
            System.out.print("Odaberite zeljenu opciju:\n0 za kraj programa\n1 za kreiranje novog predmeta\n2 za kreiranje novog studenta\n3 za upis studenta na predmet\n4 za ispis studenta sa predmeta\n5 za brisanje studenta\n6 za brisanje predmeta\n7 za ispis spiska studenata na predmetu\nOdabir: ");
            int izbor;
            Scanner ulaz=new Scanner(System.in);
            izbor=ulaz.nextInt();
            if(izbor==0){
                break;
            }
            else if(izbor==1){
                System.out.print("\nUnesite naziv novog predmeta: ");
                ulaz.nextLine();
                String ime=ulaz.nextLine();
                System.out.print("\nUnesite sifru novog predmeta: ");
                int sifra=ulaz.nextInt();
                System.out.print("\nUnesite maksimalan broj studenata novog predmeta: ");
                int br=ulaz.nextInt();
                p=new Predmet(ime,sifra,br);
            }
            else if(izbor==2){
                System.out.print("\nUnesite ime novog studenta: ");
                ulaz.nextLine();
                String ime=ulaz.nextLine();
                System.out.print("\nUnesite prezime novog studenta: ");
                String prezime=ulaz.nextLine();
                System.out.print("\nUnesite broj indeksa novog studenta: ");
                int br=ulaz.nextInt();
                s=new Student(ime,prezime,br);
            }
            else if(izbor==3){
                p.upisi(s);
            }
            else if(izbor==4){
                p.ispisi(s);
            }
            else if(izbor==5){
                s=null;
            }
            else if(izbor==6){
                p=null;
            }
            else if(izbor==7){
                System.out.print("\nStudenti na predmetu "+p.getNaziv()+" su:\n");
                p.ispisiStudente();
            }
        }

    }
}