package com.example.lab3_20192270.repository;

import com.example.lab3_20192270.entity.HospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity, Integer> {
    List<HospitalEntity> findByCompanyName(String name);

    List<HospitalEntity> findByCompanyNameOrPhone(String n, String p);

    @Query(nativeQuery = true,value = "select * from hospital where nombre = ?1")
    List<HospitalEntity> buscarPorNombre(String nombre);

    @Query(nativeQuery = true, value = "select * from shippers where CompanyName like %?1%")
    List<HospitalEntity> buscarParcialPorNombre(String nombre);

}














