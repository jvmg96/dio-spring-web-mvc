package br.com.diospringwebmvc.diospringwebmvc.controller.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoldadoEditRequest {
    private String nome;
    private String raca;
    private String arma;
}