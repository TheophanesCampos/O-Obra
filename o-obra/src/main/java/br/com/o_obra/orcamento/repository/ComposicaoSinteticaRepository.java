package br.com.o_obra.orcamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.o_obra.orcamento.model.ComposicaoSintetica;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComposicaoSinteticaRepository extends JpaRepository<ComposicaoSintetica, Long> {
	
	@Query(value = "select c from ComposicaoSintetica c where upper(trim(c.descricaoComposicao)) like %?1%")
	List<ComposicaoSintetica> buscarPorDescricaoComposicao(String name);

}
