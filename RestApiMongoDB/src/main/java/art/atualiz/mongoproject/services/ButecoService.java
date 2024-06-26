package art.atualiz.mongoproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import art.atualiz.mongoproject.models.Buteco;
import art.atualiz.mongoproject.repositories.ButecoRepository;

@Service
public class ButecoService implements InterfaceButeco{

    @Autowired
    private ButecoRepository butecoRepositorio;

    @Override
    public List<Buteco> listarTodos() {
        return this.butecoRepositorio.findAll();
        
    }

    @Override
    public Buteco buscarPorId(String id) {
        Optional<Buteco> optional = this.butecoRepositorio.findById(id);

        if (optional.isPresent()) {
            return optional.get();
            
        }else{
            
            throw new RuntimeException("Registro não encontrado");
        }


    }

    @Override
    public Buteco cadastrar(Buteco buteco) {
        
        if (buteco.getId() != null || buteco.getId() != "") {
            buteco.setId(null);
            
        }
    return this.butecoRepositorio.save(buteco);
    }

    @Override
    public Buteco atualizar(Buteco buteco) {

        return this.butecoRepositorio.save(buteco);
    }

    @Override
    public boolean excluir(String id) {
        this.butecoRepositorio.deleteById(id);
        return true;
    }
}
