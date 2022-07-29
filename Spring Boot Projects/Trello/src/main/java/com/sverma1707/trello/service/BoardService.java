package com.sverma1707.trello.service;

import com.sverma1707.trello.entity.Board;
import com.sverma1707.trello.entity.Task;
import com.sverma1707.trello.repository.BoardRepository;
import com.sverma1707.trello.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    TaskRepository taskRepository;

    public Board createBoard(Board board) {
        return boardRepository.save(board);
    }

    public Board getBoardById(Integer id) {
        return boardRepository.findById(id).get();
    }

    public Board getBoardByTitle(String title) {
        return boardRepository.findByTitle(title).get();
    }

    public List<Board> getAllBoard() {
        return boardRepository.findAll();
    }

    public Board addTask(Integer id, Task task) {
        Board board = boardRepository.findById(id).get();
        List<Task> existingTasks = board.getTasks();
        existingTasks.add(task);
        board.setTasks(existingTasks);
        boardRepository.save(board);
        return boardRepository.findById(id).get();
    }



}
