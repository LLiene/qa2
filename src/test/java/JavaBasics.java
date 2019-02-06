import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaBasics {

    @Test
    public void sumCheck()  {
        int a = 10;
        int b = 7;

        int sum = a + b;

        Assertions.assertEquals(17,sum,"Wrong sum!!!");
       // System.out.println(sum);
    }
}
