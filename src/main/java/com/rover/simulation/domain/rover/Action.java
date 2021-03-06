package com.rover.simulation.domain.rover;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

enum Action
{
    @JsonProperty("move")
    MOVE,
    @JsonProperty("collect-sample")
    COLLECT_SAMPLE
}
