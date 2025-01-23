import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Blender licuadora1 = new Blender(6, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Prende la licuadora\r\n" + //
                        "2. Llena la licuadora con lo que se desea licuar\r\n" + //
                        "3. Incrementa velocidad\r\n" + //
                        "4. Disminuye velocidad \r\n" + //
                        "5. Consulta en que velocidad esta la licuadora\r\n" + //
                        "6. Consulta si la licuadora esta llena.\r\n" + //
                        "7. Vaciar la licuadora\r\n" + //
                        "8. Salir \r\n" 
                        );
        
        Boolean seguir = true;
        while (seguir == true) {
            System.out.println("Seleccione una opción");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                if (licuadora1.GetSpeed() > 0) {
                    System.out.println("La licuadora ya está prendida");
                } else {
                    licuadora1.SpeedUp();
                }
            }
            if (opcion == 2) {
                licuadora1.Fill();
                System.out.println("La licuadora está llena");
            }
            if (opcion == 3) {
                licuadora1.SpeedUp();
            }
            if (opcion == 4) {
                licuadora1.SpeedDown();
            }
            if (opcion == 5) {
                if (licuadora1.GetSpeed() == 0) {
                    System.out.println("La licuadora está apagada :)");
                } else if(licuadora1.GetSpeed() == licuadora1.getSpeedMax()){
                    System.out.println("La licuadora está en la Máxima Velocidad!, que es: " + licuadora1.GetSpeed());
                }else {
                    System.out.println("La licuadora está en la velocidad: " + licuadora1.GetSpeed());
                }
            }
            if (opcion == 6) {
                if (licuadora1.IsFull() == true) {
                    System.out.println("La licuadora está llena");
                } else {
                    System.out.println("La licuadora no está llena");
                }
            }
            if (opcion == 7) {
                licuadora1.Empty();
                System.out.println("La licuadora no está llena");
            }
            if (opcion == 8) {
                System.out.println("Saliendo... Gracias por usar el programa");
                seguir = false;
            }
            if (opcion > 8 ||  opcion < 1) {
                System.out.println("Ingrese una opción válida");
            }
            
        }
        
    }
}