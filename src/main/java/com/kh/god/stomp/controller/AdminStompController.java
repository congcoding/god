package com.kh.god.stomp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.kh.god.member.model.vo.Member;
import com.kh.god.stomp.model.service.StompService;
import com.kh.god.stomp.model.vo.Msg;



@Controller
public class AdminStompController {
		
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	StompService stompService;
	
	@GetMapping("/ws/admin.do")
	public void admin(Model model, 
					  HttpSession session, 
					  @SessionAttribute(value="memberLoggedIn", required=false) Member memberLoggedIn){
		String memberId = Optional.ofNullable(memberLoggedIn).map(Member::getMemberId)
															 .orElseThrow(IllegalStateException::new);
		String chatId = null;
		
		if(!"admin".equals(memberId)) throw new IllegalStateException("로그인 후 이용하세요.");
		
		List<Map<String, String>> recentList = stompService.findRecentList();
		//logger.info("recentList={}",recentList);
		
		model.addAttribute("recentList", recentList);
		
	}
	
	@GetMapping("/ws/adminChat.do/{chatId}")
	public String adminChat(@PathVariable("chatId") String chatId, Model model){
		
		List<Msg> chatList = stompService.findChatListByChatId(chatId);
		model.addAttribute("chatList", chatList);
		
		//logger.info("chatList={}",chatList);
		return "ws/adminChat";
	}
	
	@ResponseBody
	@GetMapping("/admin/adminCheck.do")
	public Map<String, Object> adminCheck(Model model) {
		Map<String, Object> map = new HashMap<>();
		List<Integer> adminCheckList = stompService.adminCheck();
		map.put("adminCheckList", adminCheckList);
		return map;
	}
	
	/*@ResponseBody
	@GetMapping("/ws/adminChat.do/{chatId}")
	public Map<String, Object> adminChat(@PathVariable("chatId") String chatId, Model model){
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<Msg> chatList = stompService.findChatListByChatId(chatId);
		map.put("chatList", chatList);
//		model.addAttribute("chatList", chatList);
		model.addAttribute("chatId", chatId);
//		model.addAttribute("memberId", "admin");
		logger.info("chatList={}",chatList);
		return map;
		
	}*/
	
}
