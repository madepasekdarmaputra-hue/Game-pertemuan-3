public class Slime extends Musuh implements BisaLoot{
    public Slime(){
        super("Slime", 50 ,"blub blub");
    }

    @Override 
    public void seranganPemain(){
        System.out.println(this.namaMusuh + " melompat dan menyiram cairan asam! Player - 15 HP");
    }

     @Override 
    public void suaraKhas(){
        System.out.println(this.namaMusuh + " Slime bersuara = blub blub");
    }

     @Override
    public void jatuhkanLoot(){
        System.out.println(this.namaMusuh + " Slime jatuhkan loot!");
    }
}