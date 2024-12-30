package com.jetbrains.bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookMarkRepository extends JpaRepository<BookMark, Long> {
}