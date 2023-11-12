package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente,Integer> {
}
