public class Main{

    public static void main(String[] args) {
    University u1= new University();
    Professor p = new Professor("Bogdan");
    Student s1 = new Student("Raluca", 98);
    Student s2 = new Student("Maria", 81);
    Student s3 = new Student("Matei", 25);
    Student s4 = new Student("Andrei", 57);

    u1.addStudents(s1);
    u1.addStudents(s2);
    u1.addStudents(s3);
    u1.addStudents(s4);
    u1.addProfessors(p);

    System.out.println("Teste pt prima metoda, pb1");
    Student[] insufficientGrades = u1.insufficientGrades();
    assert(insufficientGrades.length == 1);
    assert !(insufficientGrades[0] == s1);

    System.out.println("Teste pt a doua metoda, pb1");
    double avg= u1.averageGrade();
    //System.out.println(avg);
    assert(avg == 65.25);
    assert !(avg < 10);

    System.out.println("Teste pt a treia metoda, pb1");
    int[] roundedGrades = u1.roundGrades(p);
    assert(roundedGrades[0] == s1.getGrade() );
    assert !(roundedGrades.length == 3);

    System.out.println("Teste pt a patra metoda, pb1");
    int max = u1.maxRoundGrade(p);
    //System.out.println(max);
    assert(max == 100);
    assert !(max<38);

    System.out.println("Teste pt a prima metoda, pb2");
    int[] z = new int[5];
    z[0]=4;
    z[1]=8;
    z[2]=10;
    z[3]=3;
    z[4]=17;
    ZahlenArray z1 = new ZahlenArray(z);
    int maxZ = z1.max();
    assert (maxZ == 17);
    assert !(maxZ<0);

    System.out.println("Teste pt a doua metoda, pb2");
    int minZ=z1.min();
    assert(minZ == 3);
    assert !(minZ == Integer.MAX_VALUE);

    System.out.println("Teste pt a patra metoda, pb2");
    int MinimaleSum = z1.MinSumme();
    assert(MinimaleSum==25);
    assert!(MinimaleSum==12111);

    System.out.println("Teste pt a treia metoda, pb2");
    int MaxSum=z1.MaxSumme();
    assert(MaxSum==39);
    assert!(MaxSum==0);

    System.out.println("Teste pt prima metoda, pb3");
    int[] GrosseZ1 = {8,7,0,0,0,0,0,0,0};
    int[] GrosseZ2={1, 3,0,0,0,0,0,0,0};


    GrosseZahlen z3=new GrosseZahlen(GrosseZ1, GrosseZ2);

        int[] summe=z3.sum();
       // for(int i=0; i<=summe.length; i++)
         //   System.out.println(summe[i]);
        assert(summe[0] == 1);
        assert!(summe[0] == 0);

        System.out.println("Teste pt a doua metoda, pb3");
        int[] dif = z3.diferenta();
        //for(int i=0; i<=dif.length; i++)
          //  System.out.println(dif[i]);
        assert(dif[0] == 7);
        assert!(dif.length == 0);

        System.out.println("Teste pt a treia metoda, pb3");
        int[] multiplication = z3.multiplikation(2);
        //for(int i=0; i<=multiplication.length; i++)
         //System.out.println(multiplication[i]);
        assert(multiplication[0] ==1 && multiplication[1]==6);
        assert!(multiplication.length == 2);

        System.out.println("Teste pt a patra metoda, pb3");
        int[] division = z3.division(2);
        //for(int i=0; i<=division.length-1; i++)
          // System.out.println(division[i]);
        assert(division[0] == 4 && division[1]==3);
        assert !(division.length==1);



        int[] USBPrice = {8,12,80};
        int[] TastPrice = {40,50,60};
        ElektronikShop e1 = new ElektronikShop(TastPrice, USBPrice);

        System.out.println("Teste pt prima metoda, pb4");
        int biligste = e1.biligste_tastaturPreis();
        assert(biligste == 40);
        //System.out.println(biligste);
        assert!(biligste == 0);

        System.out.println("Teste pt a doua metoda, pb4");
        int teureste = e1.teuresteGegenstand();
        //System.out.println(teureste);
        assert(teureste == 80);
        assert!(teureste == 0);

        System.out.println("Teste pt a treia metoda, pb4");
        int USBinBudget = e1.inBudget(30);
        //System.out.println(USBinBudget);
        assert(USBinBudget == 12);
        assert!(USBinBudget == 31);

        System.out.println("Teste pt a patra metoda, pb4");
        int bothInBudget = e1.bothInBudget(60);
        //System.out.println(bothInBudget);
        assert (bothInBudget == 60);
        assert !(bothInBudget == 100);



    }
}