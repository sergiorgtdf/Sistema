package DataAccess;

import DataAccess.ConexionAccess;
import modelo.menuVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import sistema.Global;

public class menuDA {

    Connection cx = null;

    public menuDA() {
        try {
            cx = ConexionAccess.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="ObtenerUsuarios">
    public ArrayList<menuVO> ObtenerMenu(int id_Depende) {
        ArrayList<menuVO> Listado = new ArrayList();

        String sql = "";

        sql = "Select * from config_menu where eliminado = 'N'";

        try {
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            menuVO _datos = null;

            while (rs.next()) {

                _datos = new menuVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7));
                        

                Listado.add(_datos);
            }
        } catch (SQLException e) {

            System.out.println("Acceso_Datos.usuarios.usuarioDA.ObtenerUsuarios()");

        }

        return Listado;
    }
   

    
}
