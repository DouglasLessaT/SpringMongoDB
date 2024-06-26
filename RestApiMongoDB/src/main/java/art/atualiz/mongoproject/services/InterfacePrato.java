package art.atualiz.mongoproject.services;

import art.atualiz.mongoproject.models.Prato;

import java.util.List;

public interface InterfacePrato {

    Prato criarPrato(Prato prato);

    Prato atualizarPrato(String id, Prato prato);

    boolean deletarPrato(String id);

    Prato buscarPratoPorId(String id);

    List<Prato> listarTodosPratos();
}