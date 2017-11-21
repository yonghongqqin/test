package com.hengdu.core.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hengdu.core.model.security.User;

/**
 * Created by Yonghong on NOV 2,2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
