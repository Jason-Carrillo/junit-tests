import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;


    public Student(String studentName, long studentID){
        this.id = studentID;
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public double getGradeAverage(){
        double totalGrade = 0;

        for (Integer number: grades){
            totalGrade += number;
        }

        double totalAverage = totalGrade / grades.size();

        return Math.round(totalAverage * 100)/100.0;
    }

}
