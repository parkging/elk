package com.elk.log.tlog.service;

import com.elk.log.tlog.Repository.TlogRepository;
import com.elk.log.tlog.document.Tlog;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TlogService {

    private final TlogRepository tlogRepository;

    public Optional<Tlog> findById(Long id) {
        return tlogRepository.findById(id);
    }

}
