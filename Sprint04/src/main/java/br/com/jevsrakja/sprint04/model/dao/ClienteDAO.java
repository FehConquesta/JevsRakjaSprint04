package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *  Interface ClienteDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Cliente,Integer para mostrar que a entidade é o Cliente
 *  e o tipo da chave primaria é Integer
 */
public interface ClienteDAO extends JpaRepository<Cliente,Integer> {
}
