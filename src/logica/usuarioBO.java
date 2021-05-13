
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
    
    
    public ArrayList<usuarioVO> getListado (int pId, String pBusqueda){
        ArrayList<usuarioVO> datos ;
        try {
            datos = da.getUsuarios(pId, pBusqueda);
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
    
    public int getTotalUsuarios() throws Exception {
        try {
            return da.getTotalUsuarios();
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public boolean Guardar (usuarioVO Modificacion) throws Exception{
        boolean resp = false;
        try {
            if (da.ActualizarUsuario(Modificacion)){
                resp = true;
            }
            
        } catch (Exception e) {
            throw e;
        }
        return resp;
    }
    
    
    public boolean ActualizarUsuario(usuarioVO mod) {
        boolean res=false;
        
        try {
            res = da.ActualizarUsuario(mod);
        } catch (Exception e) {
            System.out.println("logica.usuarioBO.ActualizarUsuario()");
            throw e;
        }
        return res;
    }
    
}
