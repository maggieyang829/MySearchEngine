package miniSearchEngineTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import miniSearchEngine.*;

import org.junit.Test;

public class DatabaseTest {

	@Test
	public void testDatabase() {
		Indexer i = new Indexer("test1");
		Field f = new Field("name", "xiaomeng");
		IndexerBag ib = new IndexerBag(i,f);
		
		//test on addToData()
		DataBase.addToData(ib);                  
		
		//test on sizeOfDatabase()
		assertEquals(1,DataBase.sizeOfDatabase());
		
		//test on doSearch()
		ArrayList<String> result = DataBase.doSearch(ib.getField());
		assertTrue("test1".equalsIgnoreCase(result.get(0)));
		
		//test on removeFromData()
		DataBase.removeFromData(ib);
		ArrayList<String> result2 = DataBase.doSearch(ib.getField());
		assertTrue(result2.isEmpty());
	}

	@Test
	public void testDoSort() {
		DataBase.clear();
		IndexerBag ib1 = new IndexerBag(new Indexer("test1"), new Field("name", "xiaomeng"));
		IndexerBag ib2 = new IndexerBag(new Indexer("test2"), new Field("age", "100"));
		IndexerBag ib3 = new IndexerBag(new Indexer("test3"), new Field("gender", "female"));
		
		DataBase.addToData(ib1);
		DataBase.addToData(ib2);
		DataBase.addToData(ib3);
		assertEquals(3, DataBase.sizeOfDatabase());
		DataBase.doSort();
		assertTrue(ib2 == DataBase.getDataCollection().get(0));
		assertTrue(ib3 == DataBase.getDataCollection().get(1));
		assertTrue(ib1 == DataBase.getDataCollection().get(2));
	}

	@Test
	public void testIsEmpty() {
		
		//test on clear() and isEmpty()
		DataBase.clear();
		assertEquals(true,DataBase.isEmpty());
	}


}
