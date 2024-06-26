package art.atualiz.mongoproject.controlllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import art.atualiz.mongoproject.models.Buteco;
import art.atualiz.mongoproject.services.InterfaceButeco;

@RestController
@RequestMapping("/buteco")
public class ButecoController {

    private InterfaceButeco butecoService;

    @Autowired
    public ButecoController(InterfaceButeco butecoService) {
        this.butecoService = butecoService;
    }

    @PostMapping
    public ResponseEntity<Buteco> cadastrarButeco(@RequestBody Buteco buteco) {
        Buteco novoButeco = butecoService.cadastrar(buteco);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoButeco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Buteco> atualizarButeco(@PathVariable String id, @RequestBody Buteco buteco) {
        buteco.setId(id); // Garantir que o ID está correto para atualização
        Buteco butecoAtualizado = butecoService.atualizar(buteco);
        if (butecoAtualizado != null) {
            return ResponseEntity.ok(butecoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirButeco(@PathVariable String id) {
        boolean deletado = butecoService.excluir(id);
        if (deletado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Buteco> buscarButecoPorId(@PathVariable String id) {
        Buteco buteco = butecoService.buscarPorId(id);
        if (buteco != null) {
            return ResponseEntity.ok(buteco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Buteco>> listarTodosButecos() {
        List<Buteco> butecos = butecoService.listarTodos();
        return ResponseEntity.ok(butecos);
    }
}
