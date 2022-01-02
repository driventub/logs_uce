package ec.edu.uce.repository;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{
		
private static final Logger LOG= LogManager.getLogger(PacienteRepoImpl.class);
	
	@Override
	public void Insertar(Estudiante estudiante) {
		LOG.info("Se guardo en la base: "+estudiante);
	}

	@Override
	public void BuscarPorCedula(String cedula) {
		LOG.info("Buscando al paciente con CI: "+cedula);
	}

	@Override
	public void Actualizar(Estudiante estudiante) {
		LOG.info("Se actualizo a: "+estudiante);
	}

	@Override
	public void Borrar(String cedula) {
		LOG.warn("Se borro al estudiante de ID: "+cedula);
	}

}
