package com.rover.simulation.domain.rover;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class States {

    private String name;
    @JsonProperty("allowed-actions")
    private Action allowedActions;
}
