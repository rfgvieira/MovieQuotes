package com.rfgvieira.movieQuotes.service;


import com.rfgvieira.movieQuotes.model.Quote;
import com.rfgvieira.movieQuotes.repository.QuotesRepository;
import dto.QuoteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotesService {
    @Autowired
    QuotesRepository repository;

    public QuoteDTO getRandomQuote() {
        long totalQuotes = repository.count();
        Long randomId = (long) (Math.random() * totalQuotes) + 1;
        Quote quote = repository.findById(randomId).get();
        return new QuoteDTO(quote.getTitle(), quote.getCharacter(), quote.getQuote(), quote.getPoster());
    }
}
