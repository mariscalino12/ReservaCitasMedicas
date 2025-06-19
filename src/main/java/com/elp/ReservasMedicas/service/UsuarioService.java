package com.elp.ReservasMedicas.service;

import com.elp.ReservasMedicas.Controller.dto.UsuarioRequest;
import com.elp.ReservasMedicas.Controller.dto.UsuarioResponse;

import java.util.Collection;

public interface UsuarioService {

    Collection<UsuarioResponse> findAllUsuario();

    UsuarioResponse findByIdUsuario(Long idUsuario);

    void  saveUsuario(UsuarioRequest request);

    void updateUusario(Long Id, UsuarioRequest request);

    void deleteUsuario(Long idUsuario);
}
