package dev.diegofernando.adapters.inbound.mapper;

import dev.diegofernando.adapters.inbound.request.UsuarioRequest;
import dev.diegofernando.application.core.domain.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface UsuarioRequestToUsuarioMapper {
    Usuario mapper(UsuarioRequest usuarioRequest);
}
