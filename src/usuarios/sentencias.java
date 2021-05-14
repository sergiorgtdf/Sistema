/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author Sergio Olmedo
 */
public class sentencias {

    public static String ACTUALIZAR_USUARIO = "update usuario set "
            + "Nombre= ?, "
            + "apellido= ?, "
            + "tipo_doc= ?, "
            + "documento= ?, "
            + "fecha_nacimiento= ?, "
            + "estado= ?, "
            + "usuario= ?, "
            + "pass= ? "
            + "where id= ?";
}
