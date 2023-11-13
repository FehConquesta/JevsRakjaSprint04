package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *  Interface LocalizacaoDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Localizacao,Integer para mostrar que a entidade é o Localizacao
 *  e o tipo da chave primaria é Integer
 */
public interface LocalizacaoDAO extends JpaRepository<Localizacao,Integer> {
}
