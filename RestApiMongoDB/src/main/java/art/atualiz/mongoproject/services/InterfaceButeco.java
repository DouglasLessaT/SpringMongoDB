package art.atualiz.mongoproject.services;

import java.util.List;

import art.atualiz.mongoproject.models.Buteco;

public interface InterfaceButeco {

    public List<Buteco> listarTodos();

    public Buteco buscarPorId(String id);

    public Buteco cadastrar(Buteco buteco);

    public Buteco atualizar(Buteco buteco);

    public boolean excluir(String id);



}
