import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlacemore() {
    int[] input1 = { 1,2,3,5,10 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 10,5,3,2,1 }, input1);
	}

  @Test
  public void testReversedore() {
    int[] input1 = {1,3,5,7 };
    assertArrayEquals(new int[]{ 7,5,3,1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void averageWithoutLowestTest() {
    double[] input1 = {1,1,1,1,1 };
    double t=1.0;
    assertEquals(t, ArrayExamples.averageWithoutLowest(input1),0.001);
  }
}
