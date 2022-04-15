package dev.diegofernando.config;

import dev.diegofernando.application.core.service.SalvarUsuarioService;
import dev.diegofernando.application.ports.out.BuscarEnderecoPort;
import dev.diegofernando.application.ports.out.SalvarUsuarioPort;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;

@Dependent
public class Config {

    @Default
    public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort,
                                                     BuscarEnderecoPort buscarEnderecoPort) {
        return new SalvarUsuarioService(salvarUsuarioPort, buscarEnderecoPort);
    }
}
