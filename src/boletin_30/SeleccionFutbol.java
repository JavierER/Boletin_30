package boletin_30;

/**
 *
 * @author Usuario
 */
public class SeleccionFutbol implements IntegranteSeleccionFutbol{
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public SeleccionFutbol(int id,String nombre,String apellidos,int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    @Override
    public void integrarse() {
        
    }

    @Override
    public void viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jugarPartido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
