package br.com.diospringwebmvc.diospringwebmvc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Soldado {
    private String cpf;
    private String nome;
    private String raca;
    private String arma;
}