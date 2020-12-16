package com.rover.simulation.domain.environment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

enum TerrainType
{
    @JsonProperty("dirt")
    DIRT,
    @JsonProperty("water")
    WATER,
    @JsonProperty("rock")
    ROCK,
    @JsonProperty("sand")
    SAND;
}
@Getter
@Setter
@RequiredArgsConstructor
public class Environment {

    private double temperature;
    private double humidity;
    @JsonProperty("solar-flare")
    private boolean solarFlare;

    private boolean storm;
    @JsonProperty("area-map")
    private ArrayList<ArrayList<TerrainType>> areaMap;
    private TerrainType terrain;
}
