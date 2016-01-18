package ua.com.goit.task3.FileFlowerTool.file;


public class FileRunner {
    public static void main(String[] args) {
        Directory directory1 = new Directory();
        directory1.createAudio();
        directory1.createImage();
        directory1.createText();
        directory1.directorySize();
        try {
            AudioFile audio2 = new AudioFile("mp3", 1001.0);
            if (audio2.getSize() < 0) {
                throw new IllegalArgumentException("size must be > 0");
                }
            if (audio2.getSize()>1000.0){
                throw new FileBigSizeException(audio2.getSize());
                }
            }catch (IllegalArgumentException ex){
            System.out.println("size must be > 0");
            } catch (FileBigSizeException e) {
            System.out.println("File size must be < 1000");
            }
    }
}