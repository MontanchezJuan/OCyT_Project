package com.ocyt_backend.ocyt_backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import com.ocyt_backend.ocyt_backend.models.DisenoConcedido;

public interface DisenoConcedidoRepository extends Neo4jRepository<DisenoConcedido, Integer> {
   @Query("MATCH (d:DisenoConcedido) WHERE d.Ciudad = $ciudad RETURN d")
   Optional<List<DisenoConcedido>> findByCiudad(@Param("ciudad") String ciudad);
   
   @Query("MATCH (d:DisenoConcedido) WHERE d.Ciudad IS NOT NULL RETURN DISTINCT d.Ciudad AS Ciudad")
   Optional<List<String>> getAllCiudad();
   
   @Query("MATCH (d:DisenoConcedido) WHERE d.Region = $region RETURN d")
    Optional<List<DisenoConcedido>> findByRegion(@Param("region") String region);
    
    @Query("MATCH (d:DisenoConcedido) WHERE d.Region IS NOT NULL RETURN DISTINCT d.Region AS Region")
    Optional<List<String>> getAllRegion(); 
}
