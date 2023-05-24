package com.elk.log.tlog.Repository;

import com.elk.log.tlog.document.Tlog;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;


public interface TlogRepository extends ElasticsearchRepository<Tlog, String> {
    public List<Tlog> findAllBy(Pageable pageable);
    public Stream<Tlog> searchBy(Pageable pageable);
//    public List<Tlog> findAllBy(PageRequest pageRequest);

}
