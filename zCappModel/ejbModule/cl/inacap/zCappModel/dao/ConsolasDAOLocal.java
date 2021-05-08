package cl.inacap.zCappModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.zCappModel.dto.Consola;

@Local
public interface ConsolasDAOLocal {
 
	void save(Consola consola);
	List<Consola> getAll();
	void delete(Consola consola);
	List<Consola> filterByName(String Name);
}
