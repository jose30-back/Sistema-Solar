package dev.personal.java.sistema.solar.view;

import dev.personal.java.sistema.solar.model.Planet;

public class View {

    Planet planet; 

    public void printPlanet (){
        System.out.println("-------Planet-------");
        System.out.println("Nombre:" + planet.getName());
        System.out.println("Numero de satelites: " + planet.getNumberOfSatellites());
        System.out.println("Masa: " + planet.getMass());
        System.out.println("Volumen: " + planet.getVolume());
        System.out.println("Diametro: " + planet.getDiameter());
        System.out.println("Distancia al sol: " + planet.getDistanceToTheSun());
        System.out.println("Tipo de planeta: " + planet.getTypeOfPlanet());
        System.out.println("Observable?: " + planet.isObservable());
        System.out.println("Periodo orbital: " + planet.getOrbitalPeriod());
        System.out.println("Periodo de rotacion: " + planet.getRotationPeriod());
    }

    public void printDensity (){ 
        System.out.println("Densidad: " + planet.calculateDensity());
    }

    public void printIfObservable () {
        System.out.println("El planeta es: " + planet.isOutside());
    }
}

