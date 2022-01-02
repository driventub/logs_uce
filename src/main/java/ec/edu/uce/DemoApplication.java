package ec.edu.uce;


import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IEstudianteService estuService;
	
	private static final Logger LOG= LogManager.getLogger(DemoApplication.class);
	
	Scanner leer=new Scanner(System.in);
	Scanner leer2=new Scanner(System.in);
	
	/*
	 * FATAL	100	The application is unusable. Action needs to be taken immediately.
	   ERROR	200	An error occurred in the application.
	   WARN		300	Something unexpected—though not necessarily an error—happened and needs to be watched.
	   INFO		400	A normal, expected, relevant event happened.
	   DEBUG	500	Used for debugging purposes
	   TRACE	600	Used for debugging purposes—includes the most detailed information
	 */
	
	public static void main(String[] args) {
		
		LOG.debug("Realizando depuración antes de iniciar");
		
		LOG.debug("Depuración completa");
		LOG.isTraceEnabled();
		LOG.trace("Detalles de la depuración");
		
		
		SpringApplication.run(DemoApplication.class, args);
		
		LOG.debug("Sin fallos encontrados");
		LOG.trace("Rastro con info detallada");
	}

	@Override
	public void run(String... args) throws Exception {
		// implementar metodos de la capa logica/servicios
		
		
		LOG.info("--------------Empieza seccion de Paciente-------------");
		
		Paciente miPaciente=new Paciente();
		LOG.info("Ingrese el nombre del Paciente: ");
		String x=leer.next();
		LOG.info("Ingrese su apellido: ");
		String y=leer.next();
		LOG.info("Ingrese su edad: ");
		int z=leer2.nextInt();
		
		if(z>40) {
			LOG.error("En esta sala solo se admiten pacientes menores a 40 anios ");
			System.exit(z);
		}
		
		miPaciente.setNombre(x);
		miPaciente.setApellido(y);
		miPaciente.setEdad(z);
		
		this.pacienteService.InsertarPaciente(miPaciente);
		
		LOG.info("Ingrese la nueva edad del paciente: ");
		int z1=leer2.nextInt();
		
		if(z1>40) {
			LOG.error("El paciente ahora es demaciado mayor para esta sala ");
			System.exit(z1);
		}
		
		miPaciente.setEdad(z1);
		LOG.warn("Alerta se cambiara la informacion del paciente");
		this.pacienteService.ActualizarPaciente(miPaciente);
		
		LOG.info("SELECCIONE: 1 buscar Paciente     2 borrar Paciente");
		int o=leer2.nextInt();
		
		switch (o) {
		case 1:
			this.pacienteService.BuscarPaciente("132456");
			break;
		case 2:	
			this.pacienteService.BorrarPaciente("132456");
			break;
		default:
			LOG.fatal("No se ha ingresado ninguna de las opciones sugeridas");
			System.exit(1);
			break;
		}
		
		LOG.info("--------------Empieza seccion de Estudiante-------------");
		
		Estudiante miEstudiante =new Estudiante();

		LOG.info("Ingrese el nombre del Paciente: ");
		String x1=leer.next();
		LOG.info("Ingrese su apellido: ");
		String y1=leer.next();
		LOG.info("Ingrese la universidad perteneciente en siglas: ");
		String u=leer.next();
		switch (u) {
		case "UCE":
			LOG.info("Universidad admitida");
			break;
		case "PUCE":
			LOG.warn("Universidad admitida hasta el proximo mes");
			break;
		default:
			LOG.fatal("Este sistema no admite estudiantes de esa universidad");
			System.exit(1);
			break;
		}
		
		miEstudiante.setNombre(x1);
		miEstudiante.setApellido(y1);
		miEstudiante.setUniversidad("UCE");
		
		LOG.warn("Guardando datos, no apague la maquina");
		this.estuService.InsertarEstudiante(miEstudiante);
		
		LOG.info("Ingrese el id del estudiante para buscarlo ");
		
		int o2=leer2.nextInt();
		if(o2==123) {
			this.estuService.BuscarEstudiante("123");
		}else {
			LOG.error("No se ha encontrado el estudiante solicitado");
		}
		
		
		LOG.info("El proceso ha sido exitoso");
		
		LOG.debug("Sin fallos encontrados");
		LOG.isTraceEnabled();
		LOG.trace("Rastro con info detallada");
	}

}
