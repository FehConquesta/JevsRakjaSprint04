package br.com.jevsrakja.sprint04.model.dao;

import br.com.jevsrakja.sprint04.model.vo.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoDAO extends JpaRepository<Localizacao,Integer> {
}
