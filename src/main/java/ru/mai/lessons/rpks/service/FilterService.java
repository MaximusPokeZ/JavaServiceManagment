package ru.mai.lessons.rpks.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FilterService {
  private final FilterRepository filterRepository;

  public List<Filter> findAllFilters() {
    return filterRepository.findAll();
  }

  public List<Filter> findAllFiltersByFilterId(long filterId) {
    return filterRepository.findAllByFilterId(filterId);
  }

  public Filter findFilterByIdAndRuleId(long filterId, long ruleId) {
    return filterRepository.findByFilterIdAndRuleId(filterId, ruleId);
  }

  public void deleteAllFilters() {
    filterRepository.deleteAll();
  }

  @Transactional
  public void deleteAllFiltersByFilterIdAndRuleId(long filterId, long ruleId) {
    filterRepository.deleteAllByFilterIdAndRuleId(filterId, ruleId);
  }

  public Filter save(Filter filter) {
    return filterRepository.save(filter);
  }

}
