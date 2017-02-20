/**
 * 
 */
package com.myspring;

/**
 * @author Pratiksha
 *
 */
public class HelloWorld {
	private String message;
	
	private String message1;
	private String message2;
	

	public HelloWorld() {
		System.out.println("Constructor called");
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your message : " + this.message);
	}
	
	public void init(){
	      System.out.println("Bean is going through init.");
	}
	   
	public void destroy(){
		System.out.println("Bean will destroy now.");
	}
	
	public void setMessage1(String message) {
		this.message1 = message;
	}
	
	public void getMessage1() {
		System.out.println("World message : " + this.message1);
	}
	
	public void setMessage2(String message) {
		this.message2 = message;
	}
	
	public void getMessage2() {
		System.out.println("World message : " + this.message2);
	}
}
