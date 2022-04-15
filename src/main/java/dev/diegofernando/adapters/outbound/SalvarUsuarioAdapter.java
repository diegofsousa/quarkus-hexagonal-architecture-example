package dev.diegofernando.adapters.outbound;

import dev.diegofernando.adapters.inbound.entity.UsuarioEntity;
import dev.diegofernando.adapters.inbound.mapper.EnderecoToEnderecoEntity;
import dev.diegofernando.adapters.inbound.mapper.UsuarioEntityToUsuario;
import dev.diegofernando.adapters.inbound.mapper.UsuarioToUsuarioEntityMapper;
import dev.diegofernando.adapters.outbound.repository.UsuarioRepository;
import dev.diegofernando.application.core.domain.Usuario;
import dev.diegofernando.application.ports.out.SalvarUsuarioPort;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    UsuarioToUsuarioEntityMapper usuarioToUsuarioEntityMapper;

    @Inject
    EnderecoToEnderecoEntity enderecoToEnderecoEntity;

    @Inject
    UsuarioEntityToUsuario usuarioEntityToUsuario;

    @Transactional
    @Override
    public Usuario salvar(Usuario usuario) {
        var usuarioEntity = usuarioToUsuarioEntityMapper.mapper(usuario);
        var enderecoEntity = enderecoToEnderecoEntity.mapper(usuario.getEndereco());

        usuarioEntity.setEndereco(enderecoEntity);
        usuarioRepository.persist(usuarioEntity);
        return usuarioEntityToUsuario.mapper(usuarioEntity);
    }
}
