package lab7;

import java.util.ArrayList;
import java.util.Date;

public abstract class Persona {

    String nombre;
    int edad, id;
    float altura, peso;
    char sexo;

    public Persona(String nombre, int edad, int id, float altura, float peso, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", altura=" + altura + ", peso=" + peso + ", sexo=" + sexo + '}';
    }

    public static class Paciente extends Persona {

        ArrayList<String> enfermedades = new ArrayList(), alergias = new ArrayList();
        ArrayList<Organo> organos = new ArrayList();
        Date fechaIngreso, fechaAlta;
        String tipoSangre, causaVisita;

        public Paciente(Date fechaIngreso, Date fechaAlta, String tipoSangre, String causaVisita, String nombre, int edad, int id, float altura, float peso, char sexo) {
            super(nombre, edad, id, altura, peso, sexo);
            this.fechaIngreso = fechaIngreso;
            this.fechaAlta = fechaAlta;
            this.tipoSangre = tipoSangre;
            this.causaVisita = causaVisita;
        }

        public ArrayList<String> getEnfermedades() {
            return enfermedades;
        }

        public void setEnfermedades(ArrayList<String> enfermedades) {
            this.enfermedades = enfermedades;
        }

        public ArrayList<String> getAlergias() {
            return alergias;
        }

        public void setAlergias(ArrayList<String> alergias) {
            this.alergias = alergias;
        }

        public ArrayList<Organo> getOrganos() {
            return organos;
        }

        public void setOrganos(ArrayList<Organo> organos) {
            this.organos = organos;
        }

        public Date getFechaIngreso() {
            return fechaIngreso;
        }

        public void setFechaIngreso(Date fechaIngreso) {
            this.fechaIngreso = fechaIngreso;
        }

        public Date getFechaAlta() {
            return fechaAlta;
        }

        public void setFechaAlta(Date fechaAlta) {
            this.fechaAlta = fechaAlta;
        }

        public String getTipoSangre() {
            return tipoSangre;
        }

        public void setTipoSangre(String tipoSangre) {
            this.tipoSangre = tipoSangre;
        }

        public String getCausaVisita() {
            return causaVisita;
        }

        public void setCausaVisita(String causaVisita) {
            this.causaVisita = causaVisita;
        }

        @Override
        public String toString() {
            return nombre;
        }

    }

    public static class Doctor extends Persona {

        ArrayList<String> especialidades = new ArrayList();
        ArrayList<Paciente> pacientes = new ArrayList();
        int añosDoctor;
        String horarioTrabajo, diasTrabajo;

        public Doctor(int añosDoctor, String horarioTrabajo, String diasTrabajo, String nombre, int edad, int id, float altura, float peso, char sexo) {
            super(nombre, edad, id, altura, peso, sexo);
            this.añosDoctor = añosDoctor;
            this.horarioTrabajo = horarioTrabajo;
            this.diasTrabajo = diasTrabajo;
        }

        public ArrayList<String> getEspecialidades() {
            return especialidades;
        }

        public void setEspecialidades(ArrayList<String> especialidades) {
            this.especialidades = especialidades;
        }

        public ArrayList<Paciente> getPacientes() {
            return pacientes;
        }

        public void setPacientes(ArrayList<Paciente> pacientes) {
            this.pacientes = pacientes;
        }

        public int getAñosDoctor() {
            return añosDoctor;
        }

        public void setAñosDoctor(int añosDoctor) {
            this.añosDoctor = añosDoctor;
        }

        public String getHorarioTrabajo() {
            return horarioTrabajo;
        }

        public void setHorarioTrabajo(String horarioTrabajo) {
            this.horarioTrabajo = horarioTrabajo;
        }

        public String getDiasTrabajo() {
            return diasTrabajo;
        }

        public void setDiasTrabajo(String diasTrabajo) {
            this.diasTrabajo = diasTrabajo;
        }

        @Override
        public String toString() {
            return nombre;
        }

    }
}
