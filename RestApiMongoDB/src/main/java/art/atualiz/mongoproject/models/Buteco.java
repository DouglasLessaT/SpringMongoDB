package art.atualiz.mongoproject.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("butecos")
public class Buteco {

    @Id
    private String id;

    private String nome;
    private String endereco; 
    private String nota;

    private List<Prato> pratos = new ArrayList<>(); 

}