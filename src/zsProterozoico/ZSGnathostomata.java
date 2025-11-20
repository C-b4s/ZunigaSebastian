package zsProterozoico;

public abstract class ZSGnathostomata {
    
    //Refactorizacion
    private String zsNombreGnathostomata;

    public String zsGetNombreGnathostomata() {
        return zsNombreGnathostomata;
    }

    public void zsSetNombreGnathostomata(String zsNombreGnathostomata) {
        if (zsNombreGnathostomata == null || zsNombreGnathostomata.isEmpty()){
            System.out.println("\n============== ERR0R ==============");
            System.out.println("El nombre no puede estar vacío\n");
        }else this.zsNombreGnathostomata = zsNombreGnathostomata;
    }

    public ZSGnathostomata(String zsNombreGnathostomata){

        simularCargaSpinner();

        this.zsNombreGnathostomata = "Gnathostomata";
        
        System.out.print("|*| ");
        System.out.print("-".repeat(4) + " ");
        System.out.println(zsNombreGnathostomata);
    }

    //Refactorizacion:
    public void simularCargaSpinner(){
        int pasos = 100;
        int milisegundos = 50;
        char[] signos = {'\\','|', '/', '-','|'};
        
        for (int i = 0; i <= pasos; i++) {
            int signoIndice = i % 5;
            System.out.print("\rCargando " + signos[signoIndice] + " " + i + "%");
            try {
                Thread.sleep(milisegundos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga Completa.");
    }
}   
