package AbstractizareInterfata;

public class Persoana_Angajat_Student_Interface extends Persoana_Interface implements I_Angajat, I_Student{

    public Persoana_Angajat_Student_Interface(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul " + nume +"  " + prenume+ " " + "munceste!");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul " + nume +"  " + prenume+ " " + "primeste salar!");
    }

    @Override
    public void invata() {
        System.out.println("Student" + nume +"  " + prenume+ " " + "invata!");
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Student" + nume +"  " + prenume+ " " + "merge la curs!");
    }
}
