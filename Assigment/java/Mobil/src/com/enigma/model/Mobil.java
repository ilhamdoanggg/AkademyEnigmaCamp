package com.enigma.model;

public class Mobil {

        private Boolean isStart;
        Integer fuel = 0;

        public void fillFuel(int fuel){
            this.fuel= this.fuel+fuel;
        }
        Boolean isFuelSufficient(){
            return this.fuel>0;
        }
        public String enginStart(){
            if(isFuelSufficient()){
                isStart = true;
                return "boom boom";
               }
            return "fail";
            //if (isFuelSufficient())
        }
        public String engineStop(){
            isStart = false;
            return "Stop";
        }

        public void parking(){
            System.out.println("park");
            if(isStart){
                System.out.println("not yet");
                return;
            }
            System.out.println("done");
        }

    }
