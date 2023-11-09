package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoDAO extends JpaRepository<Endereco,Integer> {
}
