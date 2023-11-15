package com.onyx.bookstore.repositories;

import com.onyx.bookstore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //clase que permite hacer querys a una base de datos
public interface IBookRepository extends JpaRepository<Book, Long> {


}
