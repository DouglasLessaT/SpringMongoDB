package art.atualiz.mongoproject.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pratos")
public class Prato {

 @Id
 private String id;

 private String nome;

 private String descricao;

 private Long nota;

 @DBRef
 private Buteco buteco;
}