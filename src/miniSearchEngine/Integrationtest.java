package engine;

import static org.junit.Assert.*;

import org.junit.Test;


public class IntegrationTest {
	
	int i;
	//partially written by maggie yang

	@Test
	public void test() {
		
		Field f = new Field("FirstName", "Josh");
		Field f1 = new Field("LastName" , "Kinney");
		Field f2 = new Field("Age", "21)");
		
		Indexer i = new Indexer("FirstName-Line");
		i.add(f);
		Indexer i1 = new Indexer("LastName-Line");
		i1.add(f1);
		Indexer i2 = new Indexer("Age-Line");
		i2.add(f2);
		
		
		FieldSearch s = new FieldSearch();
		
		String [] result = s.findEquals(f1);
		
		int j;
		String ans = null;
		
		for (j=0; j< result.length;j++)
			ans = result[j];
		
		assertEquals(ans,"LastName-Line");
		
	}
	
	//tests if multiple fields in the database and if they are in there

}
