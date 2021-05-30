package com.UserMicroService;

import org.springframework.data.repository.CrudRepository;

public interface UserMSRepository extends CrudRepository<User, Integer> {
}
