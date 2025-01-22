import java.util.Scanner;
public class Blender implements IBlender {
    Scanner scanner = new Scanner(System.in);

   private int speedMax;
   private int capacity;
   private int SpeedLevel;


    public Blender(int speedMax, int capacity) {
        this.speedMax = speedMax;
        this.capacity = capacity;
        this.SpeedLevel = 0;
    }


    public int getSpeedMax() {
        return this.speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSpeedLevel(int speedLevel) {
        SpeedLevel = speedLevel;
    }


    @Override
    public boolean IsFull() {
        return capacity >= 50;
    }
    

    @Override
    public void Fill(){
        if (IsFull() == true) {
            System.out.println("La licuadora ya está llena");
        } else {
            setCapacity(50);
        }
    }

    @Override
    public void Empty() {
        if (IsFull() == true) {
            setCapacity(0);
        } else {
            System.out.println("La licuadora ya está vacía");
        }
            
    }
    
    @Override
    public void SpeedUp() {
        if (SpeedLevel < speedMax) {
            SpeedLevel++;
        } else {
            System.out.println("Ya está a Máxima potencia");
        }
        
    }

    @Override
    public void SpeedDown(){
        if (SpeedLevel > 0) {
            SpeedLevel--;
        } else {
            System.out.println("La licuadora está apagada, no se puede bajar más la potencia");
        }
    }

    @Override
    public int GetSpeed() {
        return SpeedLevel;
    }

}
