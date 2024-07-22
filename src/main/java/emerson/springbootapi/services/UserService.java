package emerson.springbootapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emerson.springbootapi.domain.User;
import emerson.springbootapi.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
