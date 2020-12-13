package com.rover.simulation.domain.rover;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Item<T> {
    private T type;
    private int qty;
}
