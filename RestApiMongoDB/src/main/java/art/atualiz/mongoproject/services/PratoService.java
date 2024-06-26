package art.atualiz.mongoproject.services;

import art.atualiz.mongoproject.models.Buteco;
import art.atualiz.mongoproject.models.Prato;
import art.atualiz.mongoproject.repositories.PratosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PratoService implements InterfacePrato {

    @Autowired
    private PratosRepository pratosRepository;

    @Autowired
    private ButecoService butecoService;  // Você pode injetar o serviço do Buteco aqui para manipular associações

    @Override
    public Prato criarPrato(Prato prato) {
        // Certifique-se de que o prato tenha um Buteco associado
        if (prato.getButeco() == null || prato.getButeco().getId() == null) {
            throw new IllegalArgumentException("É necessário associar um Buteco ao Prato.");
        }

        // Busca o Buteco pelo ID para garantir que exista
        Buteco buteco = butecoService.buscarPorId(prato.getButeco().getId());
        
        // Adiciona o prato à lista de pratos do Buteco, se necessário
        if (!buteco.getPratos().contains(prato)) {
            buteco.getPratos().add(prato);
            butecoService.atualizar(buteco);  // Atualiza o Buteco para persistir a associação
        }

        return pratosRepository.save(prato);
    }

    @Override
    public Prato atualizarPrato(String id, Prato prato) {
        Optional<Prato> optionalPrato = pratosRepository.findById(id);
        if (optionalPrato.isPresent()) {
            prato.setId(id);
            
            // Certifique-se de que o prato tenha um Buteco associado
            if (prato.getButeco() == null || prato.getButeco().getId() == null) {
                throw new IllegalArgumentException("É necessário associar um Buteco ao Prato.");
            }

            // Busca o Buteco pelo ID para garantir que exista
            Buteco buteco = butecoService.buscarPorId(prato.getButeco().getId());
            
            // Atualiza a lista de pratos do Buteco, se necessário
            if (!buteco.getPratos().contains(prato)) {
                buteco.getPratos().add(prato);
                butecoService.atualizar(buteco);  // Atualiza o Buteco para persistir a associação
            }

            return pratosRepository.save(prato);
        }
        return null;
    }

    @Override
    public boolean deletarPrato(String id) {
        Optional<Prato> optionalPrato = pratosRepository.findById(id);
        if (optionalPrato.isPresent()) {
            Prato prato = optionalPrato.get();
            
            // Remove o prato da lista de pratos do Buteco associado
            if (prato.getButeco() != null && prato.getButeco().getId() != null) {
                Buteco buteco = butecoService.buscarPorId(prato.getButeco().getId());
                buteco.getPratos().remove(prato);
                butecoService.atualizar(buteco);  // Atualiza o Buteco para persistir a remoção
            }
            
            pratosRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Prato buscarPratoPorId(String id) {
        Optional<Prato> optionalPrato = pratosRepository.findById(id);
        return optionalPrato.orElse(null);
    }

    @Override
    public List<Prato> listarTodosPratos() {
        return pratosRepository.findAll();
    }
}