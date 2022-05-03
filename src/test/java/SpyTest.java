import org.junit.Rule;
import org.junit.Test;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static junit.framework.TestCase.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class SpyTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Spy
    List arrayListSpy1 = new ArrayList();
    List arrayListSpy2 = new ArrayList();

    @Test
    public void test1() {

        assertEquals(0, arrayListSpy1.size());

        arrayListSpy1.add("Paolo");

        assertEquals(5, arrayListSpy1.size());

    }//Failed

    @Test
    public void test2() {

        assertEquals(0, arrayListSpy2.size());

        arrayListSpy2.add("Paolo");

        assertEquals(1, arrayListSpy2.size());

    }//Success

}
