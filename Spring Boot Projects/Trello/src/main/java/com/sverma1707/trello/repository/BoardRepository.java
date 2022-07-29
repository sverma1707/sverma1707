package com.sverma1707.trello.repository;

import com.sverma1707.trello.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board,Integer> {

    Optional<Board> findByTitle(String title);
}
