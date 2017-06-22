package com.deepak.PramatiDictionaryProblem;

import java.util.Scanner;

public class TestDictionary {

	public static void main(String[] args) {
		DictionaryContainer dc = new DictionaryContainer();
		LoadDictionary ld = new LoadDictionary(dc);
		ld.loadAll();

		Scanner in = new Scanner (System.in);
		String dictWord = in.nextLine();
		
		DisplayDictionaryData output = new DisplayDictionaryData(dc, dictWord.toLowerCase().trim());
		output.displayAll();
		in.close();
	}

}
