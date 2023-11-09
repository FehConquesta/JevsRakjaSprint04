package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestadorDAO extends JpaRepository<Prestador,Integer> {
}
