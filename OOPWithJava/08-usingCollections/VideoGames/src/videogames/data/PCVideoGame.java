package videogames.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class PCVideoGame extends VideoGame
{
    private int minimumRAM;
    private int minimumHD;

    public PCVideoGame(int minimumRAM, int minimumHD, String title, String genre, float price) {
        super(title, genre, price);
        this.minimumRAM = minimumRAM;
        this.minimumHD = minimumHD;
    }

    public int getMinimumRAM() {
        return minimumRAM;
    }

    public void setMinimumRAM(int minimumRAM) {
        this.minimumRAM = minimumRAM;
    }

    public int getMinimumHD() {
        return minimumHD;
    }

    public void setMinimumHD(int minimumHD) {
        this.minimumHD = minimumHD;
    }

    @Override
    public String toString() {
        return super.toString() + " PCVideoGame{" + "minimumRAM=" + minimumRAM + ", minimumHD=" + minimumHD + '}';
    }
    
    
    
    
}
