package br.com.aplicacaoLembrete.web.controller;

import br.com.aplicacaoLembrete.web.mapper.LembreteMapper;
import br.com.aplicacaoLembrete.web.model.Lembrete;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * A classe Bean vai agir como controller entre a a classe lembrete (model) e
 * a classe LembreteMapper (persistência), portanto vai fazer uso das anotações
 * JSF para identificar esta classe como ManagedBean e SessionScoped.
 * SessionScopes define que os dados devem permanecer salvos enquanto em sessão,
 * ou seja, enquanto a aplicação estiver sendo executada na aba do navegador.
 */

@ManagedBean
@SessionScoped
public class LembreteBean {

    private Lembrete lembrete;
    private LembreteMapper mapper = new LembreteMapper();

    public Lembrete getLembrete() {
        return lembrete;
    }

    public List<Lembrete> getLembretes() {
        return mapper.getLembretes();
    }
}
