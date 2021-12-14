package Mostenire_Incapsulare;

import org.junit.Test;

import java.util.Arrays;

public class MostenireTest {
    @Test
    public void testAutomat(){
        Audi Q5=new Audi("Hatchback",5, 5, "MQB",
                2.0,"manuala", "benzina","Q5", Arrays.asList("Radio","Panoramic","Servo"),
                5000.0);
        Q5.configuratieMasina();

        Audi A6=new Audi("Berlina",5, 3, "MQB",
                2.0,"automata", "benzina","A6", Arrays.asList("Panoramic","Servo"),
                23000.0);
        A6.configuratieMasina();

        VW Golf4=new VW ("Hatchback", 5, 5, "MQB",
                2.0,"automata", "benzina","Germania", 4000.0,
                Arrays.asList("Climatronic", "incalzire in volan"), "Golf4");

        Golf4.ConfiguratieMasina();

        Golf4.AfiseazaOrigine();
        Golf4.setModel("Golf5");
        Golf4.ConfiguratieMasina();




    }
}
