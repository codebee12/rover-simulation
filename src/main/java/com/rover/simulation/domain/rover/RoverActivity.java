package com.rover.simulation.domain.rover;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class RoverActivity {

    private String is; // for mobility
    private Item<CollectSample> performs; // either CollectSample of ItemUsage or both

}
