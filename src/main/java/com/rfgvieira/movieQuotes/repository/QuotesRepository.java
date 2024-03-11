package com.rfgvieira.movieQuotes.repository;

import com.rfgvieira.movieQuotes.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quote, Long> {
}
