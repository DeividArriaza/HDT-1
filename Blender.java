public class Blender {
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

}
