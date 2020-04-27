package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void testForConstructor() throws Exception {
        Cipher cipherObject = new Cipher("Sample secret message", 5);
        // assert that cipherObject is an instance of Cipher, true or false
        assertEquals(true, cipherObject instanceof Cipher);
    }

    @Test
    public void testInputMessage() throws Exception{
        Cipher cipherObject = new Cipher("Sample secret message", 5);
        assertEquals("Sample secret message", cipherObject.getMessage());
    }

    @Test
    // GIDEON maroko key - 7 NPKLVU thyvrv
    public void testCipherLogic() throws Exception {
        Cipher cipherObject = new Cipher("GIDEON maroko", 7);
        assertEquals("NPKLVU thyvrv", cipherObject.messageInput());
    }
    @Test
    // GIDEON maroko key - 7 NPKLVU thyvrv
    public void testShiftKeyLogic() throws Exception {
        Cipher cipherObject = new Cipher("GIDEON maroko", 7);
        assertEquals(7, cipherObject.getShiftKey());
    }

    @Test //UWRSCB aofcyc
    public void testDecipherogic() throws Exception{
        Decipher decipherObject = new Decipher("NPKLVU thyvrv", 7);
        assertEquals("GIDEON maroko", decipherObject.decipherUserText());
    }


}