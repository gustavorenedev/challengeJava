package com.example.ChallengePorto.model.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ChallengePorto.model.dao.ClienteRepository;
import com.example.ChallengePorto.model.vo.Cliente;

@Component
public class ClienteBO {
	
	@Autowired
    private ClienteRepository clienteRepository;
	
    public String validarCliente(Cliente cliente) {
    	
    	if (!validarCPF(cliente.getCpf())) {
            return "CPF inválido. Deve conter apenas números e ter 11 dígitos.";
        }
        
        if (!validarApolice(cliente.getApolice())) {
            return "Número da apólice inválido. Deve ser um número positivo.";
        }

        if (!validarNome(cliente.getNome())) {
            return "Nome inválido. Deve conter pelo menos nome e sobrenome.";
        }

        if (!validarSenha(cliente.getSenha())) {
            return "Senha inválida. Deve ter até 6 dígitos.";
        }

        if (!validarPlaca(cliente.getPlaca())) {
            return "Placa inválida. Deve seguir o padrão 'AAA-9999' ou 'AAA-9S99'.";
        }

        // Verifica se o CPF já está cadastrado no banco
        if (cpfCadastrado(cliente.getCpf())) {
            return "CPF já cadastrado.";
        }
        
        return null;
    }

    private boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    private boolean validarApolice(int apolice) {
        return apolice > 0;
    }

    private boolean validarNome(String nome) {
        return nome != null && nome.trim().split("\\s+").length >= 2;
    }

    private boolean validarSenha(String senha) {
        return senha != null && senha.trim().length() <= 6;
    }

    private boolean validarPlaca(String placa) {
        return placa != null && placa.trim().matches("[A-Z]{3}-[0-9][0-9A-Z][0-9]{2}");
    }
    
    private boolean cpfCadastrado(String cpf) {
        return clienteRepository.existsByCpf(cpf);
    }
}
