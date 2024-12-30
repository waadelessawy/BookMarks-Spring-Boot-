package com.jetbrains.bookmarks;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;
import java.time.Instant;

@Entity
@Table(name = "bookmarks")
public class BookMark {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookmarks_id_gen")
  @SequenceGenerator(name = "bookmarks_id_gen", sequenceName = "bookmark_id_seq")
  @Column(name = "id", nullable = false)
  private Long id;

  @Size(max = 200)
  @NotNull
  @Column(name = "title", nullable = false, length = 200)
  private String title;

  @Size(max = 500)
  @NotNull
  @Column(name = "url", nullable = false, length = 500)
  private String url;

  @NotNull
  @ColumnDefault("now()")
  @Column(name = "created_at", nullable = false)
  private Instant createdAt;

  @Column(name = "updated_at")
  private Instant updatedAt;

  // setters & getters
}