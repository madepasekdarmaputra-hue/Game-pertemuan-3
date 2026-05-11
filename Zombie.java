public class Zombie extends Musuh implements BisaLoot{
    public Zombie(){
        super("Zombie", 60,"blehh");
    }

    @Override
    public void seranganPemain(){
        System.out.println(this.namaMusuh + "zombie memukul! Player - 50 HP");
    }

    @Override 
    public void suaraKhas(){
        System.out.println(this.namaMusuh + " Zombie bersuara = blehh");
    }

    @Override
    public void jatuhkanLoot(){
        System.out.println(this.namaMusuh + " Slime jatuhkan loot!");
    }
}