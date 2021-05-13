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
    PreparedStatement ps;
    ResultSet rs;

    public usuarioDA() {
        try {
            cx = ConexionAccess.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="ObtenerUsuarios">
    public ArrayList<usuarioVO> getUsuarios(int pId, String pBusqueda) {
        ArrayList<usuarioVO> Listado = new ArrayList();

        String sql = "";

        sql = "Select * from usuario where eliminado = 'N'";

        if (pId > 0) {
            sql = "Select * from usuario where id = " + pId + " and eliminado = 'N'";
        }
        if (!pBusqueda.equals("")) {
            sql = "Select * from usuario where usuario like '%" + pBusqueda + "%' and eliminado = 'N'";
        }

        //System.out.println(sql);
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

            System.out.println("Acceso_Datos.usuarios.usuarioDA.ObtenerUsuarios() " + e.getMessage());
            
        }

        return Listado;
    }

    public int getTotalUsuarios() throws SQLException {

        int Cantidad = 0;

        String sql = "";

        sql = "Select count(*) from usuario where eliminado = 'N'";

        try {
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Cantidad = rs.getInt(1);

            }
        } catch (SQLException e) {

            
            System.out.println("Acceso_Datos.usuarios.usuarioDA.ObtenerUsuarios()");

            throw e;
        }

        return Cantidad;
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

    public int NuevoUsuario(usuarioVO Modificacion) {

        int r = 0;
        String sql = "insert into persona(Nombres,Correo,Telefono)values(?,?,?)";
        try {

            ps = cx.prepareStatement(sql);
            //agrega 
            //ps.setString(1, per.getNom());
            //ps.setString(2, per.getCorreo());
            //ps.setString(3, per.getTelefono());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
        }
        return r;

    }

    public boolean ActualizarUsuario(usuarioVO mod) {
        boolean resp = false;
        int r=0;
        String sql = "update usuario set "
                + "Nombre= '" + mod.getNombres() + "', "
                + "apellido= '" + mod.getApellidos()+ "', "
                + "tipo_doc= " + mod.getTipo_doc()+ ", "
                + "documento= '" + mod.getDocumento()+ "', "
                + "fecha_nacimiento= '" + mod.getFecha_nacimiento()+ "', "
                + "estado= " + mod.getEstado()+ ", "
                + "usuario= '" + mod.getUsuario()+ "', "
                + "pass= '" + mod.getPass()+ "' "
                + "where id= " + mod.getId(); 
        
        
         String sql1 = "update usuario set "
                + "Nombre= ?, "
                + "apellido= ?, "
                + "tipo_doc= ?, "
                + "documento= ?, "
                + "fecha_nacimiento= ?, "
                + "estado= ?, "
                + "usuario= ?, "
                + "pass= ? "
                + "where id= ?"; 
        
                System.out.println("Sql update: " + sql1);
        System.out.println("Id - " + mod.getId() + " (" + mod.getApellidos() + ")");
        try {
            
            //cx.setAutoCommit(false);
            ps = cx.prepareStatement(sql1);
            
            ps.setString(1, mod.getNombres());
            ps.setString(2, mod.getApellidos());
            ps.setInt(3, mod.getTipo_doc());
            ps.setString(4, mod.getDocumento());
            ps.setDate(5, mod.getFecha_nacimiento());
            ps.setInt(6, mod.getEstado());
            ps.setString(7, mod.getUsuario());
            ps.setString(8, mod.getPass());
            ps.setInt(9, mod.getId());
            
            System.out.println(sql);
            
            r = ps.executeUpdate();
            
            //cx.commit();
            
            
            if (r == 1) {
                return true;
            } else {
                return false;
            }
            
            
        } catch (Exception e) {
            System.out.println("DataAccess.usuarioDA.ActualizarUsuario()");
        }
        return resp;
    }

}
