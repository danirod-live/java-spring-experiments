package es.danirod.empleados;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {
	
	private EmpleadoRepository repo;
	
	public EmpleadoController(EmpleadoRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping("/plantilla")
	public List<Empleado> plantilla() {
		List<Empleado> empleados = new ArrayList<>();
		this.repo.findAll().forEach(empl -> {
			empleados.add(EmpleadoMapper.INSTANCE.sourceToDestination(empl));
		});
		return empleados;
	}
	
	@PostMapping("/nuevo")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Empleado crear(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String puesto) {
		var dao = new Empleado();
		dao.setNombre(nombre);
		dao.setApellidos(apellido);
		dao.setPuesto(puesto);
		repo.save(EmpleadoMapper.INSTANCE.destinationToSource(dao));
		return dao;
	}
}
