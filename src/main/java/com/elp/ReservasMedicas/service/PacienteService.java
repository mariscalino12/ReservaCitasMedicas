package com.elp.ReservasMedicas.service;

import com.elp.ReservasMedicas.Controller.dto.UsuarioRequest;
import com.elp.ReservasMedicas.Controller.dto.UsuarioResponse;

import java.util.Collection;

public interface PacienteService {

    Collection<UsuarioResponse> findAllUsuario();

    UsuarioResponse findByIdUsuario(Long idPaciente);

    void  saveUsuario(UsuarioRequest request);

    void updateUsuario(Long Id, UsuarioRequest request);

    void deleteUsuario(Long idUsuario);
}
