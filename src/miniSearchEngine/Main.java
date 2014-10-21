package miniSearchEngine;

public class Main {

	public static void main(String[] args) {
		
		Field f = new Field("name", "xiaomeng");
		
		Indexer i = new Indexer("profile-line1");
		i.add(f);
		
		Indexer d = new Indexer("resume-line5");
		d.add(f);
		
		FieldSearch s = new FieldSearch();
		String [] result = s.findEquals(f);
		
		for (int j=0; j< result.length;j++)
		System.out.println(result[j]);
	}

}
