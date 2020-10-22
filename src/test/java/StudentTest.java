import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentTest {

    Student Jason = new Student("Jason", 12345);

    @Test
    public void testStudentConst(){
        assertEquals(Jason.getName(), "Jason");
        assertEquals(Jason.getId(), 12345);
        assertNotEquals(Jason.getId(), 12354);
        assertTrue(Jason.getName().length() > 0);
    }

    @Test
    public void testAddGrade(){
        assertTrue(Jason.getGrades().isEmpty());
        Jason.addGrade(90);
        assertFalse(Jason.getGrades().isEmpty());
        assertNotNull(Jason.getGrades());
    }

    @Test
    public void testAverageGrade(){
        Jason.addGrade(90);
        Jason.addGrade(100);
        Jason.addGrade(100);

        assertEquals(Jason.getGradeAverage(), 96.67, 0);

    }


}
