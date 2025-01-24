/*
 * Algoritmos y estructuras de datos 
 * Hoja de Trabajo 1
 * Mariana Castañeda 24481
 * Juan Francisco Orozco 24647
 * David López 24730
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Blender licuadora1 = new Blender(6, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ___ Licuadora Inteligente ___ \r\n" + // 
                        "\r\n" + //
                        "1. Prender licuadora\r\n" + //
                        "2. Llenar licuadora\r\n" + //
                        "3. Aumentar velocidad\r\n" + //
                        "4. Disminuir velocidad \r\n" + //
                        "5. Consultar velocidad\r\n" + //
                        "6. Consultar si esta llena\r\n" + //
                        "7. Vaciar licuadora\r\n" + //
                        "8. Salir \r\n" );
        
        Boolean seguir = true;
        while (seguir == true) {
            System.out.println("\nSeleccione una opción:");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                if (licuadora1.GetSpeed() > 0) {
                    System.out.println("\n¡La licuadora ya está encendida!");
                } else {
                    licuadora1.SpeedUp();
                    System.out.println(" ... Licuadora encendida ... ");
                }
            }
            if (opcion == 2) {
                licuadora1.Fill();
                System.out.println(" ... Licuadora llena ... ");

            }
            if (opcion == 3) {
                licuadora1.SpeedUp();
                System.out.println("\nvelocidad nivel " + licuadora1.GetSpeed());
            }
            if (opcion == 4) {
                licuadora1.SpeedDown();
                System.out.println("\nvelocidad nivel " + licuadora1.GetSpeed());
            }
            if (opcion == 5) {
                if (licuadora1.GetSpeed() == 0) {
                    System.out.println("\nLa licuadora está apagada");
                } else if(licuadora1.GetSpeed() == licuadora1.getSpeedMax()){
                    System.out.println("\nLa licuadora se encuentra a máxima velocidad\n\nvelocidad nivel " + licuadora1.GetSpeed());
                }else {
                    System.out.println("\nLa licuadora está en la velocidad " + licuadora1.GetSpeed());
                }
            }
            if (opcion == 6) {
                if (licuadora1.IsFull() == true) {
                    System.out.println("La licuadora se encuentra llena");
                } else {
                    System.out.println("La licuadora se encuentra vacia");
                }
            }
            if (opcion == 7) {
                licuadora1.Empty();
                System.out.println("\n ... Licuadora vaciada ... ");
            }
            if (opcion == 8) {
                System.out.println("Saliendo... Gracias por utilizar el programa");
                seguir = false;
            }
            if (opcion > 8 ||  opcion < 1) {
                System.out.println("ERROR: Ingrese una opción válida");
            }
            
            }
        
        }
    }
