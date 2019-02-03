

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {
    @Test
    void functionInteger() throws Exception {
        Object a= Main.function(6,4,0);
        Object a1= Main.function(6,4,1);
        assertEquals(a,10);
        assertEquals(a1,2);
    }
    @Test
    void functionString() throws Exception {
        Object a= Main.function("6","4",0);
        Object a1= Main.function("1","1",0);
        assertEquals(a,"64");
        assertEquals(a1,"11");
    }
    @Test
    void exceptionExpectedWrongParam1() throws Exception{
        assertThrows(Exception.class, () -> Main.function(6, "4", 0));
    }
    @Test
    void exceptionExpectedWrongParam2() throws Exception{
        assertThrows(Exception.class, () -> Main.function("6", 4, 0));
    }
    @Test
    void exceptionExpectedWrongParam3() throws Exception{
        assertThrows(Exception.class, () -> Main.function(6, 4, 10));
    }
}