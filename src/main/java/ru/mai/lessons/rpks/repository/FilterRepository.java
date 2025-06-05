package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;

public interface FilterRepository extends JpaRepository<Filter, Long> {
  List<Filter> findAllByFilterId(long filterId);

  Filter findByFilterIdAndRuleId(long filterId, long ruleId);

  void deleteAllByFilterIdAndRuleId(long id, long ruleId);
}
