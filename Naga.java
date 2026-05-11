public class Naga extends Musuh implements BisaTerbang, BisaLoot {
    public Naga(){
        super("Naga Jawir", 500, "rawr");

    }
    @Override
    public void seranganPemain(){
        System.out.println(this.namaMusuh + "naga menyemburkan air laut asin ! hp player -50");
    }

    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh + "naga bersuara = hahahah " );
    }

    @Override
    public void lepasLandas(){
        System.out.println(this.namaMusuh + "terbang tinggi! Sulit diserang. " );
    }

    @Override
    public void seranganUdara(){
        System.out.println(this.namaMusuh + "menyemburkan badai api! pemain -80 HP." );
    }

    @Override
    public void jatuhkanLoot(){
        System.out.println(this.namaMusuh + " Slime jatuhkan loot!");
    }
        
}