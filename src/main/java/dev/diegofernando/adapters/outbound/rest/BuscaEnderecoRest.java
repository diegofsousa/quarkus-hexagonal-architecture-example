package dev.diegofernando.adapters.outbound.rest;

import dev.diegofernando.application.core.domain.Endereco;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("ws")
@RegisterRestClient(baseUri = "https://viacep.com.br")
public interface BuscaEnderecoRest {

    @GET
    @Path("/{cep}/json")
    Endereco buscar(@PathParam("cep") String cep);
}
