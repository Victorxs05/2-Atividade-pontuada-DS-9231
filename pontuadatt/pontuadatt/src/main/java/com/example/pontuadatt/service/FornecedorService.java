package com.example.pontuadatt.service;

import com.example.pontuadatt.dto.FornecedorRequestDTO;
import com.example.pontuadatt.dto.FornecedorResponseDTO;
import com.example.pontuadatt.model.FornecedorModel;
import com.example.pontuadatt.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository repository;

    public List<FornecedorResponseDTO> listarTodos() {
        return repository
                .findAll()
                .stream()
                .map(c -> new FornecedorResponseDTO(
                        c.getNome(),
                        c.getEmail(),
                        c.getTelefone(),
                        c.getCnpj()
                ))
                .toList();
    }

    public FornecedorModel salvarFornecedor(FornecedorRequestDTO dto) {
        if (repository.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("Fornecedpr já cadastrado.");
        }

        FornecedorModel novoFornecedor = new FornecedorModel();
        novoFornecedor.setNome(dto.getNome());
        novoFornecedor.setEmail(dto.getEmail());
        novoFornecedor.setTelefone(dto.getTelefone());
        novoFornecedor.setCnpj(dto.getCnpj());
        return repository.save(novoFornecedor);
    }

}
