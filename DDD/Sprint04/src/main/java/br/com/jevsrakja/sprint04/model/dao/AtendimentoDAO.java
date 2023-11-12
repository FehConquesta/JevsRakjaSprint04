package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoDAO extends JpaRepository<Atendimento, Integer> {
}
