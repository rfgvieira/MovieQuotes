package com.rfgvieira.movieQuotes.controller;

import com.rfgvieira.movieQuotes.service.QuotesService;
import dto.QuoteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesController {

    @Autowired
    private QuotesService service;
    @GetMapping("/series/frases")
    public QuoteDTO getQuotes(){
        return service.getRandomQuote();
    }
}
