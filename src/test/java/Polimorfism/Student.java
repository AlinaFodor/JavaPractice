package Polimorfism;

public class Student {
    //Polimorfism = este de 2 feluri: dinamic/ overriding si statitc/overloading
    //Dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Static = conceptul prin care putem avea mai multe metode cu acelasi nume si diferentierea
    // se face prin nr de parametrii sau tipul de parametrii

    private String nume;
    private String prenume;
    private String adresa;

    public Student(String nume, String prenume, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    //Polimorfismul dinamic
    public  void afiseaza InfoStudent(){
      System.out.println("Detaliile despre student sunt:"+ getNume()+" "+getPrenume()+" "+getAdresa());
    }


}
