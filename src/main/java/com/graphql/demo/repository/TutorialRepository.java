package com.graphql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.demo.entity.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> 
{

}
