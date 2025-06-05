package ru.mai.lessons.rpks.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeduplicationService {

  private final DeduplicationRepository deduplicationRepository;

  public List<Deduplication> findAllDeduplications() {
    return deduplicationRepository.findAll();
  }

  public List<Deduplication> findAllDeduplicationsByDeduplicationId(long id) {
    return deduplicationRepository.findAllByDeduplicationId(id);
  }

  public Deduplication findByDeduplicationIdAndRuleId(long deduplicationId, long ruleId) {
    return deduplicationRepository.findDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
  }

  public void deleteAllDeduplications() {
    deduplicationRepository.deleteAll();
  }

  @Transactional
  public void deleteDeduplicationByDeduplicationIdAndRuleId(long deduplicationId, long ruleId) {
    deduplicationRepository.deleteDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
  }

  public void save(Deduplication deduplication) {
    deduplicationRepository.save(deduplication);
  }
}
