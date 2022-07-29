package es.danirod.empleados;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmpleadoMapper {
	
	EmpleadoMapper INSTANCE = Mappers.getMapper(EmpleadoMapper.class);
	
	@Mapping(target = "nombre", source = "source.employerName")
	@Mapping(target = "apellidos", source = "source.employerSurname")
	@Mapping(target = "puesto", source = "source.employerField")
	@Mapping(target = "identifier", source = "source.id")
	Empleado sourceToDestination(EmpleadoDao source);
	
	@Mapping(target = "employerName", source = "destination.nombre")
	@Mapping(target = "employerSurname", source = "destination.apellidos")
	@Mapping(target = "employerField", source = "destination.puesto")
	@Mapping(target = "id", source = "destination.identifier")
	EmpleadoDao destinationToSource(Empleado destination);
}
