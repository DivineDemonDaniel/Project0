package Services;

import java.util.List;

import Model.Client;

public interface ClientService {

	public Client getClient (int id) ;
	public Client getClient(String name); 
	public List<Client> getAllClients();
	public Client withdraw (double money);
	public boolean addClient(Client a); 
	public boolean updateClient(Client change);
	public boolean deleteClient(int id);

}
