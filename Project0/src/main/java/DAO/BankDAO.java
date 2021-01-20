package DAO;

import java.util.List;

import Model.Client;

/*
 CREATE procedures: Performs the INSERT statement to create a new record.
READ procedures: Reads the table records based on the primary keynoted within the input parameter.
UPDATE procedures: Executes an UPDATE statement on the table based on the specified primary key for a record within the WHERE clause of the statement.
DELETE procedures: Deletes a specified row in the WHERE clause.
 */
public interface BankDAO {

	public Client getClient (int id) ;
	public Client getClient(String name); 
	public List<Client> getAllClients();
	public Client withdraw (double money); //  performs operation to change the amount of money in the account
	public boolean addClient(Client a); 
	public boolean updateClient(Client change);
	public boolean deleteClient(int id);
}
