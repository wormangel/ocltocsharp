
public class Atributos {
	public String Code;
	public Class<?> Type;
	public Object Value;
	public int ColKind;

	
	public Atributos(Class<?> classe, Object valor, String code ){
		this.Type = classe;
		this.Value = valor;
		this.Code = code;
	}
	
	public Atributos(Class<?> classe, Object valor, String code, int caller ){
		this.Type = classe;
		this.Value = valor;
		this.Code = code;
		this.ColKind = caller;		
	}	
}
