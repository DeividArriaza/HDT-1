import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Blender licuadora1 = new Blender(0, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Prende la licuadora\r\n" + //
                        "2. Llena la licuadora con lo que se desea licuar\r\n" + //
                        "3. Incrementa velocidad\r\n" + //
                        "4. Consulta en que velocidad esta la licuadora\r\n" + //
                        "5. Consulta si la licuadora esta llena.\r\n" + //
                        "6. Vaciar la licuadora\r\n" + //
                        "7. Salir \r\n" + //
                        "8. menos velocidad"
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
                licuadora1.GetSpeed();
            }
            if (opcion == 5) {
                if (licuadora1.IsFull() == true) {
                    System.out.println("La licuadora está llena");
                } else {
                    System.out.println("La licuadora no está llena");
                }
            }
            if (opcion == 6) {
                licuadora1.Empty();
                System.out.println("La licuadora no está llena");
            }
            if (opcion == 7) {
                System.out.println("Saliendo... Gracias por usar el programa");
                seguir = false;
            }
            if (opcion > 7 ||  opcion < 1) {
                System.out.println("Ingrese una opción válida");
            }
            if (opcion == 8) {
                licuadora1.SpeedDown();
            }
        }
        
    }
}