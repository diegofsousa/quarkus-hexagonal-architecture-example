package dev.diegofernando.adapters.inbound;

import dev.diegofernando.adapters.inbound.mapper.UsuarioRequestToUsuarioMapper;
import dev.diegofernando.adapters.inbound.request.UsuarioRequest;
import dev.diegofernando.application.core.domain.Usuario;
import dev.diegofernando.application.ports.in.SalvarUsuarioServicePort;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {

    @Inject
    private SalvarUsuarioServicePort salvarUsuarioServicePort;

    @Inject
    private UsuarioRequestToUsuarioMapper usuarioRequestToUsuarioMapper;

    @POST
    public Usuario salvarUsuario(UsuarioRequest usuarioRequest){
        var usuario = usuarioRequestToUsuarioMapper.mapper(usuarioRequest);
        return salvarUsuarioServicePort.salvarUsuario(usuario, usuarioRequest.getCep());
    }

}
