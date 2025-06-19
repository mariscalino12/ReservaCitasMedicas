package com.elp.ReservasMedicas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elp.ReservasMedicas.Model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
