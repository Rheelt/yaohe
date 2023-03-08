package com.mvp.yaohe.dao;

import com.mvp.yaohe.domain.EventContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author litao
 * @date 2023/3/8 8:57 PM
 */
public interface EventContentDao extends JpaRepository<EventContent, Long> {

    /**
     * findAll 查询数据库所有内容
     */
    @Override
    List<EventContent> findAll();
}
