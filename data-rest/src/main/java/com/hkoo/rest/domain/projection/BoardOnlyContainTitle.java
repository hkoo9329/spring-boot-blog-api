package com.hkoo.rest.domain.projection;

import com.hkoo.rest.domain.Board;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "getOnlyTitle", types = {Board.class})
public interface BoardOnlyContainTitle {
    String getTitle();
}
