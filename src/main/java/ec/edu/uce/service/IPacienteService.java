package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {

	void CalcularDeuda();
	
	void InsertarPaciente(Paciente paciente);//Create
	
	void BuscarPaciente(String cedula);//Read
	
	void ActualizarPaciente(Paciente paciente);//Update
	
	void BorrarPaciente (String cedula);//Delete
	
}
