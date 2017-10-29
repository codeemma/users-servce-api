package com.codeemma.repo;

import com.codeemma.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by emmanuel on 10/29/17.
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
