import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void main() {
    }

    @Test
    void goodString() {
        assertEquals(true, urinals.goodString("10001"));
        System.out.println("======Sai Susmita Edara==Test One Executed======");

        assertEquals(true, urinals.goodString("1001"));
        System.out.println("======Sai Susmita Edara==Test Two Executed======");

        assertEquals(true, urinals.goodString("00000"));
        System.out.println("======Sai Susmita Edara==Test Three Executed======");

        assertEquals(true, urinals.goodString("0000"));
        System.out.println("======Sai Susmita Edara==Test Four Executed======");

        assertEquals(true, urinals.goodString("01000"));
        System.out.println("======Sai Susmita Edara==Test Five Executed======");
        assertEquals(false, urinals.goodString("011"));
        System.out.println("======Sai Susmita Edara==Test Six Executed======");


    }


    @Test
    void urinalscount() {
        assertEquals(1, urinals.urinalscount("10001"));
        System.out.println("======Sai Susmita Edara==Test One Executed======");
        assertEquals(0, urinals.urinalscount("1001"));
        System.out.println("======Sai Susmita Edara==Test Two Executed======");
        assertEquals(3, urinals.urinalscount("00000"));
        System.out.println("======Sai Susmita Edara==Test Three Executed======");
        assertEquals(2, urinals.urinalscount("0000"));
        System.out.println("======Sai Susmita Edara==Test Four Executed======");
        assertEquals(1, urinals.urinalscount("01000"));
        System.out.println("======Sai Susmita Edara==Test Five Executed======");
        assertEquals(-1, urinals.urinalscount("011"));
        System.out.println("======Sai Susmita Edara==Test Six Executed======");
    }

    @Test
    void getString() {
    }
}