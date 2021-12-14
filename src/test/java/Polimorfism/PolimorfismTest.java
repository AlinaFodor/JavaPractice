package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {

    @Test
    public void testAutomat(){
        StudentFF Alex= new StudentFF("Dorha", "Alex", "Strada Fabricii, nr 100");
        Alex.afiseazaInfoStudent();
        Alex.afiseazaInfoInitial();
        Alex.mediaStudentului(5,5);
        Alex.mediaStudentului(6,6,5);

        StudentCF Radu= new StudentCF( "Dora", "Radu", "Strada Lalelelor, nr 100");
        Radu.afiseazaInfoStudent();
        Radu.afiseazaInfoInitial();
        Radu.mediaStudentului(8,5);
        Radu.mediaStudentului(6,9,5);
    }
}
