/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolao.copa.service;

import com.bolao.copa.repository.SelecoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucas
 */

@Service
public class SelecoesService {
    
    @Autowired
    private SelecoesRepository selecoesRepository;
}
