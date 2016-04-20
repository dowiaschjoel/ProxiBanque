package com.adaming.banque.dao;

import java.util.List;

import com.adaming.banque.entities.Client;

public interface IClientDao {
	
	void saveClient(Client client);
	void updateClient(Client client);
	void deleteClient(int id);
	Client getClientById(int id);
	List<Client> getAllClient();
}
