package com.mvp.yaohe.controller;

import com.mvp.yaohe.domain.EventContent;
import com.mvp.yaohe.service.EventContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author litao
 * @date 2023/3/8 9:05 PM
 */

@RestController
@RequestMapping("/eventContent")
public class EventContentController {
    @Autowired
    private EventContentService eventContentService;

    @GetMapping("/test/allGet")
    public List<EventContent> getAllEventContents() {
        List<EventContent> eventContents = eventContentService.queryList();
        return eventContents;
    }

    @PostMapping("/test/allPost")
    public List<EventContent> getAllEventContents1() {
        List<EventContent> eventContents = eventContentService.queryList();
        return eventContents;
    }

}
