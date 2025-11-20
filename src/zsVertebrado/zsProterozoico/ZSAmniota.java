package zsVertebrado.zsProterozoico;

public abstract class ZSAmniota extends ZSTetrapoda{
    
    //Refactorizacion:
    private String zsNombreAmniota;

    public String zsGetNombreAmniota() {
        return zsNombreAmniota;
    }

    public void zsSetNombreAmniota(String zsNombreAmniota) {
        if (zsNombreAmniota == null || zsNombreAmniota.isEmpty()){
            System.out.println("\n============== ERR0R ==============");
            System.out.println("El nombre no puede estar vacío\n");
        }else this.zsNombreAmniota = zsNombreAmniota;
    }

    public ZSAmniota(String zsNombreAmniota){

        super(zsNombreAmniota);
        this.zsNombreAmniota = "Gnathostomata";

        simularCargaSpinner();
        System.out.print("|*| ");
        System.out.print("-".repeat(4) + " ");
        System.out.println(zsNombreAmniota);
    }
}
