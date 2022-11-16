package pe.idat.edu.service.ec3.Smitheffio;

import java.util.List;

import pe.idat.edu.model.ec3.Smitheffio.Cliente;

public interface ClienteService {
	void guardarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	Cliente obtenerClienteId(Integer id);
}
