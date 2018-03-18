package org.spring.security.custome.practise.repository;

import org.spring.security.custome.practise.entity.Spitter;

public interface SpidderUserRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
