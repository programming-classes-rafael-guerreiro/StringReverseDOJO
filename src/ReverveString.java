//Criar objeto chamando classe
//Possa valor inicial ou nao
//Criar metodo reverso
//Methodo toString



public class ReverveString {
	public final String initialPhrase;
	public String finalPhrase;
	
	//constructor
	public ReverveString(String value){
		this.initialPhrase = value;
		this.finalPhrase = value;
	}
	
	//Methods
	public void reverse(){
		char[] temp = new char[initialPhrase.length()];
		int phraseLength = initialPhrase.length();
		for (int i = 0; i < phraseLength/2; i++) {
			temp[i] = initialPhrase.charAt(phraseLength-i);
			temp[phraseLength-i] = initialPhrase.charAt(i);
		}
		
	}
}
