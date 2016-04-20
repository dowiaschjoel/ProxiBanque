package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.entities.Client;

public interface IClientService {

	void saveClient(Client client);
	void updateClient(Client client);
	void deleteClient(int id);
	Client getClientById(int id);
	List<Client> getAllClient();
}
