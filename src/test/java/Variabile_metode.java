import org.junit.Test;

public class Variabile_metode {

    //Clasa, Variabila, Metoda, Constructor, Obiect
    //1.Clasa=un sablon ce contine variabile, metode, constructor si obiect
    //2.Variabila=atributul unei clase
    //3.Metoda=actiunile unei clase
    //1.Structura clasa=access control class nume clasa {}
    //1.un fisier java poate sa contina mai multe clase
    //1.Numele clasei trebuie sa fie unic
    //2.Tipuri variabile=Global si local
    //2.Variabila globala=este vizibila peste tot in clasa declarata
    //2.Structura variabila globala=access control tip variabila nume variabila;
    //2.O variabila poate sau nu sa primeasca o valoare
    //2.Structura variabila locala=tip variabila nume variabila
    //Exemplu:Declaram variabile in interiorul clasei
    //3.Tipuri de metode=void si return
    //3.In java exista doar metode(declarate in interiorul unei clase) nu si functii
    //3.Metodele pot avea sau nu parametrii
    //3.Structura metoda void=access control void nume metoda(){}
    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public String adresa;
    public Boolean esteAngajat;
    public Double greutate;

    @Test
    public void atribuiValori(){
        nume="Boros";
        prenume="Madalina";
        varsta=26;
        inaltime=1.69;
        adresa="Aurel Vlaicu nr. 36";
        esteAngajat=false;
        greutate=52.00;

System.out.print(nume+" ");
System.out.print(prenume+" ");
System.out.println(esteAngajat+" ");

System. out.println(varsta+" "+inaltime+" "+adresa);

System.out.println(nume);
System.out.println(nume+System.lineSeparator()+prenume);

//Afiseaza pe tastatura mesajul:Cursantul <nume> <prenume> a trimis proiectul la manual.
        System.out.println("Cursantul "+nume+" "+prenume+" "+"a prezentat proiectul la manual");
    System.out.println(greutate);
   //Definim cate zecimale sa ne afiseze pentru o valoare cu punct
        System.out.println (String.format("%.2f",greutate));
        System.out.println(getSalarAngajat());
    }

//returnam salariul unui angajat
    //structura metoda return : public tipul de returnare nume(){return}
    public Double getSalarAngajat(){
        Double salar=1.000;
        Double bonus=500.0;
        Double calcul=salar * bonus;
        return calcul;
    }

}
