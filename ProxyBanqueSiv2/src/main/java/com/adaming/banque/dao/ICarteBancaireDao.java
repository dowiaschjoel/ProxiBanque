package com.adaming.banque.dao;

import java.util.List;

import com.adaming.banque.entities.CarteBancaire;

public interface ICarteBancaireDao {
	
	void saveCarteBancaire(CarteBancaire carteBancaire);
	void updateCarteBancaire(CarteBancaire carteBancaire);
	void deleteCarteBancaire(int id);
	CarteBancaire getCarteBancaireById(int id);
	List<CarteBancaire> getAllCarteBancaire();
}
