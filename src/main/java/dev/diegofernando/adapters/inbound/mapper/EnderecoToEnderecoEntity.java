package dev.diegofernando.adapters.inbound.mapper;

import dev.diegofernando.adapters.inbound.entity.EnderecoEntity;
import dev.diegofernando.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface EnderecoToEnderecoEntity {
    EnderecoEntity mapper(Endereco endereco);
}
