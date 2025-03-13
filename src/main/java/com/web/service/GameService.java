package com.web.service;

import java.util.List;
import java.util.Map;

import com.web.dto.GameDTO;
import com.web.repository.GameRepository;

public class GameService {
	private GameRepository gr = new GameRepository();

	public List<GameDTO> selectGames(Map<String,String> param) {
		return gr.selectGames(param);
	}
	public GameDTO selectGame(int giNum) {
		return gr.selectGame(giNum);
	}
	public int insertGame(GameDTO game) {
		return gr.insertGame(game);
	}
	public int updateGame(GameDTO game) {
		return gr.updateGame(game);
	}
	public int deleteGame(int giNum) {
		return gr.deleteGame(giNum);
	}
}
