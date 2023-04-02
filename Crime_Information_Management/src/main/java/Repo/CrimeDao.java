package Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Crime;



public interface CrimeDao extends JpaRepository<Crime, Integer>{

}
