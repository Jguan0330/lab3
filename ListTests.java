import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {
  @Override
public boolean checkString(String s){
  return true;
}
	@Test 
	public void listfilterTest() {
    StringChecker sc = new StringChecker();
    List<String> list=new ArrayList<>();
    List<String> newlist=new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    newlist.add("a");
    newlist.add("a");
    newlist.add("a");
    newlist.add("a");
    assertEquals(newlist, ListExamples.filter(list, sc));
	}

}
