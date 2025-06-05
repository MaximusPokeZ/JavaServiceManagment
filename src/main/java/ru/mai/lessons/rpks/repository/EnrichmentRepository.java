package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

@Repository
public interface EnrichmentRepository extends JpaRepository<Enrichment, Long> {

  List<Enrichment> findAllEnrichmentsByEnrichmentId(long id);

  Enrichment findEnrichmentByEnrichmentIdAndRuleId(long id, long ruleId);

  void deleteEnrichmentByEnrichmentIdAndRuleId(long id, long ruleId);

}
