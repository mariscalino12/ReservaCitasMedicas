package com.elp.ReservasMedicas.service;

import com.elp.ReservasMedicas.Controller.dto.EspecialidadRequest;
import com.elp.ReservasMedicas.Controller.dto.EspecialidadResponse;

import java.util.Collection;

public interface EspecialidadService {

    Collection<EspecialidadResponse> findAllEspecialidad();

    EspecialidadResponse findByIdEspecialidad(Long idEspecialidad);

    void  saveEspecialidad(EspecialidadRequest request);

    void updateEspecialidad(Long Id, EspecialidadRequest request);

    void deleteEspecialidad(Long idEspecialidad);
}
