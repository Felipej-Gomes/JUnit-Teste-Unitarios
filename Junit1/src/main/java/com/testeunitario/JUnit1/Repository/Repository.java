package com.testeunitario.JUnit1.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.testeunitario.JUnit1.model.ContatoModel;

public interface Repository extends JpaRepository<ContatoModel, Long> {

}