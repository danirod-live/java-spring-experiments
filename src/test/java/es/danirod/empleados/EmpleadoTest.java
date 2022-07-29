package es.danirod.empleados;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest {

	@Test
	void testLomhok() {		
		var empleado = new Empleado();
		empleado.setNombre("Dani");
		empleado.setApellidos("Rod");
		empleado.setPuesto("CEO, CTO, CPO");
		assertEquals(empleado.getNombre(), "Dani");
	}
	
	@Test
	void testConstructor() {
		var empleado = new Empleado("Dani", "Rod", "CEO");
		assertEquals(empleado.getNombre(), "Dani");
		assertEquals(empleado.getApellidos(), "Rod");
		assertEquals(empleado.getPuesto(), "CEO");
	}
}
