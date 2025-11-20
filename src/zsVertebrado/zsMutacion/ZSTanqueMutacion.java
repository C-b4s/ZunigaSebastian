package zsVertebrado.zsMutacion;

import zsVertebrado.zsFanerozoico.zsAmphibian.Frog;

public class ZSTanqueMutacion implements IZSInteligenciaArtificial{

    public String zsMutarFrog(Frog zsSaltitos, boolean zsSePuedeMutacion){

        if (zsSePuedeMutacion){
            ZSFrogsZuniga zsFrogMutado = new ZSFrogsZuniga("FrogsZuniga");
            return zsFrogMutado.getZsNombreFrogZuniga();
        }
        return "Mutacion fallida";
    }
}
