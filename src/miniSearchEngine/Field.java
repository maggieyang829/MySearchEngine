package engine;



public class Field {
	
	String name;
	String value;
	
	//Construct for field object
	Field(String FieldName, String FieldValue) {
		this.name = FieldName;
		this.value = FieldValue;
	}
	
	//returns the field name
	public String getFieldName() {
		return name;
	}
	
	//returns the field value
	public String getFieldValue() {
		return value;
	}
	
	//setter that maggie yang wrote
	public void setFieldEntry(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	public String toString(){
		return getFieldName() + " ; " + getFieldValue();
	}
	
}
