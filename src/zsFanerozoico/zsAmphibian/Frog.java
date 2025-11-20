package zsFanerozoico.zsAmphibian;

import zsFanerozoico.ISaludos;
import zsProterozoico.ZSTetrapoda;

public class Frog extends ZSTetrapoda implements ISaludos{
    private String zsNombreFrog;

    public String zsGetNombreFrog() {
        return zsNombreFrog;
    }

    public void zsSetNombreFrog(String zsNombreFrog) {
        if (zsNombreFrog == null || zsNombreFrog.isEmpty()){
            System.out.println("\n============== ERR0R ==============");
            System.out.println("El nombre no puede estar vacío\n");
        }else this.zsNombreFrog = zsNombreFrog;
    }

    public Frog(String zsNombreFrog){
        super(zsNombreFrog);
        this.zsNombreFrog = "Saltitos";

        System.out.print("|*|");
        System.out.println("Mi nombre es " + this.zsNombreFrog);

    }

    public String zsSaludar(String paralelo){
        return this.zsNombreFrog + " saluda al paralelo " + paralelo;
    }

    public String zsSaludar(String paralelo, String estudiante){
        return this.zsNombreFrog + " saluda al paralelo " + paralelo + " y a mi querido amigo " + estudiante;
    }
}
