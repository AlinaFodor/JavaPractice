package AbstractizareInterfata;

public class Persoana_Interface {
    //Abstractizare= conceptul prin care definim comportamentul unei clase
    //Abstractizarea se poate realiza cu interfete sau clase abstracte
    //se foloseste cuvantul cheie "interface"
    //o clasa implementeaza o interfata
    //o clasa poate implementa mai multe interfete
    //o interfata contine doar metode abstracte
    //nu avem contructor intr-o interfata => nu putem crea obiect dintr-o interfata
    //clasa care implementeaza interfata implementeaza toate metodele din interfata

    public String nume;
    public String prenume;
    public Integer varsta;

    public Persoana_Interface(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public void InfoPersoana(){
        System.out.println("Numele este "+ nume);
        System.out.println("Prenumele este "+ prenume);
        System.out.println("Varsta este "+ varsta);

    }
}
