package com.adaming.banque.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.banque.entities.CarteBancaire;

@Repository("ICarteBancaireDao")
@Transactional
public class CarteBancaireDaoImpl implements ICarteBancaireDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}	
	
	public void saveCarteBancaire(CarteBancaire carteBancaire) {
		getSession().save(carteBancaire);

	}

	public void updateCarteBancaire(CarteBancaire carteBancaire) {
		getSession().update(carteBancaire);

	}

	@SuppressWarnings("unchecked")
	public void deleteCarteBancaire(int id) {
		String reqHQLGetById = "FROM cartesBancaires WHERE numero_carte = ?";
		List<CarteBancaire> result = (List<CarteBancaire>) getSession().createQuery(reqHQLGetById);
		result.get(0);  
	    getSession().delete(result);  
	}

	@SuppressWarnings("unchecked")
	public CarteBancaire getCarteBancaireById(int id) {
		String reqHQLGetById = "FROM cartesBancaires WHERE numero_carte = ?";

		List<CarteBancaire> carteBancaireListe = (List<CarteBancaire>) getSession().createQuery(reqHQLGetById);
		return carteBancaireListe.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<CarteBancaire> getAllCarteBancaire() {
		
		String reqHQLGetAll = "SELECT * FROM cartesBancaires";		
		return (List<CarteBancaire>) getSession().createQuery(reqHQLGetAll);
	}

}
