package com.example.pontuadatt.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class FornecedorRequestDTO {

    @NotBlank(message = "O nome é obrigátorio")
    @Size(max = 200, message = "O nome deve ter menos de 200 caracteres")
    private String nome;

    @NotBlank(message = "O CNPJ é obrigátorio")
    @Size(min = 14, max = 14, message = "O CNPJ deve conter 14 caracteres")
    private String cnpj;

    @NotBlank(message = "O E-mail é obrigátorio")
    @Email(message = "Deve ser um e-mail válido")
    private String email;

    @NotBlank(message = "O telefone é obrigátorio")
    @Size(min = 10, max = 13, message = "O telefone deve ter entre 10 e 13 dígitos")
    private String telefone;

    public FornecedorRequestDTO() {
    }

    public FornecedorRequestDTO(String nome, String cnpj, String email, String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
    }

    public @NotBlank(message = "O nome é obrigátorio") @Size(max = 200, message = "O nome deve ter menos de 200 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigátorio") @Size(max = 200, message = "O nome deve ter menos de 200 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O CNPJ é obrigátorio") @Size(min = 14, max = 14, message = "O CNPJ deve conter 14 caracteres") String getCnpj() {
        return cnpj;
    }

    public void setCnpj(@NotBlank(message = "O CNPJ é obrigátorio") @Size(min = 14, max = 14, message = "O CNPJ deve conter 14 caracteres") String cnpj) {
        this.cnpj = cnpj;
    }

    public @NotBlank(message = "O E-mail é obrigátorio") @Email(message = "Deve ser um e-mail válido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O E-mail é obrigátorio") @Email(message = "Deve ser um e-mail válido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "O telefone é obrigátorio") @Size(min = 10, max = 13, message = "O telefone deve ter entre 10 e 13 dígitos") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "O telefone é obrigátorio") @Size(min = 10, max = 13, message = "O telefone deve ter entre 10 e 13 dígitos") String telefone) {
        this.telefone = telefone;
    }
}
