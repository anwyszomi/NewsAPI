package anwyszomi.controller;

import anwyszomi.domain.Article;
import anwyszomi.domain.Pocket;
import anwyszomi.services.PocketServiceImpl;
import anwyszomi.supplier.ApiResponder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PocketController {
    @Autowired
    PocketServiceImpl service;

    @Autowired
    ApiResponder responder;

    @GetMapping("/addToPocket")
    public String addToPocket(Model model, @RequestParam Article article) {
        model.addAttribute( "pocket", new Pocket() );
        service.add( article );
        List<Article> articleList = service.findAll();
        model.addAttribute( "pocketList", articleList );
        return "pocket";
    }

    @GetMapping("/pocket")
    public String showPocket(Model model) {
        model.addAttribute( "pocket", service.findAll() );
        return "pocket";
    }
}
