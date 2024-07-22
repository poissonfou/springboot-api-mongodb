package emerson.springbootapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import emerson.springbootapi.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
