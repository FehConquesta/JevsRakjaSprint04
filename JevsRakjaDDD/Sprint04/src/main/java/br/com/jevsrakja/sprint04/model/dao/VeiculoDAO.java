package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoDAO extends JpaRepository<Veiculo,Integer> {
}
