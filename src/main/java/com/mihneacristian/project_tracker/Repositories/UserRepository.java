package com.mihneacristian.project_tracker.Repositories;

import com.mihneacristian.project_tracker.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mihneacristian.project_tracker.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
	User findByEmail (String email);
}
