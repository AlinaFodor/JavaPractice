package AbstractizareInterfata;

import org.junit.Test;

public class Interface_Test {
    @Test
    public void testAutomat(){
        Persoana_Student_Interface student=new Persoana_Student_Interface("Pop", "Marcel",25);
        student.invata();
        student.mergeLaCurs();

        Persoana_Angajat_Interface angajat=new Persoana_Angajat_Interface("Voda", "Oana", 40);
        angajat.munceste();
        angajat.primesteSalar();

        Persoana_Angajat_Student_Interface StudentAngajat= new Persoana_Angajat_Student_Interface("Duna", "Petru", 34);
        StudentAngajat.invata();
        StudentAngajat.mergeLaCurs();
        StudentAngajat.munceste();
        StudentAngajat.primesteSalar();
    }
}
