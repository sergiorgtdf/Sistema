
package logica;

import DataAccess.usuarioDA;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.usuarioVO;
public class usuarioBO {
    
    private usuarioDA da;

    public usuarioBO() {
        try {
            da = new usuarioDA();
        } catch (Exception e) {
            
        } 
    }
    
    
    public ArrayList<usuarioVO> getListado (String pBusqueda){
        ArrayList<usuarioVO> datos ;
        try {
            datos = da.getUsuarios(pBusqueda);
        } catch (Exception e) {
            System.out.println("Logica.usuarioBO.getListado()");
            throw e;
        }
        return datos;
    }
    
    public boolean Login (String pUser, String pPass) throws SQLException, Exception {
        ArrayList<usuarioVO> datos ;
        try {
            datos = da.Login(pUser, pPass);
            if (datos.size()>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Logica.usuarioBO.Login()");
            throw e;
        }
        
    }
    
    public int getTotalUsuarios() {
        return da.getTotalUsuarios();
    }
    
}
