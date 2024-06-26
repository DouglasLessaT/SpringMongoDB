package art.atualiz.mongoproject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import art.atualiz.mongoproject.models.Buteco;

public interface ButecoRepository extends MongoRepository<Buteco, String>{
 
}
