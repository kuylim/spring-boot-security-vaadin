/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.springbootvaadin.security;

/**
 *
 * @author KUYLIM
 */
public interface ISecurity {
    void autoLogin(String username, String password);
}
