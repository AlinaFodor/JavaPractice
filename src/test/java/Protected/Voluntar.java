package Protected;

public class Voluntar {
    //Protected= vizibil in clasa parinte + clasa copil
    //default= vizibil in clasa parinte + clasa copil cu conditia sa fie in interiorul pachetului
   // protected= vizibil in momentul in care declaram un obiect intr-o alta clasa (din acelasi pachet)
    // protected= nu e vizibil in momentul in care declaram un obiect intr-o alta clasa (dintr-un pachet diferit)
    // default= vizibil in momentul in care declaram un obiect intr-o alta clasa (din acelasi pachet)
    // default= nu e vizibil in momentul in care declaram un obiect intr-o alta clasa (dintr-un pachet diferit)


    public String nume;
    public  String prenume;

    public Voluntar(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;

        public void metodaPublica() {
            System.out.println("Public");
        }

        private void metodaPrivata() {
            System.out.println("Privat");
        }

        protected void metodaProtected(){
            System.out.println("Protejat");
                }
        void metodaDefault(){
            System.out.println("Implicit");
        }


        
    }
}
