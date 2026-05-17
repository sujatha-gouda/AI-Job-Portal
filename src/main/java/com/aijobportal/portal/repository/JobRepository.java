package com.aijobportal.portal.repository;

import com.aijobportal.portal.model.Job;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Integer> {

}