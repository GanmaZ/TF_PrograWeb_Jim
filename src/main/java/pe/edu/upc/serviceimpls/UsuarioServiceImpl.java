package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IUsuarioDao;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
public class UsuarioServiceImpl implements IUsuarioService {
	@Inject
	private IUsuarioDao uDao;

	@Override
	public void insertar(Usuario u) {
		uDao.insertar(u);

	}

	@Override
	public List<Usuario> listar() {

		return uDao.listar();
	}

}
