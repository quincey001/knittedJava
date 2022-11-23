package StringStringBufferStringBuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMethodsTest {
    @Test
    void convertCharArrayTest(){
        StringMethods sm = new StringMethods();
        char[] arr = new char[]{'a','b','c','d','e','f'};
        String str = sm.convertCharArray(arr);
        assertEquals("abcdef", str);
    }
    @Test
    void convertCharArrayTest1(){
        StringMethods sm = new StringMethods();
        char[] arr = new char[]{'a','b','c','d','e','f'};
        String str = sm.convertCharArray(arr);
        assertEquals("abcdef", str);
    }
}