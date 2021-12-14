package com.example.ss.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long boNo;

    private String bWriter;

    private String boardTitle;

    private String boardContent;

    private String boardComment;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String isDelete;

    private String block;
}
