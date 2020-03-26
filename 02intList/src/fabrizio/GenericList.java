// Anche nelle funzioni possiamo utilizzare i generici 
package fabrizio;

import java.util.Arrays;

public class GenericList <T>{
	
	@Override
	public String toString() {
		return "list=" + Arrays.toString(list);
	}

	private T[] list;

	public GenericList() {
		// Non sappiamo quanta memoria serve per T quindi creiamo una lista di Object generica
		// Restituendo poi un T generico
		this.list = (T[]) new Object[0];
	}
	
	public GenericList(T...els) {
		this();
		addElement(els);
	}
	
	public void addElement(T el) {
		int newSize = list.length+1;
		T[] newList = (T[]) new Object[newSize];
		for (int i = 0; i< list.length; i++) {
			newList[i] = list[i];
		}
		
		newList[list.length] = el;
		list = newList;
	}
	
	public T getList(int i) {
		return list[i];
	}
	
	public void addElement ( T... els) {
		int newSize = list.length+els.length;
		T[] newList = (T[]) new Object[newSize];
		for (int i = 0; i< list.length; i++) {
			newList[i] = list[i];
		}
		for (int i = list.length; i<newSize; i++) {
			newList[i] = els[i];
		}
		list = newList;
	}
}
