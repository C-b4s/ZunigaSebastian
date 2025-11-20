package zsMutacion;


public class ZSTanqueMutacion implements IZSMutacion{

    public String zsMutarFrog(String nombreFrog){

        //Refactorizacion:
        boolean sePuedeMutacion = true;
        String respuesta = sePuedeMutacion? "FrogZuniga" : "Mutación fallida";
        return respuesta;
    }
}
