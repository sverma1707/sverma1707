package com.sverma1707.trello.controller;

import com.sverma1707.trello.entity.Board;
import com.sverma1707.trello.entity.Task;
import com.sverma1707.trello.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class BoardController {

    @Autowired
    BoardService boardService;

    @PostMapping(value = "/board")
    public Board createBoard(Board board) {
        return boardService.createBoard(board);
    }

    @GetMapping(value = "/board")
    public List<Board> getAllBoards() {
        return boardService.getAllBoard();
    }

    @PutMapping(value = "/borad/{id}")
    public Board addTask(@RequestBody Task task, @PathVariable Integer id) {
        return boardService.addTask(id, task);
    }

}
