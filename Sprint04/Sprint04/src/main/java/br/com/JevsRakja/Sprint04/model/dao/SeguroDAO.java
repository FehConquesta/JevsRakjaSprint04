package br.com.JevsRakja.Sprint04.model.dao;

import br.com.JevsRakja.Sprint04.model.vo.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguroDAO extends JpaRepository<Seguro,String> {
}
