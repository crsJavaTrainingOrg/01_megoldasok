public class TestPrim{
    
    public static boolean primszamTeszt(int szam){
        int maxertek = (int) Math.sqrt(szam);
        boolean eredmeny = true;
        for(int i = 2; i<=maxertek;i++){
            
            if(szam % i == 0){
                eredmeny = false;
            }
        }
         return eredmeny;       
            
        
    }
}
