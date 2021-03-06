package com.psl.game.test;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.psl.game.dao.GameDao;
import com.psl.game.dao.GameDaoImpl;
import com.psl.game.dto.Game;
import com.psl.game.exception.GameException;
import com.psl.game.service.GameServiceImpl;

public class TestGameDaoImpl {

	GameServiceImpl service;
	GameDao dao;
	@Before
	public void init()
	{
		dao = new GameDaoImpl();
		service = new GameServiceImpl();
		service.setDao(dao);
	}
	
	@After
	public void destroy()
	{
		dao = null;
		service=null;
	}
	@Test
	public void testGetAllGames()
	{
		HashMap<String,Integer> map = null;
		map = service.getAllGameDetails();
		assertNotNull(map);
	}
	@Test
	public void testPlayGame() //throws GameException
	{
		Game game = null ;
		try{
		game = service.playGame(101, "cricket");
		}catch(GameException e)
		{
			System.out.println(e.getMessage());
		}
		assertNotNull(game);
	}
}
