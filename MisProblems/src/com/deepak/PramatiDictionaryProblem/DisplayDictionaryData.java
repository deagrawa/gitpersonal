package com.deepak.PramatiDictionaryProblem;

public class DisplayDictionaryData {

	DictionaryContainer dc;
	public String input;
	
	DisplayDictionaryData(DictionaryContainer dc, String input) {
		this.dc = dc;
		this.input = input;
	}
	public void displayAll() {
		if(displayMean()) {
			displayAntonym();
			displaySynonym();
		}
		else {
			System.out.println("No word found in dictionay");
		}
	}
	
	private boolean displayMean() {
		boolean flag = false;
		String value = dc.mean.get(input);
		if(value != null) {
			flag = true;
			System.out.println("Meaning:");
			System.out.println(value);
		}
		return flag;
		
	}
	
	private void displaySynonym() {
		String value = dc.syno.get(input);
		System.out.println("Synonyms:");
		System.out.println(value);
	}
	
	private void displayAntonym() {
		String value = dc.anto.get(input);
		System.out.println("Antonyms:");
		System.out.println(value);
	}
}
