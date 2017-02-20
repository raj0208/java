package com.myspring;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnotationSamples {
	
	// Property autowired
	//@Autowired
	private SpellChecker spellChecker;
	
	/* Setter method autowired
	 * @Autowired
	public void setSpellChecker(SpellChecker checker) {
		this.spellChecker = checker;
	}*/
	
	/*Constructor Autowired*/
	@Autowired
	public AnnotationSamples(SpellChecker spellChecker){
		System.out.println("Inside TextEditor constructor." );
	    this.spellChecker = spellChecker;
	}
	
	/*public SpellChecker getSpellChecker() {
		return this.spellChecker;
	}*/
	
	public void spellCheck() {
		this.spellChecker.checkSpelling();
	}
}
