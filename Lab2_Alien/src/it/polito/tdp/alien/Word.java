package it.polito.tdp.alien;

import java.util.*;

public class Word {

	
	private String alienWord;
	private String translation;
	//private Map<String,String>dizionario=new HashMap<String,String>();
	
	
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}
	

public String getAlienWord() {
	return alienWord;
}

public void setAlienWord(String alienWord) {
	this.alienWord = alienWord;
}

public String getTranslation() {
	return translation;
}

public void setTranslation(String translation) {
	this.translation = translation;
}


public String compare(String alienWord){
		if(this.alienWord.compareTo(alienWord)==0)
		return this.alienWord;
		else return null;
	}
}
