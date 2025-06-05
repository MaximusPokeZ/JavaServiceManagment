package ru.mai.lessons.rpks.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EnrichmentService {
  private final EnrichmentRepository enrichmentRepository;

  public List<Enrichment> findAllEnrichments() {
    return enrichmentRepository.findAll();
  }

  public List<Enrichment> findAllEnrichmentsByEnrichmentId(long id) {
    return enrichmentRepository.findAllEnrichmentsByEnrichmentId(id);
  }

  public Enrichment findEnrichmentByIdAndRuleId(long id, long ruleId) {
    return enrichmentRepository.findEnrichmentByEnrichmentIdAndRuleId(id, ruleId);
  }

  public void deleteAllEnrichments() {
    enrichmentRepository.deleteAll();
  }

  @Transactional
  public void deleteEnrichmentByIdAndRuleId(long id, long ruleId) {
    enrichmentRepository.deleteEnrichmentByEnrichmentIdAndRuleId(id, ruleId);
  }

  public void save(Enrichment enrichment) {
    enrichmentRepository.save(enrichment);
  }
}
