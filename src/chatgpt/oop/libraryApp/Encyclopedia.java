package chatgpt.oop.libraryApp;

public class Encyclopedia extends Book{
    private int volumeNumber;

    public Encyclopedia(String title, String author, int year, String isbn, int volumeNumber) {
        super(title, author, year, isbn);
        this.volumeNumber = volumeNumber;
    }

    public int getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(int volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    @Override
    public String toString(){
        return super.toString() + "\nVolume: " + volumeNumber;
    }

    @Override
    public String getType() {
        return "Encyclopedia";
    }
}
