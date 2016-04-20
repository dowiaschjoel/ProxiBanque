package com.adaming.banque.dao;

import java.util.List;

import com.adaming.banque.entities.Client;

public interface IClientDao {
	
	void saveStock(Client client);
	void updateStock(Client client);
	void deleteStock(int id);
	Client getClientById(int id);
	List<Client> getAllClient();
}
