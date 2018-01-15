/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolao.copa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author lucas
 */
@Data
@Entity
@Table(name = "selecoes")
public class Selecoes implements Serializable {

    private static final long serialVersionUID = 7616123370623211060L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;
    
    @Size(max = 255)
    @Column(name = "bandeira")
    private String bandeira;
    
    @Column(name = "numero_participacoes")
    private Integer numeroParticipacoes;
    
    @Column(name = "titulos")
    private Integer titulos;
    
    @OneToMany(mappedBy = "selecao1")
    private List<Partidas> partidasList;
    
    @OneToMany(mappedBy = "selecao2")
    private List<Partidas> partidasList1;
}
