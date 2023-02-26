package com.stefanini.repository;

import com.stefanini.dao.GenericDAO;
import com.stefanini.dto.VincularDTO;
import com.stefanini.entity.Stefamon;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;
import java.util.List;

@ApplicationScoped
public class VincularRepository extends GenericDAO<VincularDTO, Long> {

    public boolean vincularJogadorStefanon(Long idJogador, Long idStefanon) {
        String sql = "INSERT INTO jogador_stefamon (IdJogador, Id) VALUES (?, ?)";
        Query query = createNativeQuery(sql);
        query.setParameter(1, idJogador);
        query.setParameter(2, idStefanon);
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().persist(query);
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}
