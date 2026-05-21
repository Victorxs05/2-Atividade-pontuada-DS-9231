package com.example.pontuadatt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FornecedorRepository extends JpaRepository<FornecedorRepository, Long> {
    Optional<FornecedorRepository> findByEmail(String email);

}
