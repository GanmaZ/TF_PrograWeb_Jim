package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioDao {

	public void insertar(Usuario u);

	public List<Usuario> listar();

}
