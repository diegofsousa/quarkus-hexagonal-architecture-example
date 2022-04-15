package dev.diegofernando.adapters.inbound.mapper;

import dev.diegofernando.adapters.inbound.entity.UsuarioEntity;
import dev.diegofernando.application.core.domain.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface UsuarioToUsuarioEntityMapper {
    UsuarioEntity mapper(Usuario usuario);
}
