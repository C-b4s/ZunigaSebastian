package zsProterozoico;

public abstract class ZSOsteichthyes extends ZSGnathostomata {
    
    //Refactorizacion
    private String zsNombreOsteichthyes;

    public String zsGetNombreOsteichthyes() {
        return zsNombreOsteichthyes;
    }

    public void zsSetNombreOsteichthyes(String zsNombreOsteichthyes) {
        if (zsNombreOsteichthyes == null || zsNombreOsteichthyes.isEmpty()){
            System.out.println("\n============== ERR0R ==============");
            System.out.println("El nombre no puede estar vacío\n");
        }else this.zsNombreOsteichthyes = zsNombreOsteichthyes;
    }

    public ZSOsteichthyes (String zsNombreOsteichthyes){
        super(zsNombreOsteichthyes);
        this.zsNombreOsteichthyes = "Osteichthyes";
        System.out.print("|*| ");
        System.out.print("-".repeat(12) + " ");
        System.out.println(zsNombreOsteichthyes);
    }


}
