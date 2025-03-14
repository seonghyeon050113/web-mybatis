package com.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.common.CommonFactory;
import com.web.dto.BoardDTO;

public class BoardRepository {
	public List<BoardDTO> selectBoards(BoardDTO board) {
		try (SqlSession session = CommonFactory.getSSF().openSession()) {
			return session.selectList("BoardMapper.selectBoards", board);
		}
	}

	public BoardDTO selectBoard(int biNum) {
		try (SqlSession session = CommonFactory.getSSF().openSession()) {
			return session.selectOne("BoardMapper.selectBoard", biNum);
		}
	}

	public int insertBoard(BoardDTO board) {
		try(SqlSession session = CommonFactory.getSSF().openSession(true)){
			return session.insert("BoardMapper.insertBoard", board);
		}
		
	}
	public int updateBoard(BoardDTO board) {
		try(SqlSession session = CommonFactory.getSSF().openSession(true)){
			return session.update("BoardMapper.updateBoard", board);
		}
	}
	public int deleteBoard(int biNum) {
		try(SqlSession session = CommonFactory.getSSF().openSession(true)){
			return session.update("BoardMapper.deleteBoard",biNum);
		}
	}

	public static void main(String[] args) {
		BoardRepository br = new BoardRepository();
		List<BoardDTO> list = br.selectBoards(null);
		System.out.print(list);
		System.out.print(br.selectBoard(1));
		BoardDTO board = new BoardDTO();
		board.setUiNum(3);
		board.setBiContent("adsf");
		board.setBiTitle("adf");	
		board.setBiNum(45);
		int result = br.deleteBoard(45);
		System.out.print(result);
		

	}
}
