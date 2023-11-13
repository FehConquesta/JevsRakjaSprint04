package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *  Interface FabricanteDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Fabricante,Integer para mostrar que a entidade é o Fabricante
 *  e o tipo da chave primaria é Integer
 */
public interface FabricanteDAO extends JpaRepository<Fabricante,Integer> {
}
