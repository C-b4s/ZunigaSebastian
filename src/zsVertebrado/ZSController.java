package zsVertebrado;

import java.util.Random;
import java.util.Scanner;

import zsVertebrado.zsFanerozoico.zsAmphibian.Frog;
import zsVertebrado.zsMutacion.ZSTanqueMutacion;

//Refactorizacion:
public class ZSController {

    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";

    Scanner ingresoDatos = new Scanner(System.in);

    public void inicializar(){
        System.out.println(AMARILLO + "¡Bienvenido al sistema de analisis y clasificacion de vertebrados" + RESET);


        System.out.println(VERDE + "\n---------- ARBOL FILOGENÉTICO: ----------\n" + RESET);
        Frog zsSaltitos = new Frog("Saltitos");
        
        
        System.out.println(VERDE + "\n---------- SALUDOS DE " + zsSaltitos.zsGetNombreFrog() + ": ----------\n" + RESET);
        String saludoUno = zsSaltitos.zsSaludar("GR2SW");
        String saludoDos = zsSaltitos.zsSaludar("GR2SW", "Sebastián");

        System.out.println(saludoUno);
        System.out.println(saludoDos);
        

        
        System.out.println(VERDE + "\n---------- MUTACION DE FROGS ----------\n" + RESET);
        ZSTanqueMutacion zsTanqueMutacion = new ZSTanqueMutacion();

        System.out.println("¿Es posible realizar mutación de Frogs y Zuniga?");

        String respuestaUsuario;
        do{
            System.out.print("Respuesta: ");
            respuestaUsuario = ingresoDatos.nextLine();
            if (!respuestaUsuario.equalsIgnoreCase("si") && !respuestaUsuario.equalsIgnoreCase("no")){
                System.out.println(ROJO + "\n============== ERR0R ==============");
                System.out.println("Respuesta inválida. Por favor, ingrese 'si' o 'no'.\n" + RESET);
            }
        }while (!respuestaUsuario.equalsIgnoreCase("si") && !respuestaUsuario.equalsIgnoreCase("no"));
        
        if(respuestaUsuario.equalsIgnoreCase("si")){
            
            Random aleatorio = new Random();
            int mSvAleatorioUno = aleatorio.nextInt(100,1001);
            int mSvAleatorioDos = aleatorio.nextInt(mSvAleatorioUno + 1,1001);

            String mensajeMutacion = zsTanqueMutacion.zsMutarFrog(zsSaltitos,true);
            System.out.println("Procesando...\n");
            System.out.println("\n" + AMARILLO + "Mutación en proceso: ------------------              " + mSvAleatorioUno + " de " + mSvAleatorioDos +" (mSv)" + RESET);
            System.out.println("|*|" + "-".repeat(10) + " Frogs");
            System.out.println("|*|" + "-".repeat(20) + mensajeMutacion + "\n");

        }else{
            String mensajeMutacion = zsTanqueMutacion.zsMutarFrog(zsSaltitos,false);
            System.err.println(mensajeMutacion);
        }

        System.out.println("\nGracias por usar el sistema. ¡Hasta luego!\n");
    }

    
}
