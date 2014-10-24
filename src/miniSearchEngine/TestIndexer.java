package miniSearchEngine;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
public class TestIndexer {

	@Test
	public void testIndexer() {
		Indexer T = new Indexer("hello");
		assertEquals(T.identifier, "hello");
	}

	@Test
	public void testGetIdentifier() {
		Indexer T = new Indexer("hello");
		assertEquals(T.getIdentifier(), T.identifier);
	}

	/*tests that the identifier in the database is the same string
	 * as I manually put into the assertEquals.  actually its
	 * an arraylist of strings since the database returns that*/
	@Test
	public void testAdd() {
		Indexer T = new Indexer("hello");
		Field F = new Field("name", "andy");
		T.add(F);
		ArrayList<String> testID = new ArrayList<String>();
		testID.add("hello");
		assertEquals(DataBase.doSearch(F),testID);
	}
	
	
	
}
