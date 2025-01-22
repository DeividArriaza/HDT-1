import java.util.Scanner;
public class Blender implements IBlender {
    Scanner scanner = new Scanner(System.in);

   private int speedLevel;
   private int capacity;


    public Blender(int speedLevel, int capacity) {
        this.speedLevel = speedLevel;
        this.capacity = capacity;
    }


    public int getSpeedLevel() {
        return this.speedLevel;
    }

    public void setSpeedLevel(int speedLevel) {
        this.speedLevel = speedLevel;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    Blender blender = new Blender(0, 50);

    @Override
    public void SpeedUp(){
        if (speedLevel <= 10)
        speedLevel = blender.getSpeedLevel() + 1;

    }

    @Override
    public boolean IsFull(){
        if(capacity < 50){
            System.out.println("La licuadora esta vacia");
            return false;
        }
        else{
            System.out.println("!Cuidado, la licuadora esta llena!");
            return true;   
        }
    }

    @Override
    public void Fill(){
        System.out.println("¿Que ingrediente desea agregar?");
        String producto = scanner.nextLine();
        System.out.println("¿Que cantidad (onzas) desea agregar?");
        int cantidad = scanner.nextInt();
        if (capacity > 50){

        }

    }

    @Override
    public void Empty(){

    }

    @Override
    public void SpeedDown(){

    }

    @Override
    public int GetSpeed(){

        return 0;
    }
}
