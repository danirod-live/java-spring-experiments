package es.danirod.empleados;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Empleado {
	
	private long identifier;
	
	private String nombre;
	
	private String apellidos;
	
	private String puesto;
}
