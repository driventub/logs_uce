package ec.edu.uce.service;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteService {
	
	void InsertarEstudiante(Estudiante estudiante);//Create
	
	void BuscarEstudiante(String cedula);//Read
	
	void ActualizarEstudiante(Estudiante estudiante);//Update
	
	void BorrarEstudiante (String cedula);//Delete
	
}
