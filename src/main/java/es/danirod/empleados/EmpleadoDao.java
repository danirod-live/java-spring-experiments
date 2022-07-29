package es.danirod.empleados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmpleadoDao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String employerName;
	
	private String employerSurname;
	
	private String employerField;
	
}
