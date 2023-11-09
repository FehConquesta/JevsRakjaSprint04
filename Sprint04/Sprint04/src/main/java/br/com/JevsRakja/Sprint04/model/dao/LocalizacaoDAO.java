package br.com.JevsRakja.Sprint04.model.dao;

import br.com.JevsRakja.Sprint04.model.vo.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoDAO extends JpaRepository<Localizacao,Integer> {
}
