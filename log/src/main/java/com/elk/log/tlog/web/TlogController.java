package com.elk.log.tlog.web;

import com.elk.log.tlog.document.Tlog;
import com.elk.log.tlog.service.TlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TlogController {

    private final TlogService tlogService;

    @GetMapping("/test")
    public Tlog test() {
        return tlogService.findById(1L).get();
    }

}
