package io.zipcoder;


import java.util.Comparator;

public class Pets implements Comparable<Pets> {
    String petName;
    String petType;

    public Pets(){}
    public Pets(String petName, String petType){
        this.petName = petName;
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String speak(){ return "AnimalNoise"; }

    public String toString(){
        return petName + " " + petType;
    }


    @Override
    public int compareTo(Pets o) {
        if(this.getPetName().compareTo(o.getPetType())!=0){
            return this.getPetName().compareTo(o.getPetType());
        }else{
            return this.getPetType().compareTo(o.getPetType());
        }
    }
}
