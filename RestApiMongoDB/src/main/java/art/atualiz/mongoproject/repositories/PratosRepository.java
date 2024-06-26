package art.atualiz.mongoproject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import art.atualiz.mongoproject.models.Prato;

public interface PratosRepository extends MongoRepository<Prato, String>{
 
}
