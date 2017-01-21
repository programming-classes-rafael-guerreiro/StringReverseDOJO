
public class ReverveString {
	private String value;
	
	//constructor
	public ReverveString(String value){
		this.value = value;
	}
	
	//Methods
	public void reverse(){
		char temp;
		String resultado;
		for (int i = 0; i < value.length()/2; i++) {
			temp = value.charAt(i);
			value.charAt(i) = '1';
		}
	}
	
}
