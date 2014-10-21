package miniSearchEngine;

public class Indexer {
	
	public String identifier;
	
	public Indexer(String id){
		this.identifier = id;
	}
	
	public String getIdentifier(){
		return identifier;
	}	
	
	public void add(Field f) {
		IndexerBag ib = new IndexerBag(this,f); 
		DataBase.addToData(ib);
	}
	
	public void remove(Field f){
		IndexerBag ib = new IndexerBag(this, f);
		DataBase.removeFromData(ib);
	}
	
	public void close() {
		
	}
}
