package com.rover.simulation.domain.environment;

import java.util.ArrayList;

enum TerrainType
{
    DIRT,
    WATER,
    ROCK,
    SAND
}
public class Environment {

    private double temperature;
    private double humidity;
    private boolean solarFlare;
    private boolean storm;
    private ArrayList<ArrayList<TerrainType>> areaMap;
    private TerrainType terrain;
}
