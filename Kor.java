public class Kor{
    
    private double x;
    private double y;
    private double r;
    
    public Kor(double kozeppontX, double kozeppontY, double sugar){
        x = kozeppontX;
        y = kozeppontY;
        r = sugar;
    }
    
    public boolean tartalmazzaE(double pontx, double ponty){
        boolean eredmeny = false;
        
        if((pontx - x)*(pontx - x) + (ponty - y) * (ponty - y) <=r * r){
            eredmeny = true;
            
        }
        return eredmeny;
    }
}
        
