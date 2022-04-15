package dev.diegofernando.application.ports.out;

import dev.diegofernando.application.core.domain.Usuario;

public interface SalvarUsuarioPort {
    Usuario salvar(Usuario usuario);
}
