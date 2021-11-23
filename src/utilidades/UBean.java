package utilidades;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class UBean {

	public static ArrayList<Field> obtenerAtributos(Object o) {

		ArrayList<Field> arrayField = new ArrayList<Field>();

		Class c = o.getClass();

		return new ArrayList<Field>(Arrays.asList(c.getDeclaredFields()));

	}

	public static void ejecutarSet(Object o, String att, Object valor) {

		Class c = o.getClass();

		for (Field f : c.getDeclaredFields()) {

			String setter = "set".concat(att.substring(0, 1).toUpperCase()).concat(att.substring(1).toLowerCase());

			System.out.println(setter);

			for (Method m : c.getDeclaredMethods()) {

				if (m.getName().equals(setter)) {
					/*array de object que luego va a ser invocado*/
					Object[] parametros = new Object[1];

					try {
						/*le pasamos el valor que quisieramos en la posicion 0*/
						parametros[0] = valor;
						/*ejecuto el metodo, lo invoco, o sobre que objeto quiero ejectura el metodo*/
						m.invoke(o, parametros);

					} catch (IllegalAccessException e) {

						e.printStackTrace();
					} catch(IllegalArgumentException e) {
						e.printStackTrace();
						
					} catch(InvocationTargetException e) {
						e.printStackTrace();
						
					}

					break;
				}

			}

		}

	}

	public static Object ejecutarGet(Object o, String att) {

		Object getResult = null;

		Class c = o.getClass();

		for (Field f : c.getDeclaredFields()) {

			/*concatena el get*/
			String getter = "get".concat(att.substring(0, 1).toUpperCase()).concat(att.substring(1).toLowerCase());

			System.out.println(getter);
			/*trea todo los metodos de la clase*/
			for (Method m : c.getDeclaredMethods()) {
				/*compara el getName (nombre del metodo) y compara con getter*/
				if (m.getName().equals(getter)) {

					try {
						/*toma el metodo, lo invoca y lo ejecuta*/
						getResult = m.invoke(o, null);

					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {

						e.printStackTrace();
					}

					break;
				}

			}

		}

		return getResult;

	}

}
