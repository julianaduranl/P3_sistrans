package proyecto3.BacAndes;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasRepository extends MongoRepository<Pas, ObjectId> {
}