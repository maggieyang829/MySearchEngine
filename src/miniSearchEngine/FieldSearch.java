package miniSearchEngine;

import java.util.ArrayList;

public class FieldSearch {
	public FieldSearch(){}
	
	public String [] findEquals(Field f){
		ArrayList<String> result = DataBase.doSearch(f);
		String[] arr = new String[result.size()];
		arr = result.toArray(arr);
		return arr;
	}
}
