package com.brunoias.ecommerce.backend.domain.port;

import com.brunoias.ecommerce.backend.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository {
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);
}
