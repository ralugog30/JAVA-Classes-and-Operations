public class ZahlenArray {
    private int[] Zahlen;


    public ZahlenArray(int[] Zahlen){
        this.Zahlen = Zahlen;
    }

    ///1
    public int max(){
        int max=Integer.MIN_VALUE;
        for(int i=0; i< Zahlen.length; i++){
            if(Zahlen[i]>max)
                max=Zahlen[i];
        }
        return max;
    }

    //2
    public int min(){
        int min=Integer.MAX_VALUE;
        for(int i=0; i< Zahlen.length; i++){
            if(Zahlen[i]<min)
                min=Zahlen[i];
        }
        return min;
    }


    ///3
    public int MaxSumme(){
        int min = min();
        int sum=0;
        for(int i=0; i< this.Zahlen.length; i++){
            if(this.Zahlen[i]!=min)
                sum+=this.Zahlen[i];
        }
        return sum;
    }

    ///4
    public int MinSumme(){
        int max = max();
        int sum=0;
        for(int i=0; i< this.Zahlen.length; i++){
            if(this.Zahlen[i]!=max)
                sum+=this.Zahlen[i];
        }
        return sum;
    }



}
