package pe.idat.edu.repository.ec3.Smitheffio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.model.ec3.Smitheffio.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
