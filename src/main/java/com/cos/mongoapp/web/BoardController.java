package com.cos.mongoapp.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.mongoapp.domain.Board;
import com.cos.mongoapp.domain.BoardRepository;
import com.cos.mongoapp.web.dto.BoardSaveDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BoardController {

private final BoardRepository boardRepository;
	
	@GetMapping("/board")
	public List<Board> findAll() {
		return boardRepository.findAll();
		
	}
	
	@PostMapping("/board")
	public Board save( @RequestBody BoardSaveDto dto) {
		
		return boardRepository.save(dto.toEntity());
	}
	
	
}
