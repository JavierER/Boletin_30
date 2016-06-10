package boletin_30;

/**
 *
 * @author Usuario
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int anosExperiencia;

    public Masajista(String titulacion, int anosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
    
    
    void darMasaje(){
        System.out.println("El masajista da un masaje");
    }
}
