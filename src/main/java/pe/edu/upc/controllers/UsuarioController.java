package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	@Inject
	private IUsuarioService uService;

	private Usuario u;
	List<Usuario> listaUsuarios;

	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.u = new Usuario();
	}

	public String newUsuario() {
		this.setU(new Usuario());
		return "usuario.xhtml";
	}

	public void insertar() {
		try {
			uService.insertar(u);
		} catch (Exception e) {
			System.out.println("Error en Clase controller metodo-insertar");
		}
	}
	
	public void listar() {
		try {
			uService.listar();
		} catch (Exception e) {
			System.out.println("Error en Clase controller metodo-listar");
		}
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

}
