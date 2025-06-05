package ru.mai.lessons.rpks.contributor;

import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;
import ru.mai.lessons.rpks.repository.FilterRepository;

@Component
@AllArgsConstructor
public class MyInfoContributor implements InfoContributor {

  private final DeduplicationRepository deduplicationRepository;
  private final EnrichmentRepository enrichmentRepository;
  private final FilterRepository filterRepository;

  @Override
  public void contribute(Info.Builder builder) {
    builder.withDetail("countFilters", filterRepository.count());
    builder.withDetail("countDeduplications", deduplicationRepository.count());
    builder.withDetail("countEnrichments", enrichmentRepository.count());
  }
}
