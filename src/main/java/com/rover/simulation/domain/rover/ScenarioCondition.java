package com.rover.simulation.domain.rover;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

enum EnvironmentProperty
{
    TERRAIN,
    TEMPERATURE,
    HUMIDITY,
    SOLARFLARE,
    STORM
}

enum Operator
{
    EQ,
    NE,
    LTE,
    GTE,
    LT,
    GT
}
@Getter
@Setter
@RequiredArgsConstructor
public class ScenarioCondition {

    private String type;
    private String property;
    private String operator;
    private String value;
}
