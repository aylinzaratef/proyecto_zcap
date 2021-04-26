package cl.inacap.zCapmodel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.zCapmodel.dto.Consola;

@Local
public interface ConsolasDAOLocal {
	
	void save(Consola consola);
	List<Consola> getAll();
	void delete(Consola consola);
	List<Consola> filterByName(String nombre);

}
