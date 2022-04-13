package com.post.meridiem.repo;

import com.post.meridiem.model.DBUser;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface JPAUserRepo extends CassandraRepository<DBUser, Integer> {
    DBUser findByEmail(String email);
}
