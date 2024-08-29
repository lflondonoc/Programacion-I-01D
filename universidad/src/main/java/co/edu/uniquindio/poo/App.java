package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        // Crear estudiante
        Estudiante estudiante = new Estudiante("1234", "Julio Cesar", "Lopez lopez", "jc@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 4.0,2.9);

        Estudiante estudiante2 = new Estudiante("567", "Juliana", "Gomez", "jg@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 1.0,2.9);

        Estudiante estudiante3 = new Estudiante("908", "Ana", "Duarte", "ad@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 3.0,2.9);

        // Crear profesor
        Profesor profesor= new Profesor("Luisa", "00000");

        //Crear curso
        Curso curso= new Curso("Programación 1", profesor);

        //Agregar estudiante al curso
        curso.agregarEstudiante(estudiante);
        curso.agregarEstudiante(estudiante2);
        curso.agregarEstudiante(estudiante3);

         Curso.mostrarMensaje(curso.toString());

         //Verificar y mosrar si el estudiante existe o no
         String numeroIdentificacion= "0";
         boolean estudianteExiste= curso.validarNumeroIdentificacion(numeroIdentificacion);
         if (estudianteExiste){
            Curso.mostrarMensaje("El estudiante con número de identificación "+numeroIdentificacion+" existe");
         }else{
            Curso.mostrarMensaje("El estudiante con número de identificación "+numeroIdentificacion+" no existe");
         }

         //Eliminar estudiante
         String cedula= "1234";
         curso.eliminarEstudiante(cedula);
         Curso.mostrarMensaje("El estudiante con el número de identificación "+cedula+" fue removido");
         Curso.mostrarMensaje(curso.toString());

         //Actualizar estudiante
         String cedula2= "567";
         curso.actualizarEstudiante("g@mail.com", "1234455", cedula2);
         Curso.mostrarMensaje("El estudiante "+cedula2+ " ha sido actualizado");

         //Curso actualizado
         Curso.mostrarMensaje("El curso ha sido actualizado: \n");
         Curso.mostrarMensaje(curso.toString());

    }
    

       
}
