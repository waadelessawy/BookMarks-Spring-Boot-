package com.jetbrains.bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface BookMarkRepository extends JpaRepository<BookMark, Long> {
    List<BookMarkInfo> findAllByOrderByCreatedAtDesc();
    Optional<BookMarkInfo> findBookmarkById(Long id);
}