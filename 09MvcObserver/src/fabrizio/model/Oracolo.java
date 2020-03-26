package fabrizio.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import fabrizio.utilities.Observable;

public class Oracolo extends Observable {
	ArrayList<String> risposte = new ArrayList<>();
	private String output;
	private int currentSize;
	private Map<String, String> map = new HashMap<String, String>();
	private String currentResponse;

	public Oracolo() {
		risposte.addAll(Arrays.asList("Domani farà bel tempo", "Forse si", "Forse no", "si", "no", "Può darsi",
				"Domani andrà meglio"));

	}

	public void addInDict(String d) {
		if (!map.containsKey(d)) {
			map.put(d, getCurrentResponse());
		}
	}

	public void getRandomResponse(String d) {
		
		String retVal = "";
	
		if (map.containsKey(d)) {
			retVal = map.get(d);
		} else {
			Random r = new Random();
			
			if (risposte.size() > 0) {
				
				int i = r.nextInt(risposte.size());
				retVal = risposte.get(i);
				currentResponse = risposte.get(i);
				addInDict(d);
				risposte.remove(i);
			}
		}
		setOutput(retVal);
	}

	public String getArrivederci() {
		return "Arrivederci l'Oracolo ha finito le risposte.";
	}

	public Oracolo(String output) {
		super();
		this.output = output;
	}

	public Oracolo(String output, int size) {
		this(output);
		setSize(size);
	}

	public void setCurrentResponse(String s) {
		currentResponse = s;
	}

	public String getCurrentResponse() {
		return currentResponse;
	}

	private void setSize(int size) {
		currentSize = size;
	}

	public int getSize() {
		return currentSize;
	}

	public void setOutput(String output) {
		this.output = output;
		notifyObservers(new Oracolo(output, risposte.size()));
	}

	public String getOutput() {
		return output;
	}

}
