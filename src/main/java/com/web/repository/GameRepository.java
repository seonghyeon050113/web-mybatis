package com.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.common.CommonFactory;
import com.web.dto.GameDTO;

public class GameRepository {
	public List<GameDTO> selectGames(GameDTO game) {
		try(SqlSession session = CommonFactory.getSSF().openSession()){
			return session.selectList("GameMapper.selectGames",game); 
		}
	}
	public GameDTO selectGame(int giNum) {
		try(SqlSession session = CommonFactory.getSSF().openSession()){
			return session.selectOne("GameMapper.selectGame",giNum); 
		}
	}
	public int insertGame(GameDTO game) {
		try(SqlSession session = CommonFactory.getSSF().openSession(true)){
			return session.insert("GameMapper.insertGame",game); 
		}
	}
	public int updateGame(GameDTO game) {
		try(SqlSession session = CommonFactory.getSSF().openSession(true)){
			return session.update("GameMapper.updateGame",game); 
		}
	}
	public int deleteGame(int giNum) {
		try(SqlSession session = CommonFactory.getSSF().openSession(true)){
			return session.delete("GameMapper.deleteGame",giNum); 
		}
	}

	
	public static void main(String[]args) {
		GameRepository gr = new GameRepository();
		List<GameDTO> list = gr.selectGames(null);
		System.out.println(list);
		System.out.println(gr.selectGame(2));
		GameDTO game = new GameDTO();
		game.setGiName("코딩하기");
		game.setGiPrice(0);
		game.setGiGenre("coding");
		game.setGiDesc("재밌다");
		game.setGiNum(2);
		int result = gr.deleteGame(2);
		System.out.print(result);
		//int result = gr.insertGame(game);
		//System.out.println(result);
	}
}
