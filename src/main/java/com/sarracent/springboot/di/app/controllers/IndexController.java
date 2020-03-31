package com.sarracent.springboot.di.app.controllers;

import com.sarracent.springboot.di.app.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("miServicioSimple")
    private IServicio miServicio;

    @GetMapping({"/", "", "/index"})
    public String index(Model model){
        model.addAttribute("objeto", miServicio.operacion());
        return "index";
    }

}
