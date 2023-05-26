package com.elk.log.tlog.web;

import com.elk.log.tlog.document.Tlog;
import com.elk.log.tlog.service.TlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TlogController {

    private final TlogService tlogService;

    @GetMapping("/test/{id}")
    public Tlog getTestId(@PathVariable String id) {
        return tlogService.findById(id).get();
    }

    @GetMapping("/test")
    public List<Tlog> getTest(@PageableDefault() Pageable pageable) {
        return tlogService.findAllBy(pageable);
    }

    @PostMapping("/test")
    public String postTest() {

        for(int i=1; i< 10000; i++) {

            tlogService.save(Tlog.builder()
                    .id(Integer.toString(i))
                    .version("version")
                    .timestamp(Long.parseLong(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddhhmmss"))))
                    .level("level")
                    .loggerName("loggerName")
                    .threadName("threadName")
                    .levelValue(3L)
                    .message("message")
                    .build());
        }
        return "true";
    }

}
