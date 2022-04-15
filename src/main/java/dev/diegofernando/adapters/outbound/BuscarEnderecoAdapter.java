package dev.diegofernando.adapters.outbound;

import dev.diegofernando.adapters.outbound.rest.BuscaEnderecoRest;
import dev.diegofernando.application.core.domain.Endereco;
import dev.diegofernando.application.ports.out.BuscarEnderecoPort;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    @Inject
    @RestClient
    BuscaEnderecoRest buscaEnderecoRest;

    @Override
    public Endereco buscar(String cep) {
        return buscaEnderecoRest.buscar(cep);
    }
}
