package emerson.springbootapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import emerson.springbootapi.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	//this is a native method to Springboot and by just delaring it like this 
	//it can be used
	List<Post> findByTitleContainingIgnoreCase(String text);
}
