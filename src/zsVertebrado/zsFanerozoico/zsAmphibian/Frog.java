package zsVertebrado.zsFanerozoico.zsAmphibian;

import zsVertebrado.zsFanerozoico.IZSSaludos;
import zsVertebrado.zsProterozoico.ZSTetrapoda;

public class Frog extends ZSTetrapoda implements IZSSaludos{
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
        super("Tetrapoda");
        this.zsNombreFrog = "Saltitos";
        System.out.println();
        System.out.print("\n|*|");
        System.out.println("Mi nombre es " + this.zsNombreFrog + "\n");

    }

    //Refactorizacion:
    public String zsSaludar(String zsParalelo){
        return this.zsNombreFrog + " saluda al paralelo " + zsParalelo + "\n";
    }

    public String zsSaludar(String zsParalelo, String zsEstudiante){
        return this.zsNombreFrog + " saluda al paralelo " + zsParalelo + " y a mi querido amigo " + zsEstudiante + "\n";
    }
}
