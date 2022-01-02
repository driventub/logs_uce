package ec.edu.uce.repository;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
public class PacienteRepoImpl implements IPacienteRepo{

	private static final Logger LOG= LogManager.getLogger(PacienteRepoImpl.class);
	
	@Override
	public void Insertar(Paciente paciente) {
		LOG.info("Se guardo en la base: "+paciente);
		//System.out.println("Se guardo en la base: "+paciente);
//		try {			
//		}catch(Exception e) {
//			LOG.error("Se produjo error al guardar paciente");
//		}
	}

	@Override
	public void BuscarPorCedula(String cedula) {
		//System.out.println("Buscando al paciente co CI: "+cedula);
		LOG.info("Buscando al paciente con CI: "+cedula);
	}

	@Override
	public void Actualizar(Paciente paciente) {
		//System.out.println("Se actualizo a: "+paciente);
		LOG.warn("Se actualizo a: "+paciente);
	}

	@Override
	public void Borrar(String cedula) {
		//System.out.println("Se borro a: "+cedula);
		LOG.warn("Se borro a: "+cedula);
	}

}
