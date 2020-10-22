import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KitchenTest {
    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
    }
    

    @Test
    public void testisEmpty(){
        Kitchen emptyKitchen = new Kitchen();
        Kitchen KitchenWithOne = new Kitchen();
        KitchenWithOne.add("White Corn");
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(KitchenWithOne.isEmpty());

    }

    @Test
    public void testSize(){
        kitchenWithOne.add("White Corn");
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
        assertNotEquals(1, emptyKitchen.size());
    }

    @Test
    public void testAdd(){
        assertTrue(emptyKitchen.isEmpty());
        emptyKitchen.add("White corn");
        assertFalse(emptyKitchen.isEmpty());
        assertEquals(1, emptyKitchen.size());
    }

    @Test
    public void testPop(){
        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());
        assertTrue(kitchenWithOne.isEmpty());
        kitchenWithMany.pop();
        kitchenWithMany.pop();
        assertEquals(2, kitchenWithMany.size());
    }

    @Test
    public void testContains(){
        assertFalse(emptyKitchen.contains("blue corn"));
        assertTrue(kitchenWithOne.contains("yellow corn"));
        assertTrue(kitchenWithMany.contains("yellow corn"));
    }

}
