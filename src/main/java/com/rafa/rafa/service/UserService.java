package com.rafa.rafa.service;

import com.rafa.rafa.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
