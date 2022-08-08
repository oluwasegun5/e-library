package com.freestar.elibrary.repositories;

import com.freestar.elibrary.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepo extends MongoRepository<Book, String> {

}
