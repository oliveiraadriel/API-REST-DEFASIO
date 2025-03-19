package com.desafio.controller;

import com.desafio.model.Estatistica;
import com.desafio.service.EstatisticaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {
    private final EstatisticaService estatisticaService;

    public EstatisticaController(EstatisticaService estatisticaService) {
        this.estatisticaService = estatisticaService;
    }

    @GetMapping
    public ResponseEntity<Estatistica> obterEstatisticas() {
        Estatistica estatisticas = estatisticaService.calcularEstatisticas();
        return ResponseEntity.ok(estatisticas);
    }
}
