public class Estudiante {
    String noCuenta;
    String curso;
    String calificacion;

    public Estudiante(String nombre, int edad, String sexo, String direccion, String noCuenta, String curso, String calificacion){
       // super(nombre,edad,sexo,direccion);
        this.noCuenta = noCuenta;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    public void verCalificacion(){
        //System.out.println("La calificación de "+|+" es "+calificacion);
    }
    public void verCursos(){
        System.out.println("El curso es: "+curso);
    }
}
