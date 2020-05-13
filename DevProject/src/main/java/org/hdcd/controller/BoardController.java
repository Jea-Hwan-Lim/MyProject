package org.hdcd.controller;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger =  LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/register")
	public void registerForm() {
		logger.info("registerForm");
	}
	
	@RequestMapping("/modify")
	public void modifyForm() {
		logger.info("modifyForm");
	}
	
	@RequestMapping("/list")
	public void list() {
		logger.info("list");
	}
	
	@RequestMapping("/read/{boardNo}")
	public String read(@PathVariable("boardNo") int boardNo) {
		logger.info("read boardNo: " + boardNo);
		
		return "board/read";
	}
	
}
