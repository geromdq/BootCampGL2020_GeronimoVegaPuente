package hibernate.example.main;

import java.util.List;

import hibernate.example.dao.AlumnoDao;
import hibernate.example.model.Alumno;

public class ExampleApplication {

	public static void main(String[] args) {
		AlumnoDao alumnoDao = new AlumnoDao();
		alumnoDao.createAlumno(new Alumno(0,"Jose","Perez"));
		alumnoDao.createAlumno(new Alumno(0,"Esteban","Quito"));
		alumnoDao.createAlumno(new Alumno(0,"Ulrica","Godofreda"));
		
		List<Alumno>alumnos = alumnoDao.getAlumnos();		
		Alumno alumnoModificado = alumnos.get(1);
		alumnoModificado.setName("Estefano");
		alumnoDao.updateAlumno(alumnoModificado);
		
		alumnoDao.removeAlumno(alumnoDao.getAlumnos("Jose","Perez").get(0));
		
		System.out.println(alumnoDao.getAlumnos());
	}

}
