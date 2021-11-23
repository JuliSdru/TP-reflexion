package anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* RUNTIME para recuperar en tiempo de ejecucion*/
@Retention(RetentionPolicy.RUNTIME)
/*a que se lo quiero asginar*/
@Target(ElementType.TYPE)
public @interface Tabla {
	
	/*todos los atributos seteados son obligatorios al menos que tenga un valor por defecto*/
	String nombre() default "default";

}
