package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.dao.IClientDao;
import com.adaming.banque.entities.Client;

public class ClientServiceImpl implements IClientService {
	
	private IClientDao clientDao;

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	public void saveClient(Client client) {
		clientDao.saveClient(client);

	}

	public void updateClient(Client client) {
		clientDao.updateClient(client);

	}

	public void deleteClient(int id) {
		clientDao.deleteClient(id);

	}

	public Client getClientById(int id) {
		return clientDao.getClientById(id);
	}

	public List<Client> getAllClient() {
		return clientDao.getAllClient();
	}

}
