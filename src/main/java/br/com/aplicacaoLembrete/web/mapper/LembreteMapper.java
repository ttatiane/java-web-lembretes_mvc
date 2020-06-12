package br.com.aplicacaoLembrete.web.mapper;

import br.com.aplicacaoLembrete.web.model.Lembrete;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  A aplicação utiliza a memória volátil para armazenar os dados, portanto esta classe
 *  faz a persistência dos dados em memória, o que seria uma alternativa à persistência
 *  em banco de dados, para esse exemplo de aplicação.
 */

public class LembreteMapper {

    private List<Lembrete> lembretes = new ArrayList<>();

    public LembreteMapper() {
        Instant agora = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();

        Lembrete lembrete = new Lembrete();
            lembrete.setId(1L);
            lembrete.setTitulo("Comprar leite");
            lembrete.setDescricao("Hoje, 11h");
            lembrete.setDataCadastro(Date.from(agora));
            lembrete.setDataInicio(Date.from(agora));

            adicionar(lembrete);
    }

    public List<Lembrete> getLembretes() {
        return lembretes;
    }

    public void adicionar(Lembrete lembrete) {
        lembrete.setId(lembretes.size() + 1);

        Instant agora = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date hoje = Date.from(agora);
        lembrete.setDataCadastro(hoje);

        lembretes.add(lembrete);
    }

    public void remover(Lembrete lembrete) {
        try {
            lembrete = buscar(lembrete.getId());

            lembretes.remove(lembrete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editar(Lembrete lembrete) {
        try {
            for (Lembrete item : lembretes) {
                if (item.getId() == lembrete.getId()) {
                       item = lembrete;

                       break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Lembrete buscar(long id) {
        Lembrete lembrete = null;

        try {
            for (Lembrete item : lembretes) {
                if (item.getId() == id) {
                    lembrete = item;

                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lembrete;
    }
}
