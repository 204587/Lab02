package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	private List<Word>dictionary=new LinkedList<Word>();
	
	public void addWord(String alienWord, String translation){
		boolean trovato=false;
		for(Word wtemp:dictionary){
			if(wtemp.compare(alienWord)!=null){
				wtemp.setTranslation(translation);
				trovato=true;
			}
		}
		if(trovato==false && alienWord.matches("[a-zA-Z ]*") && translation.matches("[a-zA-Z ]*")){
			Word w=new Word(alienWord, translation);
			dictionary.add(w);
			}
		}
	
	
	public String translateWord(String alienWord){
		//Il metodo viene chiamato dal Controller per la traduzione della parola 
		//alienWord passata
		//come parametro. Il metodo restituisce la parola tradotta,
		//altrimenti null se alienWord non è
		//presente nel dizionario.
		boolean trovato=false;
		String traduzione="";
		for(Word wtemp:dictionary){
			if(wtemp.compare(alienWord)!=null){
				trovato=true;
				traduzione=wtemp.getTranslation();
				break;
			}
			}
			if(trovato==true){
				return traduzione;
			}
			else
		return null;
	
	}
}
