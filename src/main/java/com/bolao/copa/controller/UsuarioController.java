/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolao.copa.controller;

import com.bolao.copa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author lucas
 */

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
}
