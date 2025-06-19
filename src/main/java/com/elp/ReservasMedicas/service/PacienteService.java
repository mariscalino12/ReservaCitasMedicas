package com.elp.ReservasMedicas.service;

import com.elp.ReservasMedicas.Controller.dto.PacienteRequest;
import com.elp.ReservasMedicas.Controller.dto.PacienteResponse;
import com.elp.ReservasMedicas.Controller.dto.UsuarioRequest;
import com.elp.ReservasMedicas.Controller.dto.UsuarioResponse;

import java.util.Collection;

public interface PacienteService {

    Collection<PacienteResponse> findAllPaciente();

    PacienteResponse findByIdPaciente(Long idPaciente);

    void  savePaciente(PacienteRequest request);

    void updatePaciente(Long Id, PacienteRequest request);

    void deletePaciente(Long idPaciente);
}
