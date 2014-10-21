package miniSearchEngine;

public class Field {
	String fieldName;
	String value;
	
	public Field(String aName, String aValue) {
		this.fieldName = aName;
		this.value = aValue;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public String getFieldValue() {
		return value;
	}
	
	public void setFieldEntry(String name, String value) {
		this.fieldName = name;
		this.value = value;
	}
}
