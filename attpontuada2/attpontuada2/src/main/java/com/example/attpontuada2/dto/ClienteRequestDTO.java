package com.example.attpontuada2.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {
    @NotBlank(message = "O nome é obrigátorio")
    @Size(max = 200, message = "O nome deve ter menos de 200 caracteres")
    private String nome;

    @NotBlank(message = "O CPF é obrigátorio")
    @Size(min = 14, max = 14, message = "O CPF deve conter 14 dígitos")
    private String cpf;

    @NotBlank(message = "A data de nascimento é obrigátoria.")
    @Size(min = 8, max = 10, message = "A data de nascimento deve conter entre 8 e 10 caracteres")
    private String dataNascimento;

    @NotBlank(message = "O E-mail é obrigátorio")
    @Email(message = "Deve ser um e-mail válido")
    private String email;

    @NotBlank(message = "A senha é obrigátoria")
    @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
    @Size(max = 12, message = "A senha deve ter no máximo 12 caracteres")
    private String senha;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nome, String cpf, String dataNascimento, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
