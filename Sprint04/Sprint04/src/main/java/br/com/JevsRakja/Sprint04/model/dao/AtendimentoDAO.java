package br.com.JevsRakja.Sprint04.model.dao;

import br.com.JevsRakja.Sprint04.model.vo.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoDAO extends JpaRepository<Atendimento, Integer> {
}
