package Package.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    //annotation
    @Test
    public void test() {
        //arrange
        Account account = new Account(33, "Hansen");
        int expected = 10;
        //act
        int result = account.insert(10);
        //assert
        assertEquals(expected, result);
    }

}