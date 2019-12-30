package io.jomosquera.personalsoft.VideoJuegos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehiculosTest {
    Vehiculos vehiculos;
    @Before
    public void setUp() throws Exception {

        vehiculos = new Vehiculos(10,12.5,"Metralladoras",10);
    }

    @Test
    public void getNumeroPersonas() {
        Assert.assertEquals("El Numero de Personas no es el esperado", 10, vehiculos.getNumeroPersonas());
    }

    @Test
    public void setNumeroPersonas() {
        vehiculos.setNumeroPersonas(11);
        Assert.assertEquals("El Numero de Personas no es el esperado", 11, vehiculos.getNumeroPersonas());

    }

    @Test
    public void getCapacidadToneladas() {
        Assert.assertEquals("La Capacidad de Toneladas no es la esperada",12.5,vehiculos.getCapacidadToneladas(),0);
    }

    @Test
    public void setCapacidadToneladas() {
        vehiculos.setCapacidadToneladas(13.5);
        Assert.assertEquals("La Capacidad de Toneladas no es la esperada", 13.5, vehiculos.getCapacidadToneladas(),0);
    }

    @Test
    public void getListaArmamento() {
        Assert.assertEquals("La Lista de Armamento no es la esperada","Metralladoras",vehiculos.getListaArmamento());
    }

    @Test
    public void setListaArmamento() {
        vehiculos.setListaArmamento("Cauchera");
        Assert.assertEquals("La Lista de Armamento no es la esperada","Cauchera",vehiculos.getListaArmamento());
    }

    @Test
    public void getNumeroMuniciones() {
        Assert.assertEquals("El Numero de Municiones no es la esperada",10,vehiculos.getNumeroMuniciones());
    }

    @Test
    public void setNumeroMuniciones() {
        vehiculos.setNumeroMuniciones(100);
        Assert.assertEquals("El Numero de Municiones no es el esperado", 100, vehiculos.getNumeroMuniciones());
    }

    @Test
    public void realizarAtaques() {

    }
}