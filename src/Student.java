public class Student {
   private String name;
   private int note;
   public  Student(String name, int note){
       this.name = name;
       this.note=note;
   }
   //setters, getters, verifica nota-cu metoda, dupa in main adaugi in array cu metoda
    public String getName(){

       return this.name;
    }
    public int getGrade(){

        return this.note;
    }
    public void setGrade(int grade) {
            this.note = grade;

    }

    public int verifica(){
       int ok=1;

       if(this.note <= 38)
           ok=0;
       return ok;

    }






}
