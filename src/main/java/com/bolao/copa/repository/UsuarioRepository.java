/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolao.copa.repository;

import com.bolao.copa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lucas
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
