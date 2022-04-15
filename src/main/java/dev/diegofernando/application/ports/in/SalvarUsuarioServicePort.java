package dev.diegofernando.application.ports.in;

import dev.diegofernando.application.core.domain.Usuario;

public interface SalvarUsuarioServicePort {
    Usuario salvarUsuario(Usuario usuario, String cep);
}
