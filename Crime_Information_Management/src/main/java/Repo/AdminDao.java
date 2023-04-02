package Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Admin;



public interface AdminDao extends JpaRepository<Admin, Integer>{

}
