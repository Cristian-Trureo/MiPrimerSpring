package cl.awakelab.miprimerspring.controller;

import cl.awakelab.miprimerspring.entity.Usuario;
import cl.awakelab.miprimerspring.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")  //mapeando o redireccion
public class UsuarioController {
    @Autowired
    IUsuarioService objUsuarioService;

    @PostMapping //tipo de request
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return objUsuarioService.crearUsuario(usuario);
    }

    @GetMapping("/{idUsuario}")
    public Usuario buscarUsuarioPorId(@PathVariable int idUsuario){
        return objUsuarioService.buscarUsuarioPorId(idUsuario);
    }
    @GetMapping
    public List<Usuario> listarUsuarios(){
        return objUsuarioService.listarUsuarios();
    }
    @PutMapping("/{idUsuario}")
    public Usuario actualizarUsuario(@RequestBody Usuario usuarioActualizar,@PathVariable int idUsuario){
        return objUsuarioService.actualizarUsuario(usuarioActualizar,idUsuario);
    }
    @PutMapping
    public Usuario actualizarUsuario2(@RequestBody Usuario usuarioActualizar){
        return objUsuarioService.actualizarUsuario2(usuarioActualizar);
    }

    @DeleteMapping("/{idUsuario}")
    public void eliminarUsuario(int idUsuario){
        objUsuarioService.eliminarUsuario(idUsuario);
    }
}
