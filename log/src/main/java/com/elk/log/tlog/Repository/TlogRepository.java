package com.elk.log.tlog.Repository;

import com.elk.log.tlog.document.Tlog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


public interface TlogRepository extends ElasticsearchRepository<Tlog, Long> {
}
