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
		int phraseLength = initialPhrase.length();
		char[] reversedString = new char[phraseLength];
		boolean hasSurrogate = false;
		
		
		int middle = (phraseLength + 1) / 2;

		for (int index = 0; index < middle; index++) {
			int lastIndex = phraseLength - 1 - index;
			
			reversedString[index] = initialPhrase.charAt(lastIndex);
			reversedString[lastIndex] = initialPhrase.charAt(index);

			if (isSurragate(phraseLength, index))
				hasSurrogate = true;
		}

		if (hasSurrogate)
			reverseSurrogate(reversedString, phraseLength);

		return new String(reversedString);
	}

	private void reverseSurrogate(char[] reversedString, int phraseLength) {
		for (int i = 0; i < phraseLength; i++) {
			if (Character.isSurrogate(reversedString[i])) {
				char aux = reversedString[i];
				reversedString[i] = reversedString[i + 1];
				reversedString[i + 1] = aux;
				i++;
			}
		}
	}

	private boolean isSurragate(int phraseLength, int i) {
		return Character.isSurrogate(initialPhrase.charAt(i))
				|| Character.isSurrogate(initialPhrase.charAt(phraseLength - 1 - i));
	}
	
	
}
