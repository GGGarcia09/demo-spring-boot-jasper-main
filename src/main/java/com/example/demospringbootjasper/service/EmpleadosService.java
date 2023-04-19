package com.example.demospringbootjasper.service;

import org.springframework.stereotype.Service;
import com.example.demospringbootjasper.model.ValoracionTriageDTO;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadosService {

    public List<ValoracionTriageDTO> getEmpleados() {
        return getEmpleadosList();
    }

    private List<ValoracionTriageDTO> getEmpleadosList(){
        List<ValoracionTriageDTO> empleadoss = new ArrayList<ValoracionTriageDTO>();
        empleadoss.add(new ValoracionTriageDTO(1, "MEXICO", "OAXACA", "N/D", "OAXACA DE JUÁREZ", "REFORMA", "VALLES CENTRALES", "DE HOSPITALIZACIÓN", "SEGUNDO", "", "", "","","",""));
        return empleadoss;
    }

}
