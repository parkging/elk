package com.elk.log.tlog.service;

import com.elk.log.tlog.Repository.TlogRepository;
import com.elk.log.tlog.document.Tlog;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class TlogService {

    private final TlogRepository tlogRepository;

    public Optional<Tlog> findById(String id) {
        return tlogRepository.findById(id);
    }

    public List<Tlog> findAllBy(Pageable pageable) {
//        return tlogRepository.findAllBy(PageRequest.of(0, 1, Sort.by("id").ascending()));
        return tlogRepository.findAllBy(pageable);
    }

    public List<Tlog> searchBy(Pageable pageable) {
//        PageRequest.of(null, null, pageable.getSort())
        return tlogRepository.searchBy(pageable)
                .skip(10000)
                .limit(1000)
                .collect(Collectors.toList());
    }

    @Transactional
    public String save(Tlog tlog) {
        return tlogRepository.save(tlog).getId();
    }

}
