package fabrizio.utilities.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Vediamo di seguito una classe di utilità che presenta una serie di metodi statici, 
//utili per interrogare alcune proprietà di un generico oggetto.

/*  Listato 1 - ReflectionUtils.java
 *
 *  Esporta una serie di metodi di utilità
 *  per utilizzare le proprietà riflessive
 */
public class ReflectionUtils {
//	public static Object getNewinstanceByClassName(String className) {
//		return 
//	}

	public static String getClassName(Object aClass) {
		return aClass.getClass().getSimpleName();
	}

	// Tramite l'oggetto di cui non conosco la classe mi faccio
	// restituire i suoi attributi in un array di stringhe
	public static String[] getStringFields(Object aClass) {
		Field[] campi = aClass.getClass().getDeclaredFields();
		String[] campiStringa = new String[campi.length];
		for (int i = 0; i < campi.length; i++) {
			campiStringa[i] = campi[i].getName();
		}
		return campiStringa;
	}

	// Nella seconda parte del codice dato il nome (name) di un attributo/campo,
	// l’oggetto del bean (target) a cui settare il valore dell’attributo (value),
	// individuo il metodo adatto (se c’è) e lo invoco.

	/*
	 * Listato 2. (continua da 1)
	 *
	 * Individuare e invocare il metodo
	 */
	public static String checkCase(String mName) {
		return mName.substring(0, 1).toUpperCase() + mName.substring(1);
	}

	public static void setProperty(String name, Object target, Object value) {
		Method metodo = null;
		String nameToUpperCase = checkCase(name);
		try {
			metodo = target.getClass().getMethod("set" + nameToUpperCase, new Class[] { value.getClass() });
		} catch (NoSuchMethodException e) {
		}
		if (metodo != null)
			try {
				// esegue il metodo della classe
				metodo.invoke(target, new Object[] { value });
			} catch (Exception ecc) {
			
			}
	}

//Infine nell’ultima parte, dato il nome (name) di un attributo/campo e l’oggetto del bean (target) individuo il metodo adatto (se c’è), lo invoco, recuperando il valore del risultato (come stringa).

	/*
	 * Listato 3. (continua da 2)
	 *
	 * Individuare il metodo, invocarlo e recuperare il valore del risultato
	 */
	public static String getProperty(String name, Object target) {
		String ritorno = new String();
		Method metodo = null;
		String nameToUpperCase = checkCase(name);
		try {
			metodo = target.getClass().getMethod("get" + nameToUpperCase, null);
		} catch (NoSuchMethodException exc) {
		}
		if (metodo != null)
			try {
				ritorno = (String) metodo.invoke(target, new Object[0]);
			} catch (Exception ecc) {
			}
		return ritorno;
	}

} // chiude la classe ReflectionUtils
