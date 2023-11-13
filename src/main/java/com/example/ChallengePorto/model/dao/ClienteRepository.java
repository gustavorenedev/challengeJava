package com.example.ChallengePorto.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ChallengePorto.model.vo.Cliente;

//Interface que estende JpaRepository para operações CRUD em entidades Cliente com chave primária Long
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    // Método personalizado para verificar se um cliente com o CPF fornecido já existe
    boolean existsByCpf(String cpf);
    
 // Método personalizado para verificar se um cliente com o CPF fornecido já existe
    boolean existsByApolice(int apolice);
    
 // Método personalizado para verificar se um cliente com o CPF fornecido já existe
    boolean existsByPlaca(String placa);
}
