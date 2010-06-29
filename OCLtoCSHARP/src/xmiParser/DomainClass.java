package xmiParser;

import java.util.ArrayList;
import java.util.List;

public class DomainClass {

	private List<Attribute> attributes;
	private List<Operation> operations;
	
	private String name;

	public DomainClass(String name) {
		this.name = name;
		attributes = new ArrayList<Attribute>();
		operations = new ArrayList<Operation>();
	}
	
	public String getName() {
		return name;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public List<Operation> getOperations() {
		return operations;
	}
	
	
}
