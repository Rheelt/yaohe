package com.mvp.yaohe.service.impl;

import com.mvp.yaohe.dao.EventContentDao;
import com.mvp.yaohe.domain.EventContent;
import com.mvp.yaohe.service.EventContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author litao
 * @date 2023/3/8 9:03 PM
 */
@Service
public class EventContentServiceImpl implements EventContentService {
    @Autowired
    private EventContentDao eventContentDao;
    @Override
    public List<EventContent> queryList() {
        List<EventContent> eventContents = eventContentDao.findAll();
        return eventContents;
    }
}
