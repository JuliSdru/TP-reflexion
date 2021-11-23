import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;
import java.util.ResourceBundle;

import servicios.Consultas;
import utilidades.UConexion;

public class Program {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException  {

		Persona p = new Persona();
		p.setNombre("julieta");
		p.setApellido("sdrubolini");
		p.setDni(1234);
		p.setEdad(18);
		p.setId(1);
		//p.setId(14);
		
		Class c = Persona.class;
		
		
try {
			
			Consultas.guardar(p);
			
			//Consultas.modificar(p);
			
			//Consultas.eliminar(p);
			
			//Object persona = Consultas.obtenerPorId(c, 13);
			
			//List<Object> listaTodos = Consultas.obtenerTodos(c);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
		
		
	}
}
