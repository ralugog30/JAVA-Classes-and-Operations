import java.util.ArrayList;
import java.util.List;
public class University {
    private List<Student> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();


    public void addStudents(Student s) {
        students.add(s);
    }

    public void addProfessors(Professor p) {
        professors.add(p);
    }

    public void getGrades(){
        int[] grades = new int[students.toArray().length];
        int i=-1;
        for(Student s:students){
            i++;
            grades[i] = s.getGrade();
        }
    }



    //prima metoda
    public Student[] insufficientGrades() {
        List<Student> insufficientGrades = new ArrayList<>();
        for (Student s : students) {
            if (s.verifica() == 0)
                insufficientGrades.add(s);
        }
        return insufficientGrades.toArray(new Student[0]);  //sa fac direct array de la inceput? nu stiu size u???
    }

    //a doua metoda
    public double averageGrade() {
        int nr = students.toArray().length;
        if(nr == 0)
            return 0;
        double average = 0;
        for (Student s : students) {
            average += s.getGrade();
        }
        average /= nr;
        return average;
    }

    //a treia metoda
    public int[] roundGrades(Professor p) {
        List<Integer> roundGrades = new ArrayList<>(); //pt notele rotunjite
        for (Student s : students) {
            int original = s.getGrade();
            int round = p.roundNote(s);
            if (original != round)
                roundGrades.add(round);

        }
       return roundGrades.stream().mapToInt(Integer::intValue).toArray();

    }

    //a patra metoda
    public int maxRoundGrade(Professor p) {
        int[] roundGrades = roundGrades(p);
        /*
        int[] roundGrades = new int[students.toArray().length]; //pt notele rotunjite
        int i = -1;
        for (Student s : students) {
            i++;
            int original = s.getGrade();
            int round = p.roundNote(s);
            if (original != round)
                roundGrades[i] = round;

        }
        */
        int max = 0;
        for (int j = 0; j < roundGrades.length; j++) {
            if (roundGrades[j] > max)
                max = roundGrades[j];
        }
        return max;
    }

}