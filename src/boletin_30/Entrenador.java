package boletin_30;

/**
 *
 * @author Usuario
 */
public class Entrenador extends SeleccionFutbol{
    private int idFederacion;

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
    
    void planificarEntrenamiento(){
        System.out.println("Planifica entrenamiento");
    }
}
