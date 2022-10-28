import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void main() {
    }

    @Test
    void goodString() {
        assertEquals(true, urinals.goodString("101010101"));
        System.out.println("======Sai Susmita Edara==Test Two Executed======");

        assertEquals(false, urinals.goodString("1111111111"));
        System.out.println("======Sai Susmita Edara==Test Two Executed======");

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
    }

    @Test
    void getString() {
    }
}