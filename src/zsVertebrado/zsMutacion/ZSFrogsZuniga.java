package zsVertebrado.zsMutacion;

//Refactorizacion:
public class ZSFrogsZuniga {
    private String zsNombreFrogZuniga;

    public String getZsNombreFrogZuniga() {
        return zsNombreFrogZuniga;
    }

    public void setZsNombreFrogZuniga(String zsNombreFrogZuniga) {
        if (zsNombreFrogZuniga == null || zsNombreFrogZuniga.isEmpty()){
            System.out.println("\n============== ERR0R ==============");
            System.out.println("El nombre no puede estar vacío\n");
        }else this.zsNombreFrogZuniga = zsNombreFrogZuniga;
    }

    public ZSFrogsZuniga (String zsNombreFrogZuniga){
        this.zsNombreFrogZuniga = "FrogsZuniga";
    }

}
