package zsVertebrado.zsProterozoico;

public abstract class ZSSarcopterygii extends ZSOsteichthyes{

    //Refactorizacion:
    private String zsNombreSarcopterygii;

    public String getZsNombreSarcopterygii() {
        return zsNombreSarcopterygii;
    }

    public void setZsNombreSarcopterygii(String zsNombreSarcopterygii) {
        if (zsNombreSarcopterygii == null || zsNombreSarcopterygii.isEmpty()){
            System.out.println("\n============== ERR0R ==============");
            System.out.println("El nombre no puede estar vacío\n");
        }else this.zsNombreSarcopterygii = zsNombreSarcopterygii;
    }

    public ZSSarcopterygii (String zsNombreSarcopterygii){

        super("Osteichthyes");
        this.zsNombreSarcopterygii = "Sarcopterygii";

        simularCargaSpinner();
        System.out.print("|*| ");
        System.out.print("-".repeat(20) + " ");
        System.out.println(zsNombreSarcopterygii);
    }


}
