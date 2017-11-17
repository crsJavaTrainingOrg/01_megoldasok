import becker.robots.*;

public class Aranykereso{
    
    private RobotSE rob;
    
    public Aranykereso(RobotSE robi){
        rob = robi;
    }
    
    public void poznaFelallitas(){
        rob.move(4);
        rob.pickAllThings();
        int sum = rob.countThingsInBackpack();
        int oldal = sum / 4;
        int oldalakszama = 4;
        rob.turnLeft();
        
        while (oldalakszama > 0){
            while(oldal > 0){
                rob.move();
                rob.putThing();
                oldal--;
            }
            rob.turnLeft();
            oldalakszama--;
            oldal = sum / 4;
        }
    }
}



        
        
    
   
    
    
