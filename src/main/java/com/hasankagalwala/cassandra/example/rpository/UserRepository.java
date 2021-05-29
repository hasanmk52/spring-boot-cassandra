package com.hasankagalwala.cassandra.example.rpository;

import java.util.List;

import com.hasankagalwala.cassandra.example.model.User;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, Integer> {

	@AllowFiltering
	List<User> findByAgeGreaterThan(int age);

}
