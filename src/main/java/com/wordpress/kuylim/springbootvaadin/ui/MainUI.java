/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.springbootvaadin.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 *
 * @author KUYLIM
 */
@SpringUI
public class MainUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label("Hello! I'm the root UI!"));
    }
}
