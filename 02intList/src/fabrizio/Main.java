package fabrizio;

public class Main {

	public static void main(String[] args) {
		
		IntList intlist = new IntList();
		intlist.addElement(1);
		intlist.addElement(2);
		intlist.addElement(3);
		intlist.addElement(2);
		intlist.addElement(1);
		System.out.println(intlist);
		GenericList<String> stringList = new GenericList<String>();
		stringList.addElement("eg");
		stringList.addElement("yugyug");
		stringList.addElement("trtdtrexe");
		stringList.addElement("kiojio");
		stringList.addElement("certd");
		System.out.println(stringList);
		
		GenericList<Integer> intList2 = new GenericList<Integer>();
		// Raggruppare, fare una lista di liste di città Italia{ roma firenze ... }
		// Spagna{ Madrid Barcellona ...}
		GenericList<GenericList<String>> listaPaesi = new GenericList<GenericList<String>>();
		//GenericList<GenericList<String>> listaPaesi2 = new GenericList<GenericList<String>>();
		listaPaesi.addElement(
				new GenericList<String>("roma", "firenze","napoli"),
				new GenericList<String>("madrid","salamanca","barcellona")
				);

		GenericList<String> Italia = new GenericList<>("roma","firenze","napoli");
		GenericList<String> Spagna = new GenericList<>("madrid","salamanca","barcellona");
		GenericList<GenericList<String>> listaPaesi2 = new GenericList<GenericList<String>>(Italia,Spagna);
		/*listaPaesi2.addElement(
				Italia,
				Spagna
				);
				*/
		System.out.println(listaPaesi2);
		
	}

}
