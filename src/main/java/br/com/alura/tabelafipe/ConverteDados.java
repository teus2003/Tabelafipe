package br.com.alura.tabelafipe;

import tools.jackson.databind.json.JsonMapper;

import java.util.List;

public class ConverteDados {
    private final JsonMapper mapper = JsonMapper.builder().build();

    public <T> List<T> obterLista(String json, Class<T> classe) {
        var tipoLista = mapper.getTypeFactory().constructCollectionType(List.class, classe);
        return mapper.readValue(json, tipoLista);
    }
}
