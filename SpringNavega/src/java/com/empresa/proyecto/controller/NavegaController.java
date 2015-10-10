/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Yuri
 */
@Controller
public class NavegaController {
    @RequestMapping(params = "p01")
    public ModelAndView pagina01(){
        ModelAndView mav= new ModelAndView("page01");
        return mav;
    }
}
