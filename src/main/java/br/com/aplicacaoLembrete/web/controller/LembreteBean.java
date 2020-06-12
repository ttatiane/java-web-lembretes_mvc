package br.com.aplicacaoLembrete.web.controller;

import br.com.aplicacaoLembrete.web.mapper.LembreteMapper;
import br.com.aplicacaoLembrete.web.model.Lembrete;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
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

    // método que faz o papel do construtor da classe LembreteBean. Como o construtor é importante
    // para a classe, esse método init() atende as necessidades da aplicação.
    @PostConstruct
    public void init() {
        lembrete = new Lembrete();
    }

    public Lembrete getLembrete() {
        return lembrete;
    }

    public List<Lembrete> getLembretes() {
        return mapper.getLembretes();
    }

    public String adicionar() {
        mapper.adicionar(lembrete);

        lembrete = new Lembrete();

        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Lembrete adicionado com sucesso!"));
        context.getExternalContext().getFlash().setKeepMessages(true);

        return "index.html";
    }

}
