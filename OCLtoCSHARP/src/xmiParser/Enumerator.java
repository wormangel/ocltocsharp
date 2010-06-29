package xmiParser;

import java.util.ArrayList;
import java.util.List;

public class Enumerator {

	private String name;
	private List<String> itens;
	
	public Enumerator(String name){
		this.name = name;
		itens = new ArrayList<String>();
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}

	public List<String> getItens() {
		return itens;
	}
}
