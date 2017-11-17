import becker.robots.*;
import java.util.Random;

public class TestAranykereso{
    
    public static void test(){
        City graz = new City();
        Random random = new Random();
        //int mennyiseg = random.nextInt(25+1);
        int mennyiseg = 16;
        for(int i = 0; i < mennyiseg; i++)
        {
            Thing poznak = new Thing(graz,5,1);
        }
        
        
        RobotSE robert = new RobotSE(graz,1,1,Direction.SOUTH);
        
        Aranykereso aranykereso = new Aranykereso(robert);
        aranykereso.poznaFelallitas();
    }
}
        
    
