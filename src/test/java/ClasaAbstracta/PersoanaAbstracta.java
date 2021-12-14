package ClasaAbstracta;

public abstract class PersoanaAbstracta {
    //clasa abstracta poate sau nu sa contina metode abstracte
    //clasa care extinde o clasa abstracta trebuie sa implementeze toate metodele abstracte
    //Intr-o clasa abstracta poti sa declari un constructor insa nu poti face un obiect
    //Putem mosteni o singura clasa
    //o clasa abstracta poate sa implementeze o interfata, insa o interfata nu poate sa extinda o clasa abstracta
    //o interfata poate sa extinda o alta interfata
    //o clasa abstracta poate sa extinda o alta clasa abstracta


    public abstract void invata();
    public abstract void mergeLaCurs();

    public abstract void munceste();
    public abstract void primesteSalar();

    public void detaliiVarsta(Integer varsta){
        if (varsta > 18){
            System.out.println("persoana este majora");
        }
    }




}
