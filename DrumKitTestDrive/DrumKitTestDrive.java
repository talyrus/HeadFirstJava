/**
 * Created by Taly on 21.02.2017.
 */
class DrumKitTestDrive{
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        if (d.snare == true){
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();
    }
}