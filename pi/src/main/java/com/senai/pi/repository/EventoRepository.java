package com.senai.pi.repository;

import org.springframework.data.repository.CrudRepository;

import com.senai.pi.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findByCodigo(long codigo);
}
