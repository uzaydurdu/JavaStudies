package com.ecodation.genericclass;

public class TelephoneGeneric<T> {

	private T id;
	private String name;

	public TelephoneGeneric() {

	}

	public TelephoneGeneric(T id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public <T3> void tryingGenericMethods(T3 t1, T3 t2) {
		System.out.println(t1);
		System.out.println(t2);

	}

	public static <T extends Number> void genericMethod(T t) {// you can delete 'extends'
		System.out.println(t);
	}

	/*
	 * public <T5> String returningMethod(T5 total1, T5 total2){
	 * 
	 * return total1 + total2; }
	 */

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
