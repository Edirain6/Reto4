
package Controlador;



import Modelo.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import com.mysql.cj.protocol.Resultset;
import java.util.ArrayList;


public class CbSucursal {
    
    Connection connection;
    Conexion conexion = new Conexion();
    Statement st;
    Resultset rs;
    
    public CbSucursal(){
        
    }
    
            
    public ArrayList getListSucursales() {
        System.out.println("Funciòn getListaSucursales");
        ArrayList mListaSucursales = new ArrayList();
        Sucursal sucursal = null;
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = (Resultset)st.executeQuery("SELECT idSucursal, nombreSucursal FROM ``sucursal");
            while(rs.next()){
                sucursal = new Sucursal();
                sucursal.setIdSucursal(rs.getInt("idSucursal"));
                sucursal.setNombreSucursal(rs.toString("nombreSucursal"));
                mListaSucursales.add(sucursal);
            }            
        }catch(SQLException e){
            System.out.println(e);
        }
        return mListaSucursales;
    }        
}          
            
