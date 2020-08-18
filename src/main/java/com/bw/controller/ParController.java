package com.bw.controller;

import com.bw.service.ParService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ParController {
    @Resource
    private ParService parService;

    @RequestMapping("list")
    public String list(Model model){

        Map map = new HashMap();

       List list = parService.list(map);

       model.addAttribute("list",list);

       return "list";
    }

}
