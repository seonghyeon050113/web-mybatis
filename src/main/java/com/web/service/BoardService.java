package com.web.service;

import java.util.List;

import com.web.dto.BoardDTO;
import com.web.repository.BoardRepository;

public class BoardService {
	BoardRepository br = new BoardRepository();
	
	public List<BoardDTO> selectBoards(BoardDTO board){
		return br.selectBoards(board);
	}
	public BoardDTO selectBoard(int biNum) {
		return br.selectBoard(biNum);
	}
	public int insertBoard(BoardDTO board) {
		return br.insertBoard(board);
	}
	public int updateBoard(BoardDTO board) {
		return br.updateBoard(board);
	}
	public int deleteBoard(int biNum) {
		return br.deleteBoard(biNum);
	}
}
