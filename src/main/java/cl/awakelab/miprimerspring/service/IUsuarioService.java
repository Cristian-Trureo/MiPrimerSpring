package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario crearUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario buscarUsuarioPorId(int idUsuario);
    Usuario actualizarUsuario(Usuario usuario, int idUsuario);
    Usuario actualizarUsuario2(Usuario usuarioActualizar);
    void eliminarUsuario(int idUsuario);
}
