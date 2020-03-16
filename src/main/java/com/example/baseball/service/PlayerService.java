/**
 * 
 */
package com.example.baseball.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.baseball.domain.Player;
import com.example.baseball.repository.PlayerRepository;

/**
 * @author saruta0607
 *
 */
@Service
public class PlayerService {
	// ①
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public Player findOne(Long id) {
        // メソッド名がfindOneからfindByIdに変わった
        // Optionalを返すようになったので取得できなかった場合の処理`.orElse(null)`を追加
        return playerRepository.findById(id).orElse(null);
    }

    public Player save(Player player) {
        return playerRepository.save(player);
    }

    public void delete(Long id) {
    	// メソッド名がdeleteからdeleteByIdに変わった       
        playerRepository.deleteById(id);
    }

}
