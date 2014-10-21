package miniSearchEngine;

import java.util.Comparator;

public class myComparator implements Comparator<IndexerBag>{

	@Override
	public int compare(IndexerBag a, IndexerBag b) {

		return a.getField().getFieldName().compareToIgnoreCase(b.getField().getFieldName());
	}

}
