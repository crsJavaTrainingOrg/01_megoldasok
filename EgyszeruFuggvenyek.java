public class EgyszeruFuggvenyek{

    public static double e(double x, final double epsilon){
        double osszeg = 1;
        int i = 0;
        double kovetkezoTag = 1 * x/(i+1);
        while(kovetkezoTag>=epsilon){
            i++;
            osszeg = osszeg + kovetkezoTag;
            kovetkezoTag = kovetkezoTag * x/(i+1);
        }
        return osszeg;
    }
}


