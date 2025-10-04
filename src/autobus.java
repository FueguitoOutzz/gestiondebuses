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

public void recorrido(){
    for (int i = 0; i < 13; i++){
        if (this.nivcombus > 0){
            this.nivcombus -= calcularConsumo();
            
        } else {
            System.out.println("El bus con placa " + this.placa + " se ha quedado sin combustible en el recorrido " + (i+1));
            break;
        }
        if ( i == 3){
            System.out.println("El bus tiene combustible suficiente para completar recorridos consecutivos" );
        }
    }
}
/*Método que calcule y retorne el nivel de desgaste acumulado del autobús después de cierto
número de recorridos, considere que cada recorrido suma 3 puntos de desgaste. Este
método debe considerar:
a. Verificar que con el combustible disponible se puede realizar la cantidad de recorridos
indicada.
b. Verificar que el nivel de desgaste permite hacer la cantidad de recorridos indicada,
recordando que el desgaste NO puede ser negativo.
c. En caso de que todas las verificaciones anteriores sean positivas, actualizar el nivel de
desgaste si corresponde y retornar el nuevo nivel de desgaste; en caso contrario
retornar cero*/
public double nivelDesgaste(int numRecorridos){
    double desgasteTotal = this.desgaste + (numRecorridos * 3);
    double consumoTotal = numRecorridos * calcularConsumo();

    if (this.nivcombus >= consumoTotal && desgasteTotal <= 100) {
        this.desgaste = desgasteTotal;
        this.nivcombus -= consumoTotal;
        return this.desgaste;
    } else {
        return 0;
    }
}
public void exDesgaste(){
    if (this.desgaste > 100){
        System.out.println("El bus con placa " + this.placa + " tiene un nivel de desgaste excesivo: " + this.desgaste);
    } else {
        System.out.println("El bus con placa " + this.placa + " tiene un nivel de desgaste aceptable: " + this.desgaste);
    }
}
}