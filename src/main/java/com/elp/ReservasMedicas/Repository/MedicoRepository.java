package com.elp.ReservasMedicas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elp.ReservasMedicas.Model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
