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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author lucas
 */
@Data
@Entity
@Table(name = "partidas")
public class Partidas implements Serializable {

    private static final long serialVersionUID = -245350873684624358L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "placar1")
    private Integer placar1;
    
    @Column(name = "placar2")
    private Integer placar2;
    
    @NotNull
    @Column(name = "ativo")
    private boolean ativo;
    
    @OneToMany(mappedBy = "partida")
    private List<Palpites> palpitesList;
    
    @ManyToOne
    @JoinColumn(name = "selecao1", referencedColumnName = "id")
    private Selecoes selecao1;
    
    @ManyToOne
    @JoinColumn(name = "selecao2", referencedColumnName = "id")
    private Selecoes selecao2;
}
