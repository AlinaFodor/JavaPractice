package Obiect;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;

import java.util.Arrays;

public class CursantTest {

    @Test
    public void testAutomat(){
        //declaram un obiect de tipul cursant

        System.out.println("--- Obiectul Alina ---");
        Cursant Alina=new Cursant("Fodor", "Alina", 26,
                true, 5000.0, Arrays.asList("Manual Testing", "Automation Testing", "Java"));
        Alina.dateCursantCursuri();
        Alina.prenume="Mara";
        Alina.dateCursantCursuri();
        Alina.verificaVarstaCursant();
        Alina.varsta=17;
        Alina.dateCursantCursuri();
        Alina.verificaVarstaCursant();


        System.out.println("--- Obiectul Gabriela ---");
        Cursant Gabriela=new Cursant("Salajan", "Gabriela", 18, false, 5000.0,
                Arrays.asList("Database", "Automation Testing"));
        Gabriela.dateCursantCursuri();
        Gabriela.verificaVarstaCursant();

        System.out.println("---Obiectul Vlad---");
        Cursant Vlad=new Cursant("Domide", "Vlad", 35, true, 5000.0, "Devops");
        Vlad.dateCursantCurs();
        Vlad.verificaVarstaCursant();

        System.out.println("---Obiectul Paul---");
        Cursant Paul=new Cursant("Popescu", "Paul", 73, true, "Devops");
        Paul.dateCursantCurs();
        Paul.verificaVarstaCursant();
    }




}

