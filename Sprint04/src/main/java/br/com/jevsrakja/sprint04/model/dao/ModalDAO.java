package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Modal;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *  Interface ModalDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Modal,Integer para mostrar que a entidade é o Modal
 *  e o tipo da chave primaria é Integer
 */
public interface ModalDAO extends JpaRepository<Modal,Integer> {
}
