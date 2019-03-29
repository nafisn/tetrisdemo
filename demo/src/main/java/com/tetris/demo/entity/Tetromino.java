package com.tetris.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "TetrominoTable")
public class Tetromino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tetrisId;

    @NotNull
    private Long userId;

    @Column(name = "Z_Piece")
    private int zPiece;
    @Column(name = "S_Piece")
    private int sPiece;
    @Column(name = "L_Piece")
    private int lPiece;
    @Column(name = "J_Piece")
    private int jPiece;
    @Column(name = "O_Piece")
    private int oPiece;
    @Column(name = "T_Piece")
    private int tPiece;
    @Column(name = "I_Piece")
    private int iPiece;
}