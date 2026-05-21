package com.example.pontuadatt.controller;

import com.example.pontuadatt.dto.FornecedorRequestDTO;
import com.example.pontuadatt.dto.FornecedorResponseDTO;
import com.example.pontuadatt.dto.FuncionarioRequestDTO;
import com.example.pontuadatt.dto.FuncionarioResponseDTO;
import com.example.pontuadatt.service.FornecedorService;
import com.example.pontuadatt.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fornedores")
public class FornecedorController {
    @Autowired
    private FornecedorService service;

    @GetMapping
    public ResponseEntity<List<FornecedorResponseDTO>> listar() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody FornecedorRequestDTO dto) {
        service.salvarFornecedor(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Fornecedor cadastrado com sucesso"));
    }
}
