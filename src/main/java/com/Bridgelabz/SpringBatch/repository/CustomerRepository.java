package com.Bridgelabz.SpringBatch.repository;

import com.Bridgelabz.SpringBatch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<User,Integer>
{

}
