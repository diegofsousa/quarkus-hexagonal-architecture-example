package dev.diegofernando.application.ports.out;

import dev.diegofernando.application.core.domain.Endereco;

public interface BuscarEnderecoPort {

    Endereco buscar(String cep);

}
