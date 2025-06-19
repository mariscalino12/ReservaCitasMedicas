package com.elp.ReservasMedicas.service;

import com.elp.ReservasMedicas.Controller.dto.ConsultorioRequest;
import com.elp.ReservasMedicas.Controller.dto.ConsultorioResponse;

import java.util.Collection;

public interface ConsultorioService {

    Collection<ConsultorioResponse> findAllConsultorio();

    ConsultorioResponse findByIdConsultorio(Long idConsultorio);

    void  saveConsultorio(ConsultorioRequest request);

    void updateConsultorio(Long Id, ConsultorioRequest request);

    void deleteConsultorio(Long idConsultoio);
}
