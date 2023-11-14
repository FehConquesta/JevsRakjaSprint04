package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *  Interface SeguroDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Seguro,String para mostrar que a entidade é o Seguro
 *  e o tipo da chave primaria é String
 */
public interface SeguroDAO extends JpaRepository<Seguro,String> {
}
