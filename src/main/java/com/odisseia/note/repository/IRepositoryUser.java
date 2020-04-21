package com.odisseia.note.repository;

import com.odisseia.note.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryUser extends JpaRepository<User, Long> {

}
