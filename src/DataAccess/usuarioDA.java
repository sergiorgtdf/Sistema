package DataAccess;

import DataAccess.ConexionAccess;
import modelo.usuarioVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import sistema.Global;

public class usuarioDA {

    Connection cx = null;

    public usuarioDA() {
        try {
            cx = ConexionAccess.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="ObtenerUsuarios">
    public ArrayList<usuarioVO> getUsuarios(String pBusqueda) {
        ArrayList<usuarioVO> Listado = new ArrayList();

        String sql = "";

        sql = "Select * from usuario where eliminado = 'N'";

//        if (pid > 0) {
//            sql = "Select * from usuario where id = " + pid + " and eliminado = 'N'";
//        }
//        if (!pBusqueda.equals("")) {
//            sql = "Select * from usuario where usuario like '%" + pBusqueda + "%' and eliminado = 'N'";
//        }

        System.out.println(sql);
        try {
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            usuarioVO _datos = null;

            while (rs.next()) {

                _datos = new usuarioVO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getDate(7),
                        rs.getDate(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getDate(13));

                Listado.add(_datos);
            }
        } catch (SQLException e) {

            System.out.println("Acceso_Datos.usuarios.usuarioDA.ObtenerUsuarios()");

        }

        return Listado;
    }
    //// </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Obtener Usuario y Contraseña">
    public ArrayList<usuarioVO> Login(String pUser, String pPass) throws SQLException, Exception {

        PreparedStatement pst;
        ResultSet rs;
        usuarioVO datos;
        ArrayList<usuarioVO> Usuario = new ArrayList();

        String sql = "";

        sql = "Select u.id, u.nombre, u.apellido, u.tipo_doc, u.documento, u.fecha_nacimiento, u.fecha_alta, u.fecha_baja, u.estado, u.eliminado, u.usuario, u.pass, u.fecha_pass"
                + " from usuario u where u.usuario = ? and u.pass = ? and u.eliminado = 'N'";

        //System.out.println(sql);

        try {
            pst = cx.prepareStatement(sql);
            pst.setString(1, pUser);
            pst.setString(2, pPass);

            rs = pst.executeQuery();

            while (rs.next()) {

                datos = new usuarioVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getDate(7),
                        rs.getDate(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getDate(13));

                Usuario.add(datos);

                Global.UsuarioActual = datos;
            }

        } catch (SQLException e) {

            throw e;

        }

        return Usuario;
    }
    //// </editor-fold>  
}
