package br.com.med.clinica.atendimento.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.med.clinica.atendimento.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

	List<Item> findAll();

}
