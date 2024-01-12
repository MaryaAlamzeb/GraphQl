package com.graphql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.demo.entity.Author;


public interface AuthorRepository extends JpaRepository<Author, Long> 
{

}
