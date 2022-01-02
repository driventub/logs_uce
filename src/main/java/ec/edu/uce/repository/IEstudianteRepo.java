package ec.edu.uce.repository;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteRepo {

	void Insertar(Estudiante estudiante);//Create
	
	void BuscarPorCedula(String cedula);//Read
	
	void Actualizar(Estudiante estudiante);//Update
	
	void Borrar (String cedula);//Delete
	
}
