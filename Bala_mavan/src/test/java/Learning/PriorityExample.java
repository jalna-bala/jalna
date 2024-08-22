package Learning;
import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void testCase1() {
        System.out.println("Executing Test Case 1");
    }

    @Test(priority = 2)
    public void testCase2() {
        System.out.println("Executing Test Case 2");
    }
}
