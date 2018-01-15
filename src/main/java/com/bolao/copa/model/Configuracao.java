/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolao.copa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author lucas
 */
@Data
@Entity
@Table(name = "configuracao")
public class Configuracao implements Serializable {

    private static final long serialVersionUID = 6318107720391420337L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    @Column(name = "pontos_acerto placar")
    private int pontosAcertoPlacar;
    
    @NotNull
    @Column(name = "pontos_acerto_vencedor")
    private int pontosAcertoVencedor;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @NotNull
    @Column(name = "valor_inscricao")
    private BigDecimal valorInscricao;
}
