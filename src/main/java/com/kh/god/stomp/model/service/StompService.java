package com.kh.god.stomp.model.service;

import java.util.List;
import java.util.Map;

import com.kh.god.stomp.model.vo.ChatRoom;
import com.kh.god.stomp.model.vo.Msg;

public interface StompService {

	String findChatIdByMemberId(String memberId);

	int insertChatRoom(List<ChatRoom> list);

	int insertChatLog(Msg fromMessage);
	
	int insertChatLogHello(Msg msg);

	int deleteChatRoom(String chatId);

	int updateLastCheck(Msg fromMessage);
	
	//관리자용
	List<Map<String, String>> findRecentList();

	List<Msg> findChatListByChatId(String chatId);

	List<Integer> adminCheck();

}
