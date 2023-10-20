public class ElektronikShop {
    private int[] TastaturPreise;
    private int[] USBPreise;

    ElektronikShop(int[] TastaturPreise, int[] USBPreise){
        this.TastaturPreise=TastaturPreise;
        this.USBPreise=USBPreise;
    }

    public int biligste_tastaturPreis(){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<TastaturPreise.length; i++){
            if(TastaturPreise[i]< min)
                min=TastaturPreise[i];
        }
        return min;
    }

    public int teuresteGegenstand(){
        int max=Integer.MIN_VALUE;
        int maxLength=0;
        if(TastaturPreise.length>USBPreise.length)
            maxLength=TastaturPreise.length;
        else
            maxLength=USBPreise.length;
        for(int i=0; i<maxLength; i++){
            if(TastaturPreise[i]> max)
                max=TastaturPreise[i];
            if(USBPreise[i]>max)
                max=USBPreise[i];
        }
        return max;
    }


    public int inBudget(int budget){
        int max =0;
        for(int i=0; i<USBPreise.length; i++){
           if(USBPreise[i]>=max && USBPreise[i]<=budget)
               max=USBPreise[i];
        }
        return max;
    }

    public int bothInBudget(int budget){
        int maxPrice=0;
        for(int i=0; i<TastaturPreise.length;i++){
            for(int j=0; j<USBPreise.length;j++){
                if((TastaturPreise[i]+USBPreise[j] <= budget) && (TastaturPreise[i]+USBPreise[j] > maxPrice))
                        maxPrice= TastaturPreise[i]+USBPreise[j];
            }
        }
        if(maxPrice==0)
            return -1;
        else
            return maxPrice;
    }


}
