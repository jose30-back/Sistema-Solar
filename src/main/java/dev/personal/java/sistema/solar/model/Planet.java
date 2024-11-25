package dev.personal.java.sistema.solar.model;

public class Planet {

    String name = null;
    int numberOfSatellites = 0;
    double mass = 0;
    double volume = 0;
    int diameter = 0;
    int distanceToTheSun = 0;
    TypeOfPlanet typeOfPlanet;
    boolean observable = false;
    int orbitalPeriod = 0; 
    int rotationPeriod = 0; 

    public Planet(String name, int numberOfSatellites, double mass, double volume, int diameter, int distanceToTheSun,
            TypeOfPlanet typeOfPlanet, boolean observable, int orbitalPeriod, int rotationPeriod) {
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceToTheSun = distanceToTheSun;
        this.typeOfPlanet = typeOfPlanet;
        this.observable = observable;
        this.orbitalPeriod = orbitalPeriod; 
        this.rotationPeriod = rotationPeriod; 
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public int getRotationPeriod() {
        return rotationPeriod;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public TypeOfPlanet getTypeOfPlanet() {
        return typeOfPlanet;
    }

    public String isObservable() {
        if (observable == true) {
            return "Si";
        } else {
            return "No";
        }
    }

    public double calculateDensity() {
        double density = mass / volume;
        return density;
    }

    public String isOutside() {
        if (distanceToTheSun > 314155527 || distanceToTheSun > 508632758) {
            return "Exterior";
        } else {
            return "Interior";
        }
    }

    
}
