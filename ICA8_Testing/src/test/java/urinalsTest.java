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
        System.out.println("======Sai Susmita Edara==Test Two Executed======");
    }

    @Test
    void getString() {
    }
}