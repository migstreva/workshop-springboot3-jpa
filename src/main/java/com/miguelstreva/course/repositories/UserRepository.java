package com.miguelstreva.course.repositories;

import com.miguelstreva.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
