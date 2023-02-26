package com.stefanini.resources;

import com.stefanini.dto.VincularDTO;
import com.stefanini.entity.Jogador;
import com.stefanini.service.JogadorService;
import com.stefanini.service.VincularService;
import org.jboss.resteasy.spi.UnhandledException;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/vincular")
public class VincularResource {

    @Inject
    VincularService vincularService;

    @POST
    public Response vincular(@Valid VincularDTO vincularDTO) {
        vincularService.vincular(vincularDTO.getIdJogador(), vincularDTO.getIdStefamon());
        return Response.status(Response.Status.OK).build();
    }



}
