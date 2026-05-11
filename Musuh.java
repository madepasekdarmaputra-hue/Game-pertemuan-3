public abstract class Musuh {
    protected String namaMusuh;
    protected int healthPoint;
    protected String suaraKhas;

    public Musuh(String nama, int hp, String suara){
        this.namaMusuh = nama;
        this.healthPoint = hp;
        this.suaraKhas = suara;
    }

    public void terimaDamage(int damage){
        this.healthPoint -= damage;
        System.out.println(this.namaMusuh +" terkena serangan! Sisa Hp: " + this.healthPoint);
    }
    public abstract void seranganPemain();

    void suaraKhas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}