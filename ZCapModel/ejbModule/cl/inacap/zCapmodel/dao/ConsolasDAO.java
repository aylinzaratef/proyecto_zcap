package cl.inacap.zCapmodel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.zCapmodel.dto.Consola;

/**
 * Session Bean implementation class ConsolasDAO
 */
@Stateless
@LocalBean
public class ConsolasDAO implements ConsolasDAOLocal {

    /**
     * Default constructor. 
     */
    public ConsolasDAO() {
        // TODO Auto-generated constructor stub
    }
    
    private static List<Consola> consolas = new ArrayList<>();

	@Override
	public void save(Consola consola) {
		consolas.add(consola);
		
	}

	@Override
	public List<Consola> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Consola consola) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Consola> filterByName(String nombre) {
		
		
		return consolas.stream().filter(c->c.getNombre().contains(nombre)).collect(Collectors.toList());

	}

}
