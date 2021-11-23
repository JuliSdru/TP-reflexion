import anotaciones.Columna;
import anotaciones.Id;
import anotaciones.Tabla;

@Tabla(nombre = "tabla_pers")
public class Persona {
	/*anotacion*/
	@Id
	public Integer id;
	
	@Columna(nombre = "Dni")
	public Integer dni;
	
	@Columna(nombre = "Edad")
	public Integer edad;
	
	@Columna(nombre = "Nombre")
	public String nombre;
	
	@Columna(nombre = "Apellido")
	public String apellido;
	
	public Persona() {
	}
	
	public Persona(Integer id, Integer dni, Integer edad, String nombre, String apellido) {
		super();
		this.id = id;
		this.dni = dni;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getEdad() {
		return edad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
