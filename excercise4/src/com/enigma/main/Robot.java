package com.enigma.main;

public class Robot {
    Integer posX;
    Integer posY;
    private final String F = "F";
    private final String R = "R";
    private final String L = "L";
    private final String B = "B";
    private char[] command;

    Direction direction;

    public Robot(Integer posX, Integer posY, Direction direction) {
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
    }

    public String setCommand(String comman) {
        this.command = comman.toCharArray();
        return "";
    }

    public void turnLeft() {
        this.direction = this.direction.left();
    }

    public void turnRight() {
        this.direction = this.direction.right();
    }

    public void move(String movement) {
        if (movement.equals(R)) {
            turnRight();
        } else if (movement.equals(L)) {
            turnLeft();
        } else if (movement.equals(F)) {
            moveForward();
        } else if (movement.equals(B)) {
            moveBackward();
        }
    }

    public void moveForward() {
        if (direction.equals(Direction.NORTH)) {
            this.posY++;
            this.direction = Direction.NORTH;
        } else if (direction.equals(Direction.EAST)) {
            this.posX++;
            this.direction = Direction.EAST;
        } else if (direction.equals(Direction.SOUTH)) {
            this.posY--;
            this.direction = Direction.SOUTH;
        } else if (direction.equals(Direction.WEST)) {
            this.posX--;
            this.direction = Direction.WEST;
        } else {
        }
    }

    public void moveBackward() {
        if (direction.equals(Direction.NORTH)) {
            posY--;
            this.direction = Direction.NORTH;
        } else if (direction.equals(Direction.SOUTH)) {
            posY--;
            this.direction = Direction.SOUTH;
        } else if (direction.equals(Direction.EAST)) {
            posX--;
            this.direction = Direction.EAST;
        } else if (direction.equals(Direction.WEST)) {
            posX++;
            this.direction = Direction.WEST;
        } else {
        }
    }
    public void run() {
        for (int i = 0; i < this.command.length; i++) {
            move(String.valueOf(this.command[i]));
            System.out.println(this.command[i] + getPos() + this.direction);
        }
    }
    public String getPos () {
            return "(" + posX + "," +posY+ ")";
    }

    public String print() {
        return "Robot{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", direction=" + direction +
                '}';
    }


}
