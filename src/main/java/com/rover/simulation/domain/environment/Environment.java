package com.rover.simulation.domain.environment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

enum TerrainType
{
    DIRT,
    WATER,
    ROCK,
    SAND
}
@Getter
@Setter
@RequiredArgsConstructor
public class Environment {

    private double temperature;
    private double humidity;
    //Todo: make json attribute compatible
    private boolean solarFlare;
    private boolean storm;
    private ArrayList<ArrayList<TerrainType>> areaMap;
    private TerrainType terrain;
}
