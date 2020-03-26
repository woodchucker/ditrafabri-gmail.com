package fabrizio;

import java.util.Arrays;

public class IntList {

	@Override
	public String toString() {
		return "IntList [list=" + Arrays.toString(list) + "]";
	}

	private int[] list;

	public IntList() {
		this.list = new int[0];
	}
	
	public void addElement(int el) {
		int newSize = list.length+1;
		int[] newList = new int[newSize];
		for (int i = 0; i< list.length; i++) {
			newList[i] = list[i];
		}
		
		newList[list.length] = el;
		list = newList;
	}
	
}
