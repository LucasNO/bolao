/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolao.copa.controller;

import com.bolao.copa.service.ConfiguracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author lucas
 */

@Controller
public class ConfiguracaoController {
    
    @Autowired
    private ConfiguracaoService configuracaoService;
    
    @RequestMapping("/")
    public ModelAndView inicio() {
    	ModelAndView mv = new ModelAndView("index");
    	return mv;
    }
}
