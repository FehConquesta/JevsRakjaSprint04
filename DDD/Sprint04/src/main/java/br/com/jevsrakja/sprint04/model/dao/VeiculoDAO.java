package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *  Interface VeiculoDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Veiculo,Integer para mostrar que a entidade é o Veiculo
 *  e o tipo da chave primaria é Integer
 */
public interface VeiculoDAO extends JpaRepository<Veiculo,Integer> {
}
