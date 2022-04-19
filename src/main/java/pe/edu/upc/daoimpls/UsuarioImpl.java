package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerfaces.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

public class UsuarioImpl implements IUsuarioDao {
	@PersistenceContext(unitName = "TF_Jim")
	private EntityManager em;

	@Override
	public void insertar(Usuario u) {
		try {
			em.persist(u);// insertar
		} catch (Exception e) {
			System.out.println("Error al insertar en UsuarioImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listar() {
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();

		try {
			Query jpql = em.createQuery("from Usuario u");
			listaUsuarios = (List<Usuario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en UsuarioImpl");
		}
		return listaUsuarios;
	}

}
