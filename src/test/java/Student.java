import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public void Student(long studentID, String studentName){
        this.id = studentID;
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

}
