package dev.diegofernando.application.core.service;

import dev.diegofernando.application.core.domain.Usuario;
import dev.diegofernando.application.ports.in.SalvarUsuarioServicePort;
import dev.diegofernando.application.ports.out.SalvarUsuarioPort;
import dev.diegofernando.application.ports.out.BuscarEnderecoPort;

public class SalvarUsuarioService implements SalvarUsuarioServicePort {

    private final SalvarUsuarioPort salvarUsuarioPort;

    private final BuscarEnderecoPort buscarEnderecoPort;

    public SalvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort, BuscarEnderecoPort buscarEnderecoPort) {
        this.salvarUsuarioPort = salvarUsuarioPort;
        this.buscarEnderecoPort = buscarEnderecoPort;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario, String cep) {
        var endereco = buscarEnderecoPort.buscar(cep);
        usuario.setEndereco(endereco);
        return salvarUsuarioPort.salvar(usuario);
    }
}
