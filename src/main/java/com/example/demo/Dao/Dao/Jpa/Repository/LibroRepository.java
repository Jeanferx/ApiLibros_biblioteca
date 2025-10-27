package com.example.demo.Dao.Dao.Jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Dao.Dao.Jpa.Entity.LibroEntity;

@Repository
public interface LibroRepository extends JpaRepository<LibroEntity,Integer>{

}
