package com.kh.god.stomp.model.dao;

import java.util.List;
import java.util.Map;

import com.kh.god.stomp.model.vo.ChatRoom;
import com.kh.god.stomp.model.vo.Msg;

public interface StompDao {

	String findChatIdByMemberId(String memberId);

	int insertChatRoom(ChatRoom chatRoom);

	int insertChatLog(Msg fromMessage);
	
	int insertChatLogHello(Msg msg);

	int deleteChatRoom(String chatId);

	int updateLastCheck(Msg fromMessage);

	//관리자용
	List<Map<String, String>> findRecentList();

	List<Msg> findChatListByChatId(String chatId);
	
	List<Integer> adminCheck();

}
