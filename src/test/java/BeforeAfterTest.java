import org.junit.*;

public class BeforeAfterTest {

    @BeforeClass
    public static void testBeforeClass(){
        System.out.println("Before Class Test");
    }

    @Before
    public void testBefore(){
        System.out.println("Before Test");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 eseguito");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 eseguito");
    }

    @After
    public void testAfter(){
        System.out.println("After Test");
    }

    @AfterClass
    public static void testAfterClass(){
        System.out.println("After Class Test");
    }
}
