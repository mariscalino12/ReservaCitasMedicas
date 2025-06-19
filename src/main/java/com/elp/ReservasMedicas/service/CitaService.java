package com.elp.ReservasMedicas.service;

import com.elp.ReservasMedicas.Controller.dto.CitaRequest;
import com.elp.ReservasMedicas.Controller.dto.CitaResponse;

import java.util.Collection;

public interface CitaService {

    Collection <CitaResponse> findAllCitas();

    CitaResponse findByIdCita(Long idCita);

    void  saveCita(CitaRequest request);

    void updateCita(Long Id, CitaRequest request);

    void deleteCita(Long idCita);

}
