package cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GerenciarCliente {

	private int id;
	private HashMap<Integer, Cliente> clientes;
	
	public GerenciarCliente()
	{
		id = 0;
		clientes = new HashMap<>();
	}
	
	public void cadastrar(Cliente cliente)
	{
		id++;
		cliente.setId(id);
		clientes.put(id, cliente);
	}
	
	public void atualizar(Cliente cliente)
	{
		clientes.put(cliente.getId(), cliente);
	}
	
	public List<Cliente> listar()
	{
		return new ArrayList<>(clientes.values());
	}
	
	public void remover(int id)
	{
		clientes.remove(id);
	}
	
	public Cliente findById(int id)
	{
		return clientes.get(id);
	}
	
	
	
	
	
	
	
	
	
	
}
