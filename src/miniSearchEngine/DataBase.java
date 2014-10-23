package miniSearchEngine;

import java.util.ArrayList;
import java.util.Collections;

public class DataBase {
	private static ArrayList<IndexerBag> dataCollection = new ArrayList<IndexerBag>();
	
	public static ArrayList<IndexerBag> getDataCollection() {
		return dataCollection;
	}
	
	public static void addToData(IndexerBag ib) {	
		dataCollection.add(ib);
	}
	
	public static Boolean removeFromData(IndexerBag ib) {
		Boolean removed = dataCollection.remove(ib);
		return removed;
	}
	
	public static ArrayList<String> doSearch(Field f) {
		ArrayList<String> result = new ArrayList<String>();
		for(IndexerBag a : dataCollection) {
			if(f.getFieldName().equals(a.getField().getFieldName()) && 
					f.getFieldValue().equals(a.getField().getFieldValue())) 
				result.add(a.getIndexer().getIdentifier());
		}
		return result;
	}
	
	public static void doSort() {
		Collections.sort(dataCollection, new myComparator());
	}
	
	public static Boolean isEmpty(){
		Boolean a = dataCollection.isEmpty();
		return a;
	}
	
	public static int sizeOfDatabase() {
		return dataCollection.size();
	}
	
	public static void clear(){
		dataCollection.clear(); 
	}
	
	public String toString(){
		String s = new String();
		s = "the database has size: " + sizeOfDatabase();
		return s;
	}
}
