package lab7;

import java.awt.Color;
import java.util.ArrayList;

abstract class Organo {
    Color color;
    ArrayList<String> caracteristicas;
    int nivelEfectividad, nivelPotenciado, nivelPrueba;
    String tipo;

    public Organo(Color color, int nivelPotenciado, int nivelPrueba) {
        this.color = color;
        this.nivelPotenciado = nivelPotenciado;
        this.nivelPrueba = nivelPrueba;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getNivelEfectividad() {
        return nivelEfectividad;
    }

    public void setNivelEfectividad(int nivelEfectividad) {
        this.nivelEfectividad = nivelEfectividad;
    }

    public int getNivelPotenciado() {
        return nivelPotenciado;
    }

    public void setNivelPotenciado(int nivelPotenciado) {
        this.nivelPotenciado = nivelPotenciado;
    }

    public int getNivelPrueba() {
        return nivelPrueba;
    }

    public void setNivelPrueba(int nivelPrueba) {
        this.nivelPrueba = nivelPrueba;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
}

class Estomago extends Organo{

    public Estomago(Color color, int nivelPotenciado, int nivelPrueba) {
        super(color, nivelPotenciado, nivelPrueba);
        tipo = "Estomago";
        nivelEfectividad = 52580;
    }
    
}

class Higado extends Organo{

    public Higado(Color color, int nivelPotenciado, int nivelPrueba) {
        super(color, nivelPotenciado, nivelPrueba);
        tipo = "Higado";
        nivelEfectividad = 69864;
    }
    
}

class Cerebro extends Organo{

    public Cerebro(Color color, int nivelPotenciado, int nivelPrueba) {
        super(color, nivelPotenciado, nivelPrueba);
        tipo = "Cerebro";
        nivelEfectividad = 600000;
    }
    
}

class Pancreas extends Organo{

    public Pancreas(Color color, int nivelPotenciado, int nivelPrueba) {
        super(color, nivelPotenciado, nivelPrueba);
        tipo = "Pancreas";
        nivelEfectividad = 984236;
    }
    
}

class Corazon extends Organo{

    public Corazon(Color color, int nivelPotenciado, int nivelPrueba) {
        super(color, nivelPotenciado, nivelPrueba);
        tipo = "Corazón";
        nivelEfectividad = 21546;
    }
    
}

class Pulmon extends Organo{

    public Pulmon(Color color, int nivelPotenciado, int nivelPrueba) {
        super(color, nivelPotenciado, nivelPrueba);
        tipo = "Pulmón";
        nivelEfectividad = 589213;
    }
    
}

class Riñon extends Organo{

    public Riñon(Color color, int nivelPotenciado, int nivelPrueba) {
        super(color, nivelPotenciado, nivelPrueba);
        tipo = "Riñón";
        nivelEfectividad = 753266;
    }
    
}
