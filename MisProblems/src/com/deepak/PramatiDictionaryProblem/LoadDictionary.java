package com.deepak.PramatiDictionaryProblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class LoadDictionary {

	DictionaryContainer dc;
	LoadDictionary(DictionaryContainer dc) {
		this.dc = dc;
	}
	
	public void loadAll() {
		loadAntonym();
		loadSynonym();
		loadMeaning();		
	}
	private void loadAntonym() {
		BufferedReader bf;
		String line;
		try {
			bf = new BufferedReader(new FileReader("src/word_antonym.txt"));
			//line = bf.readLine();
			while((line = bf.readLine())!=null) {
				String[] wordArr = line.split(":");
				dc.anto.put(wordArr[0].toLowerCase().trim(), wordArr[1]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void loadSynonym() {
		BufferedReader bf;
		String line;
		try {
			bf = new BufferedReader(new FileReader("src/word_synonym.txt"));
			//line = bf.readLine();
			while((line = bf.readLine())!=null) {
				String[] wordArr = line.split(":");
				dc.syno.put(wordArr[0].toLowerCase().trim(), wordArr[1]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private void loadMeaning() {
		BufferedReader bf;
		String line;
		try {
			bf = new BufferedReader(new FileReader("src/word_meaning.txt"));
			//line = bf.readLine();
			while((line = bf.readLine())!=null) {
				String[] wordArr = line.split(":");
				dc.mean.put(wordArr[0].toLowerCase().trim(), wordArr[1]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
