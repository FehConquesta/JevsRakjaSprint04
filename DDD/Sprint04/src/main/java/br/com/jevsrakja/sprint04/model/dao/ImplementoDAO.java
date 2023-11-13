package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Implemento;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *  Interface ImplementoDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Implemento,Integer para mostrar que a entidade é o Implemento
 *  e o tipo da chave primaria é Integer
 */
public interface ImplementoDAO extends JpaRepository<Implemento,Integer> {
}
