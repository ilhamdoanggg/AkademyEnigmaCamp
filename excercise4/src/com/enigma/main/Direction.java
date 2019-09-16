package com.enigma.main;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction right() {
        return Direction.values()[ordinal()+1];
    }
    public Direction left() {
        return Direction.values()[ordinal()%4];
    }
}
