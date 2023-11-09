package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguroDAO extends JpaRepository<Seguro,String> {
}
