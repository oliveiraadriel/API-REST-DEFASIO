package com.desafio.service;

import com.desafio.model.Estatistica;
import com.desafio.model.Transacao;
import org.springframework.stereotype.Service;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@Service
public class EstatisticaService {
    private final List<Transacao> transacoes = new CopyOnWriteArrayList<>();

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void limparTransacoes() {
        transacoes.clear();
    }

    public Estatistica calcularEstatisticas() {
        OffsetDateTime agora = OffsetDateTime.now();
        List<Transacao> ultimasTransacoes = transacoes.stream()
                .filter(t -> t.getDataHora().isAfter(agora.minusSeconds(60)))
                .collect(Collectors.toList());

        double sum = ultimasTransacoes.stream().mapToDouble(Transacao::getValor).sum();
        double min = ultimasTransacoes.stream().mapToDouble(Transacao::getValor).min().orElse(0);
        double max = ultimasTransacoes.stream().mapToDouble(Transacao::getValor).max().orElse(0);
        double avg = ultimasTransacoes.isEmpty() ? 0 : sum / ultimasTransacoes.size();
        long count = ultimasTransacoes.size();

        return new Estatistica(sum, avg, max, min, count);
    }
}
