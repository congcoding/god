package com.kh.god.admin.model.service;

import java.util.List;
import java.util.Map;

import com.kh.god.admin.model.vo.Event;
import com.kh.god.admin.model.vo.QnaBoard;

public interface AdminService {

	List<Map<String, String>> selectBoardList(int cPage, int numPerPage);

	int countBoardList();

	List<Map<String, String>> eventList(int cPage, int numPerPage);

	int countEventList();

	int getLastEventNo();

	int insertEvent(Event event);

	QnaBoard qnaBoardView(int boardNo);

}
