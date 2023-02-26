package com.stefanini.service;

import com.stefanini.repository.VincularRepository;
import org.jboss.resteasy.spi.UnhandledException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class VincularService {

    @Inject
    VincularRepository vincularRepository;

    public void vincular(Long idJogador, Long idStefamon){
        try {
            vincularRepository.vincularJogadorStefanon(idJogador, idStefamon);
        }catch (UnhandledException e){
            System.out.println("Erro" + e.getMessage());
        }
    }

}
