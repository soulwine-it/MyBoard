package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Inject
	BoardService service;
	
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public void getWrite() throws Exception{
		logger.info("get Write");
	}
	
	@RequestMapping(value="/write", method = RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception{
		logger.info("post write");
		
		service.write(vo);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public void list(Model model) throws Exception{
		logger.info("get list");
		
		List<BoardVO> list = service.list();
		
		model.addAttribute("list", list);
		
	}
}
