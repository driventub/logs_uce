package ec.edu.uce.repository;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {

	void Insertar(Paciente paciente);//Create
	
	void BuscarPorCedula(String cedula);//Read
	
	void Actualizar(Paciente paciente);//Update
	
	void Borrar (String cedula);//Delete
}
