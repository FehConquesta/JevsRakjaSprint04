package br.com.JevsRakja.Sprint04.model.dao;

import br.com.JevsRakja.Sprint04.model.vo.Modal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModalDAO extends JpaRepository<Modal,Integer> {
}
