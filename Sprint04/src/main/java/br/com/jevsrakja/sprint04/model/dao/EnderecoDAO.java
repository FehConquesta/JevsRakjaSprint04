package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *  Interface EnderecoDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Endereco,Integer para mostrar que a entidade é o Endereco
 *  e o tipo da chave primaria é Integer
 */
public interface EnderecoDAO extends JpaRepository<Endereco,Integer> {
}
