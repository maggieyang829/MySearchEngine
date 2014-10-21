package miniSearchEngine;

public class IndexerBag {
	Indexer i;
	Field f;
	
	public IndexerBag(Indexer i, Field f){
		this.i = i;
		this.f = f;
	}
	
	public Indexer getIndexer(){
		return i;
	}
	
	public Field getField(){
		return f;
	}
}
