public class Blender implements IBlender {
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
        speedLevel = blender.getSpeedLevel() + 1;

    }

    @Override
    public boolean IsFull(){
        if(capacity == 50){
            System.out.println("¡Cuidado, licuadora llena!");
        }
        else{
            
        }
        return true;
    }

    @Override
    public void Fill(){

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
