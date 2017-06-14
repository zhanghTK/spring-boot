package tk.zhangh.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tk.zhangh.springboot.web.config.WebSiteProperties;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import static java.text.DateFormat.LONG;

@Controller
public class ThymeleafController {

    @Autowired
    private WebSiteProperties webSiteProperties;

    @GetMapping("/hi")
    public String hello(Locale locale, Model model) {
        model.addAttribute("greeting", webSiteProperties.getDescription());
        model.addAttribute("currentTime", DateFormat.getDateTimeInstance(LONG, LONG, locale).format(new Date()));
        return "hello";
    }
}