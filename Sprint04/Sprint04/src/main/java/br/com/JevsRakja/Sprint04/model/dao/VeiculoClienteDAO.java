package br.com.JevsRakja.Sprint04.model.dao;

import br.com.JevsRakja.Sprint04.model.vo.VeiculoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoClienteDAO extends JpaRepository<VeiculoCliente,Integer> {
}
