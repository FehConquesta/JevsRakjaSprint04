package br.com.JevsRakja.Sprint04.model.dao;

import br.com.JevsRakja.Sprint04.model.vo.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteDAO extends JpaRepository<Fabricante,Integer> {
}
