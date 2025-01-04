package com.jetbrains.bookmarks;

import java.time.Instant;

/**
 * Projection for {@link BookMark}
 */
public interface BookMarkInfo {
    Long getId();

    String getTitle();

    String getUrl();

    Instant getCreatedAt();
}