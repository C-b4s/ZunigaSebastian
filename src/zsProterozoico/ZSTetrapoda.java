package zsProterozoico;

public abstract class ZSTetrapoda extends ZSSarcopterygii{

    //Refactorizacion
    private String zsNombreTetrapoda;

    public String zsGetNombreTetrapoda() {
        return zsNombreTetrapoda;
    }

    public void zsSetNombreTetrapoda(String zsNombreTetrapoda) {
        if (zsNombreTetrapoda == null || zsNombreTetrapoda.isEmpty()){
            System.out.println("\n============== ERR0R ==============");
            System.out.println("El nombre no puede estar vacío\n");
        }else this.zsNombreTetrapoda = zsNombreTetrapoda;
    }

    public ZSTetrapoda (String zsNombreTetrapoda){

        super(zsNombreTetrapoda);
        this.zsNombreTetrapoda = "Tetrapoda";
        System.out.print("|*| ");
        System.out.print("-".repeat(28) + " ");
        System.out.println(zsNombreTetrapoda);
    }




}
