public class Professor {
    private String Name;
    public Professor(String Name) {
        this.Name = Name;
    }
    public String getName(){

        return this.Name;
    }
    public int roundNote(Student s){
        int grade = s.getGrade();
        int unit = grade/10;
        unit = (unit +1)*10;
        int  middle = unit -5;
        if(s.verifica()==1){
            if (grade < middle ){
                if (middle - grade < 3)
                    s.setGrade(middle);
            } else if (grade < unit) {
                if(unit - grade <=3)
                    s.setGrade(unit);
            }

        }
        return s.getGrade();
    }


    
}
