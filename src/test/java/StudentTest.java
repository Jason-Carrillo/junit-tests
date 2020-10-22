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

    }


}
