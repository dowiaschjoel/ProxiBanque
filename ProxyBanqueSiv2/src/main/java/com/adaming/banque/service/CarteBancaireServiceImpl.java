package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.dao.ICarteBancaireDao;
import com.adaming.banque.entities.CarteBancaire;

public class CarteBancaireServiceImpl implements ICarteBancaireService {
	
	private ICarteBancaireDao carteBancaireDao;

	public void setCarteBancaireDao(ICarteBancaireDao carteBancaireDao) {
		this.carteBancaireDao = carteBancaireDao;
	}

	public void saveCarteBancaire(CarteBancaire carteBancaire) {
		carteBancaireDao.saveCarteBancaire(carteBancaire);

	}

	public void updateCarteBancaire(CarteBancaire carteBancaire) {
		carteBancaireDao.updateCarteBancaire(carteBancaire);

	}

	public void deleteCarteBancaire(int id) {
		carteBancaireDao.deleteCarteBancaire(id);

	}

	public CarteBancaire getCarteBancaireById(int id) {
		return carteBancaireDao.getCarteBancaireById(id);
	}

	public List<CarteBancaire> getAllCarteBancaire() {
		return carteBancaireDao.getAllCarteBancaire();
	}

}
