package in.leadr.leadrapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.leadr.leadrapplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String userName);
}
