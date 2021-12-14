package Mostenire_Incapsulare;

import java.util.List;

public class VW extends Masina{
             private String origine;
             private Double pret;
             private List<String> dotari;
             private String model;

    public VW(String caroserie, Integer roti, Integer usi, String sasiu, Double motorizare, String transmisie,
              String combustibil, String origine, Double pret, List<String> dotari, String model) {
        super(caroserie, roti, usi, sasiu, motorizare, transmisie, combustibil);
   this.origine=origine;
   this.pret=pret;
   this.dotari=dotari;

    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "VW{" +
                "caroserie='" + getCaroserie() + '\'' +
                ", roti=" + getRoti()+
                ", usi=" + getUsi()+
                ", sasiu='" + getSasiu() + '\'' +
                ", motorizare=" + getMotorizare() +
                ", transmisie='" + getTransmisie() + '\'' +
                ", combustibil='" + getCombustibil() + '\'' +
                ", origine='" + getOrigine() + '\'' +
                ", pret=" + getPret() +
                ", dotari=" + getDotari() +
                ", model='" + getModel()+ '\'' +
                '}';
    }


    public void ConfiguratieMasina(){
        System.out.println("Masina VW cu modelul:"+ getModel() +"are urmatoarea configuratie");
        System.out.println(toString());

    }

    public void AfiseazaOrigine(){
        System.out.println("Originea modelului" + getModel()+ "este "+ getOrigine());
    }


}
