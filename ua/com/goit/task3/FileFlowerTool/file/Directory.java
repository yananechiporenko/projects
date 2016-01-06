package ua.com.goit.task3.FileFlowerTool.file;


public class Directory {

    private double size;

        public Directory(double size) {
            this.size = size;
        }

        public double getSize() {
            return size;
        }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean open (){
        return true;
    }

    Directory directory1 = new Directory(4.3);
    AudioFile audio1 = new AudioFile("mp3", 2.3);
    ImageFile image1 = new ImageFile("jpg", 1.0);
    TextFile text1 = new TextFile("txt", 1.0);
    directory1.setSize(){
        size = audio1.getSize()+image1.getSize()+text1.getSize();
        System.out.print(directory1.getSize());
    }
}
