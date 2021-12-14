import org.junit.Test;

public class StructuriAlternative {

    //Cele mai intalnite structuri sunt cele alternative si repetitive
    //Structura alternativa= if (conditie) then
    //                                     else


    @Test
    public void testAutomat(){
          verificamNumare();
          verificaNume();
          verificamParitate(8);
          verificamParitate(15);
          verificamParitate(-7);
          verificamParitate(-4);
          afisamZiuaInCurs("Luni");

    }

    //Verificam daca 5>3
    public void verificamNumare(){
        if (5<3){
            System.out.println("Primul numar este mai mare decat al doilea");
        }
        else {
            System.out.println("Primul numar nu este mai mare decat al doilea");
        }
    }

    //Verificam daca Alexandru contine Alex
    public void verificaNume(){
        String nume="Alexandru";
        String continut="Alex";
        if (nume.contains(continut)){
          System.out.println("Continutul se regaseste in nume");
        }
        else{
            System.out.println("Continutul nu se regaseste in nume");
        }

    }


    //Verificam daca un numar e par sau impar sau pozitiv
    public void verificamParitate(Integer numar){
        if (numar%2==0){
            System.out.println("Numarul "+numar+" este par");
        }
        if (numar%2==1){
            System.out.println("Numarul "+numar+" este impar");
        }
        if (numar>0){
            System.out.println("Numarul "+numar+" este pozitiv");
        }
        if (numar<0){
            System.out.println("Numarul "+numar+" este negativ");
        }
        else{
            System.out.println("Salut !!!");
        }
    }


    //Afisam pe consola ziua de astazi
    public void afisamZiuaInCurs(String ziua){
       switch (ziua){
           case "Duminica":
               System.out.println("Astazi e duminica");
               break;
           case "Luni":
               System.out.println("Astazi e luni");
               break;
           case "Marti":
               System.out.println("Astazi e marti");
               break;
       }
    }


}
