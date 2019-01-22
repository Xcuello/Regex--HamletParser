import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.SplittableRandom;

import static org.junit.Assert.*;

public class HamletParserTest {

    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {

        this.hamletParser = new HamletParser();

        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {

        //Given

        String testString = "Hamlet is a wild guy";

        String expected = "Leon is a wild guy";

        //When

        String actual = hamletParser.changeHamletToLeon(testString);

        //Then

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testChangeHoratioToTariq() {

        //Given

        String testString = "Horatio is a wild guy";

        String expected = "Tariq is a wild guy";

        //When

        String actual = hamletParser.changeHoratioToTariq(testString);

        //Then

        Assert.assertEquals(expected,actual);

    }


    @Test
    public void testFindHoratio() {

        //Given

        String name = " ";

        String expected = "Horatio";

        //When

        boolean actual = hamletParser.findHoratio(name);

        //Then

        Assert.assertTrue(expected,actual);


    }

    @Test
    public void testFindHamlet() {

        //Given

        String name = " ";

        String expected = "Hamlet";

        //When

        boolean actual = hamletParser.findHamlet(name);

        //Then

        Assert.assertTrue(expected,actual);



    }
}