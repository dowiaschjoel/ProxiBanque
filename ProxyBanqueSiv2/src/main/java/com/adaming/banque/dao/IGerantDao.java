package com.adaming.banque.dao;

import java.util.List;

import com.adaming.banque.entities.Gerant;

public interface IGerantDao {
	
	void saveGerant(Gerant gerant);
	void updateGerant(Gerant gerant);
	void deleteGerant(Gerant gerant);
	Gerant getGerantById (int id);
	List<Gerant> getAllGerant();

}
