package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class UConexion {
	
	private static UConexion instanciaConexion;
	
	/*nos permite ejecutar las query*/
	private static Connection conexion;
	
	/*singleton*/
	private UConexion() {
		
		/*obtiene los datos de la conexion desde el archivo q se encuentra en resources, .properties*/
		ResourceBundle rb = ResourceBundle.getBundle("resources.framework");
		
		try {
			
			/*pone en memoria ram la clase que recibe*/
			Class.forName(rb.getString("driver"));
			/*getConnection recibe como parametro el servidor a conectarnos, usuario y contraseña*/
			/*devuelve un objeto del tipo conexion*/
			conexion = DriverManager.getConnection(rb.getString("db_path"), rb.getString("user"), rb.getString("pass"));
			System.out.println("base okkkkkk");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
			
	}
	
	/*instancia de la conexion*/
	public static Connection getInstanciaConexion() {
		
		if(instanciaConexion == null) {
			instanciaConexion = new UConexion();
		}
		
		return conexion; /*devuelve la conexion*/
		
	}

	
	public Connection getConexion() {
		return conexion; 
	}

	

}
