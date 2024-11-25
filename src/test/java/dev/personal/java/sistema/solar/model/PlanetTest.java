package dev.personal.java.sistema.solar.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class PlanetTest {


    @Test
    public void testPlanetConstructor() {
        // Creamos un objeto de la clase Planet
        Planet planet = new Planet("Tierra", 1, 5.972e24, 1.08321e12, 12742, 149600000, TypeOfPlanet.TERRESTRE, true, 365, 24);

        // Verificamos los valores del objeto usando JUnit y Hamcrest
        assertThat(planet.getName(), is("Tierra"));
        assertThat(planet.getNumberOfSatellites(), is(1));
        assertThat(planet.getMass(), is(closeTo(5.972e24, 1e22)));  // tolerancia de 1e22
        assertThat(planet.getVolume(), is(closeTo(1.08321e12, 1e10)));  // tolerancia de 1e10
        assertThat(planet.getDiameter(), is(12742));
        assertThat(planet.getDistanceToTheSun(), is(149600000));
        assertThat(planet.getTypeOfPlanet(), is(TypeOfPlanet.TERRESTRE));
        assertThat(planet.isObservable(), is("Si"));
        assertThat(planet.getOrbitalPeriod(), is(365));
        assertThat(planet.getRotationPeriod(), is(24));
    }
    
    @Test
    void testCalculateDensity() {

        Planet planet = new Planet("Tierra", 1, 5.972e24, 1.08321e12, 12742, 149600000, TypeOfPlanet.TERRESTRE, true,
                365, 24);
        assertThat(planet.calculateDensity(), is(closeTo(5.513e12, 1e9)));
    }

    @Test
    void isOutside() {
        Planet planet1 = new Planet("Jupiter", 79, 1.898e27, 1.425e15, 139820, 778500000, TypeOfPlanet.GASEOSO, true,
                4333, 9);
        assertThat(planet1.isOutside(), is("Exterior"));
    }

    @Test
    public void testIsObservable() {

        Planet planet = new Planet("Tierra", 1, 5.972e24, 1.08321e12, 12742, 149600000, TypeOfPlanet.TERRESTRE, true,
                365, 24);
        assertThat(planet.isObservable(), is("Si"));

        Planet planet2 = new Planet("Venus", 0, 4.867e24, 9.28e11, 12104, 108200000, TypeOfPlanet.TERRESTRE, false, 225,
                243);
        assertThat(planet2.isObservable(), is("No"));
    }
}
