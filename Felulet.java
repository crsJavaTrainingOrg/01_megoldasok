import java.util.Random;

public class Felulet{
    
    
    public static double megsaccolas (Kor k, int probakSzama){
        Random rand = new Random();
        
        int talalat = 0;
        
        for(int i = 0; i < probakSzama; i++){
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            
            if(k.tartalmazzaE(x,y)){
                talalat++;
            }
        }
        return (double)talalat/probakSzama;
    }
}
            
            
