package com.freestar.elibrary.models;

import com.freestar.elibrary.models.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("books")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book {
    private LocalDateTime dateUploaded;
    private String coverImageUrl;
    private String author;
    private Category category;
    private String id;
    private String uploadedBy;
    private String title;
    private String description;
}
