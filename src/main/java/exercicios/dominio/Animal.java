package exercicios.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Animal {
    private String nome;
    private String alimentacao;
    private String reproducao;
    private String locomocao;
    private Integer peso;


}
