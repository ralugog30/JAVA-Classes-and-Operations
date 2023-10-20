import java.util.Arrays;

public class GrosseZahlen {
    private int[] Zahl1;
    private int[] Zahl2;

    GrosseZahlen(int[] Zahl1, int[] Zahl2){
        this.Zahl1= Zahl1;
        this.Zahl2= Zahl2;
    }


    public int[] sum(){
        int suma[];
        suma= new int[Zahl1.length+1];
        Arrays.fill(suma, 0);
        int z =0;
        for(int i=Zahl1.length-1; i>=0; i--) {
            int sum = this.Zahl1[i] + this.Zahl2[i]+z;
            int unit = sum % 10;
            z = sum / 10;
            suma[i+1] =  unit;

        }
        if(z > 0)
            suma[0]=z;


        return suma;
            }

    public int[] diferenta(){
        int dif[];
        dif=new int[Zahl1.length];
        Arrays.fill(dif,0);
        int difUnit;
        for(int i=Zahl1.length-1; i>=0; i--){
            if(Zahl1[i] < Zahl2[i]){
                difUnit = Zahl1[i]*10-Zahl2[i];
                dif[i]=difUnit;
                dif[i-1]=-1;
            } else {
                dif[i]=dif[i]+(Zahl1[i]-Zahl2[i]);
            }
        }
        return dif;
    }
    public int[] multiplikation(int kleinZahl){
        int m=0;
        int result[];
        result=new int[Zahl1.length+1];
        Arrays.fill(result,0);
        int z=0;
        for(int i=Zahl1.length-1; i>=0; i--){
            m=Zahl1[i]*kleinZahl+z;
            int unit=m%10;
            z=m/10;
            result[i+1]=unit;

        }
        if(z>0)
            result[0]=z;
        return result;

    }
    public int[] division(int kleinZahl){
        int d=0;
        int rest=0;
        int result[];
        result=new int[Zahl1.length];
        Arrays.fill(result,0);
        for(int i=0; i< Zahl1.length;i++){
            d=(rest*10+Zahl1[i])/kleinZahl;
            rest=Zahl1[i]%kleinZahl;
            result[i]=d;
        }
        return result;

    }
}



