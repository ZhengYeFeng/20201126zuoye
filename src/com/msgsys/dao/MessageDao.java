package com.msgsys.dao;

import com.msgsys.entity.Message;

import java.util.List;

public interface MessageDao {
    int insert(Message message);

    int update(Message message);

    int delete(Integer id);

    List<Message> queryAll();

    Message queryMessageById(Integer id);

    List<Message> queryMessageByToUid(Integer id);
}
