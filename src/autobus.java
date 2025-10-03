public class autobus {
    private String placa;   
    private double nivcombus;
    private double porcentajedeconsumo;
    private double desgaste;

/*constructors, getters, and setters*/
public autobus(String placa, double nivcombus, double porcentajedeconsumo, double desgaste) {
    this.placa = placa;
    this.nivcombus = nivcombus;
    this.porcentajedeconsumo = porcentajedeconsumo;
    this.desgaste = desgaste;
}
public String getPlaca() {
    return placa;
}
public void setPlaca(String placa) {
    this.placa = placa;
    if (placa.length() != 6) {
        throw new IllegalArgumentException("La placa debe tener 6 caracteres");
    }
}
public double getNivcombus() {
    return nivcombus;
}
public void setNivcombus(double nivcombus) {
    this.nivcombus = nivcombus;
    if (nivcombus < 0 || nivcombus > 1200) {
        throw new IllegalArgumentException("El nivel de combustible debe estar entre 0 y 1200");
    }
}
public double getPorcentajedeconsumo() {
    return porcentajedeconsumo;

}
public void setPorcentajedeconsumo(double porcentajedeconsumo) {
    this.porcentajedeconsumo = porcentajedeconsumo;
    if (porcentajedeconsumo < 5 || porcentajedeconsumo > 30) {
        throw new IllegalArgumentException("El porcentaje de consumo debe estar entre 5 y 30");
    }
}
public double getDesgaste() {
    return desgaste;
}
public void setDesgaste(double desgaste) {
    this.desgaste = desgaste;
    if (desgaste < 0 || desgaste > 100) {
        throw new IllegalArgumentException("El desgaste debe estar entre 0 y 100");
    }
}

/*metodos*/
public double calcularConsumo(){
    return (this.nivcombus * (this.porcentajedeconsumo/ 100));  
}
}