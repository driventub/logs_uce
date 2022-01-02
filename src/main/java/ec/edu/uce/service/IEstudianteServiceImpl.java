package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.repository.IEstudianteRepo;

@Service
public class IEstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepo estudrepo;
	
	@Override
	public void InsertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudrepo.Insertar(estudiante);
	}

	@Override
	public void BuscarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		this.estudrepo.BuscarPorCedula(cedula);
	}

	@Override
	public void ActualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudrepo.Actualizar(estudiante);
	}

	@Override
	public void BorrarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		this.estudrepo.Borrar(cedula);
	}

}
