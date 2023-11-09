package br.com.JevsRakja.Sprint04.model.dao;

import br.com.JevsRakja.Sprint04.model.vo.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestadorDAO extends JpaRepository<Prestador,Integer> {
}
