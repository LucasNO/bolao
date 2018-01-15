/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolao.copa.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author lucas
 */
@Data
@Entity
@Table(name = "palpites")
public class Palpites implements Serializable {

    private static final long serialVersionUID = 6589653863335739417L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    @Column(name = "placar1")
    private int placar1;
    
    @NotNull
    @Column(name = "placar2")
    private int placar2;
    
    @ManyToOne
    @JoinColumn(name = "partida", referencedColumnName = "id")
    private Partidas partida;
    
    @ManyToOne
    @JoinColumn(name = "usuario", referencedColumnName = "id")
    private Usuario usuario;
}
