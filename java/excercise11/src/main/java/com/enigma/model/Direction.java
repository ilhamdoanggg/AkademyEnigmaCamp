package com.enigma.model;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction turnRight() {
        return Direction.values()[(ordinal()+1)%4];
    }
    public Direction turnLeft() {
        return Direction.values()[(ordinal()+1)%4];
    }
}
