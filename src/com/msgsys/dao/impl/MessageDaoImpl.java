package com.msgsys.dao.impl;

import com.msgsys.dao.BaseDao;
import com.msgsys.dao.MessageDao;
import com.msgsys.entity.Message;

import java.util.List;

public class MessageDaoImpl extends BaseDao implements MessageDao {

    @Override
    public int insert(Message message) {
        String sql = "INSERT INTO msg (fromUid, toUid, mtitle, mContent, readFlag, createTime) VALUES (?,?,?,?,?,?)";
        return update(sql, message.getFromUid(), message.getToUid(), message.getMtitle(), message.getmContent()
                , message.getReadFlag(), message.getCreateTime());
    }

    @Override
    public int update(Message message) {
        String sql = "UPDATE msg set fromUid=?, toUid=?, mtitle=?, mContent=?, readFlag=?, createTime=? WHERE id=?";
        return update(sql, message.getFromUid(), message.getToUid(), message.getMtitle(), message.getmContent()
                , message.getReadFlag(), message.getCreateTime() ,message.getId());
    }

    @Override
    public int delete(Integer id) {
        String sql = "DELETE FROM msg WHERE id=?";
        return update(sql, id);
    }

    @Override
    public List<Message> queryAll() {
        String sql  ="SELECT * FROM msg";
        return queryForList(Message.class, sql);
    }

    @Override
    public Message queryMessageById(Integer id) {
        String sql  ="SELECT * FROM msg WHERE id=?";
        return queryForOne(Message.class,sql ,id);
    }

    @Override
    public List<Message> queryMessageByToUid(Integer id) {
        String sql  ="SELECT * FROM msg WHERE touid=?";
        return queryForList(Message.class, sql, id);
    }
}
