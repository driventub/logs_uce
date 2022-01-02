package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{

	//private PacienteRepoImpl pacienterepo=new PacienteRepoImpl(); //desacoplamos con spring
	//private IPacienteRepo pacienterepo= new PacienteRepoImpl(); No se debe hacer
	
	@Autowired
	private IPacienteRepo pacienterepo;
	
	@Override
	public void CalcularDeuda() {
		//traer de la base de datos, la deuda
		//multiplicarla por el 12 porciento
		//calcularle la multa
		//...logica
		System.out.println();
		
	}

	@Override
	public void InsertarPaciente(Paciente paciente) {
		this.pacienterepo.Insertar(paciente);
	}

	@Override
	public void BuscarPaciente(String cedula) {
		this.pacienterepo.BuscarPorCedula(cedula);
	}

	@Override
	public void ActualizarPaciente(Paciente paciente) {
		this.pacienterepo.Actualizar(paciente);
	}

	@Override
	public void BorrarPaciente(String cedula) {
		this.pacienterepo.Borrar(cedula);
	}

}
