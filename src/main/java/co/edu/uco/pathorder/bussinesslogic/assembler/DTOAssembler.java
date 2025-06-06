package co.edu.uco.pathorder.bussinesslogic.assembler;

import co.edu.uco.pathorder.bussinesslogic.businesslogic.domain.AdministradorDomain;
import co.edu.uco.pathorder.dto.AdministradorDTO;

import java.util.List;

public interface DTOAssembler<T, D> {

    D toDomain(T dto);

    T toDTO(D domain);

    List<T> toDTOs(List<D> domains);

    List<D> toDomains(List<T> dtos);
}
