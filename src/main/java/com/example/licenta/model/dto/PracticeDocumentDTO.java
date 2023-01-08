package com.example.licenta.model.dto;

import lombok.*;

import java.io.File;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracticeDocumentDTO {
    Long userId;
    List<File> fileList;
}
