package com.example.ChallengePorto.model.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ChallengePorto.model.dao.ClienteRepository;
import com.example.ChallengePorto.model.vo.Cliente;

@Component
public class CadastroBO {
	
	@Autowired
    private ClienteRepository clienteRepository;
	
    /**
     * Valida um cliente com base em várias regras.
     *
     * @param cliente O cliente a ser validado.
     * @return Uma mensagem de erro se houver problemas de validação, ou null se o cliente for válido.
     */
    public String validarCadastro(Cliente cliente) {
    	
    	// Validação do CPF
        if (!validarCPF(cliente.getCpf())) {
            return "CPF inválido. Deve conter apenas números e ter 11 dígitos.";
        }
        
        // Validação do número da apólice
        if (!validarApolice(cliente.getApolice())) {
            return "Número da apólice inválido. Deve ser um número positivo.";
        }

        // Validação do nome
        if (!validarNome(cliente.getNome())) {
            return "Nome inválido. Deve conter pelo menos nome e sobrenome.";
        }

        // Validação da senha
        if (!validarSenha(cliente.getSenha())) {
            return "Senha inválida. Deve ter até 6 dígitos.";
        }

        // Validação da placa
        if (!validarPlaca(cliente.getPlaca())) {
            return "Placa inválida. Deve seguir o padrão 'AAA-9999' ou 'AAA-9S99'.";
        }

        // Verificação se o CPF já está cadastrado
        if (cpfCadastrado(cliente.getCpf())) {
            return "CPF já cadastrado.";
        }
        
        // Verificação se o CPF já está cadastrado
        if (apoliceCadastrado(cliente.getApolice())) {
            return "Apolice já cadastrado.";
        }
        
        // Verificação se o CPF já está cadastrado
        if (placaCadastrado(cliente.getPlaca())) {
            return "Placa já cadastrado.";
        }
        
        // Retorna null se todas as validações passarem, indicando que o cliente é válido
        return null;
    }

    /**
     * Valida o formato do CPF.
     *
     * @param cpf O CPF a ser validado.
     * @return True se o CPF for válido, false caso contrário.
     */
    private boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    /**
     * Valida o número da apólice.
     *
     * @param apolice O número da apólice a ser validado.
     * @return True se o número da apólice for válido, false caso contrário.
     */
    private boolean validarApolice(int apolice) {
        return apolice > 0;
    }

    /**
     * Valida o formato do nome.
     *
     * @param nome O nome a ser validado.
     * @return True se o nome for válido, false caso contrário.
     */
    private boolean validarNome(String nome) {
        return nome != null && nome.trim().split("\\s+").length >= 2;
    }

    /**
     * Valida o formato da senha.
     *
     * @param senha A senha a ser validada.
     * @return True se a senha for válida, false caso contrário.
     */
    private boolean validarSenha(String senha) {
        return senha != null && senha.trim().length() <= 6;
    }

    /**
     * Valida o formato da placa.
     *
     * @param placa A placa a ser validada.
     * @return True se a placa for válida, false caso contrário.
     */
    private boolean validarPlaca(String placa) {
        return placa != null && placa.trim().matches("[A-Z]{3}-[0-9][0-9A-Z][0-9]{2}");
    }
    
    /**
     * Verifica se um CPF já está cadastrado.
     *
     * @param cpf O CPF a ser verificado.
     * @return True se o CPF já estiver cadastrado, false caso contrário.
     */
    private boolean cpfCadastrado(String cpf) {
        return clienteRepository.existsByCpf(cpf);
    }
    
    /**
     * Verifica se um Apolice já está cadastrado.
     *
     * @param apolice O Apolice a ser verificado.
     * @return True se o Apolice já estiver cadastrado, false caso contrário.
     */
    private boolean apoliceCadastrado(int apolice) {
        return clienteRepository.existsByApolice(apolice);
    }
    
    /**
     * Verifica se um Placa já está cadastrado.
     *
     * @param placa O Placa a ser verificado.
     * @return True se o Placa já estiver cadastrado, false caso contrário.
     */
    private boolean placaCadastrado(String placa) {
        return clienteRepository.existsByPlaca(placa);
    }
}