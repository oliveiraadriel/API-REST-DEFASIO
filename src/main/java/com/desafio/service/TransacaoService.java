package com.desafio.service;

import com.desafio.model.Transacao;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class TransacaoService {
    private final List<Transacao> transacoes = new CopyOnWriteArrayList<>();

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void limparTransacoes() {
        transacoes.clear();
    }

    public List<Transacao> obterTransacoesRecentes() {
        OffsetDateTime agora = OffsetDateTime.now();
        return transacoes.stream()
                .filter(t -> t.getDataHora().isAfter(agora.minusSeconds(60)))
                .toList();
    }
}
