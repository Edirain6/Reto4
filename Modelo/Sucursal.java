
package Modelo;
import Vistas.*;
import Controlador.*;




public class Sucursal {
    
    private int idSucursal;
    private String nombreSucursal;
    
    public Sucursal() {
        idSucursal = 0;
        nombreSucursal = "";        
    }

    public int getIdSucursal() {
        return idSucursal;
    }
    
    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }
    
    
    @Override
    public String toString() {
        return getNombreSucursal(); 
    }
    
    
    
    
}