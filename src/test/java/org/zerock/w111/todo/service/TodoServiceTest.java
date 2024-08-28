package org.zerock.w111.todo.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.w111.todo.dto.TodoDTO;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


@Log4j2

class TodoServiceTest {

    private TodoService todoService;

    @BeforeEach
    public void ready() {
        todoService = TodoService.INSTANCE;
    }

    @Test
    void register() throws Exception {
        TodoDTO dto = TodoDTO.builder()
                .title("JDBC Test")
                .dueDate(LocalDate.now())
                .build();
        log.info("==========");
        log.info(dto);
        todoService.register(dto);
    }
}