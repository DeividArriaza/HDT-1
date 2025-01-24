import org.junit.Assert;
import org.junit.Test;

public class BlenderTest {
    @Test
    public void testIsFull() {
        Blender blendTest = new Blender(6, 50); 
        Assert.assertEquals(false, blendTest.IsFull()); //Verificar si se cumple el método isTrue
    }

    @Test
    public void testSpeedUp() {
        Blender upBlender = new Blender(6, 50);
        upBlender.SpeedUp();
        Assert.assertEquals(0, upBlender.GetSpeed());
    }

    @Test
    public void testSpeedDown() {
        Blender downBlender = new Blender(6, 50);
        downBlender.SpeedUp();
        downBlender.SpeedUp();
        downBlender.SpeedDown();
        Assert.assertEquals(0, downBlender.GetSpeed()); 
    }
}

