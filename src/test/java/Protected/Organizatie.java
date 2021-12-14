package Protected;

public class Organizatie extends Voluntar {
    public Organizatie(String nume, String prenume) {
        super(nume, prenume);
    }

    public void habarNam(){
        metoda();
        metodaProtected();
        metodaDefault();
    }
}
