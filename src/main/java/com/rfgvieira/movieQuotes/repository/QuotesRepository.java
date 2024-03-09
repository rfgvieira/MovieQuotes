package com.rfgvieira.movieQuotes.repository;

import com.rfgvieira.movieQuotes.model.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quotes, Long> {
}
