package com.boardproject.board.dto;

import com.boardproject.board.Board;
import lombok.Getter;

public class BoardResponse {

    @Getter
    public static class CreateDTO{
        private Long id;
        private Long userId;
        private String catagory;
        private String title;

        public CreateDTO(Board board) {
            this.id = board.getId();
            this.userId = board.getUserId();
            this.catagory = board.getCatagory();
            this.title = board.getTitle();
        }
    }
}