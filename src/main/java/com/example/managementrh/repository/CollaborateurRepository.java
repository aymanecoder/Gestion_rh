package com.example.managementrh.repository;


import com.example.managementrh.models.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateurRepository extends JpaRepository<Collaborateur,Long> {

}
