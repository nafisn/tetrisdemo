package com.tetris.demo.repository;

import com.tetris.demo.entity.Tetromino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TetrominoRepository extends JpaRepository<Tetromino, Long> {

}
