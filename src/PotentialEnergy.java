public class PotentialEnergy {
    public final float g = (float) 9.8;
    private float h;
    private float m;

    public PotentialEnergy(){}
    public PotentialEnergy(float h1, float m1) {
        h = h1;
        m = m1;
    }
    public float get_h(){
        return h;
    }
    public float get_m(){
        return m;
    }
    public void set_m(float m){
        this.m = m;
    }
    public void set_h(float h){
        this.h = h;
    }
    public float get_potentional_energy(){
        return  (m*g*h);
    }
}
