package dto;

import model.Persona;


//En las instrucciones dice que debe devolver una estructura con "dos campos". Por lo cual, Aquí generaré dicha estructura a devolver
//El primer campo será "usuario" el cual contendrá un objeto PersonaDTO
//El segundo campo será el código de estado.

public record ResponseDTO(
        PersonaDTO usuario,
        String status
) {
}
