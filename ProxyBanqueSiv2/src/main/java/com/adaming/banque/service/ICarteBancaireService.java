package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.entities.CarteBancaire;

public interface ICarteBancaireService {

	void saveCarteBancaire(CarteBancaire carteBancaire);
	void updateCarteBancaire(CarteBancaire carteBancaire);
	void deleteCarteBancaire(int id);
	CarteBancaire getCarteBancaireById(int id);
	List<CarteBancaire> getAllCarteBancaire();
}
