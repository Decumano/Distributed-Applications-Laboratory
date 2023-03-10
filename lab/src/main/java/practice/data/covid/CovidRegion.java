package practice.data.covid;

public class CovidRegion {
    private String nom;
    private int casos_confirmat;
    private float perc_pcr_positives;
    private int ingressos_total;
    private int ingressos_critic;
    private int exitus;
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getCasos_confirmat() {
        return casos_confirmat;
    }
    public void setCasos_confirmat(int casos_confirmat) {
        this.casos_confirmat = casos_confirmat;
    }
    
    public float getPerc_pcr_positives() {
        return perc_pcr_positives;
    }
    public void setPerc_pcr_positives(float perc_pcr_positives) {
        this.perc_pcr_positives = perc_pcr_positives;
    }
    
    public int getIngressos_total() {
        return ingressos_total;
    }
    public void setIngressos_total(int ingressos_total) {
        this.ingressos_total = ingressos_total;
    }
    
    public int getIngressos_critic() {
        return ingressos_critic;
    }
    public void setIngressos_critic(int ingressos_critic) {
        this.ingressos_critic = ingressos_critic;
    }
    
    public int getExitus() {
        return exitus;
    }
    public void setExitus(int exitus) {
        this.exitus = exitus;
    }
}
