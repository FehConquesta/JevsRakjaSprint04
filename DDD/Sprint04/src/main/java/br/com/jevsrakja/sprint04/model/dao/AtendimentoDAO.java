package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Interface AtendimentoDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Atendimento,Integer para mostrar que a entidade é o Atendimento
 *  e o tipo da chave primaria é Integer
 */
public interface AtendimentoDAO extends JpaRepository<Atendimento, Integer> {
}
