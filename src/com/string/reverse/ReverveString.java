package com.string.reverse;  

//Criar objeto chamando classe
//Possa valor inicial ou nao
//Criar metodo reverso
//Methodo toString

public class ReverveString {
	private final String initialPhrase;

	// constructor
	public ReverveString(String value) {
		this.initialPhrase = value;
	}

	// Methods
	public String reverse() {
		char[] temp = new char[initialPhrase.length()];
		int phraseLength = initialPhrase.length();
		for (int i = 0; i < (phraseLength + 1) / 2; i++) {
			temp[i] = initialPhrase.charAt(phraseLength - 1 - i);
			temp[phraseLength - 1 - i] = initialPhrase.charAt(i);
		}

		return new String(temp);
	}
}
