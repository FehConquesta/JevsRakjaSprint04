package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteDAO extends JpaRepository<Fabricante,Integer> {
}
