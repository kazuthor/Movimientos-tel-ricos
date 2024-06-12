
class Victima {
    private String detalle;
    private Municipio municipio;

    public Victima(String detalle, Municipio municipio) {
        this.detalle = detalle;
        this.municipio = municipio;
        municipio.agregarVictima(this); // Agregar la víctima a la lista de víctimas del municipio
    }

    // Getters
    public String getDetalle() {
        return detalle;
    }
    
    public void setDetalle(String detalle){
        this.detalle = detalle;
    }

    public Municipio getMunicipio() {
        return municipio;
    }
    
    public void setMunicipio(Municipio municipio){
        this.municipio = municipio;
    }

}
