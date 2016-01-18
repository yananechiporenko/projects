package ua.com.goit.task3.FileFlowerTool.file;

public class Directory {
    AudioFile audio1;
    ImageFile image1;
    TextFile text1;

    public AudioFile createAudio() {
        String fileFormat = "mp3";
        double fileSize = 2.3;
        audio1 = new AudioFile(fileFormat, fileSize);
        return audio1;
    }

    public ImageFile createImage() {
        String fileFormat = "jpg";
        double fileSize = 1.0;
        image1 = new ImageFile(fileFormat, fileSize);
        return image1;
    }

    public TextFile createText() {
        String fileFormat = "txt";
        double fileSize = 1.0;
        text1 = new TextFile(fileFormat, fileSize);
        return text1;
    }

    public double directorySize (){
        double size = audio1.getSize() + image1.getSize() + text1.getSize();
        System.out.println("Size of this directory is " + size);
        return size;
    }

    /*
    По-моему, следующие 4 строчки относятся к антипаттерну Boat Anchor, так как нигде в программе не используются.
    Предлагаю сделать класс File полем класса Directory, а вот вычисление размера директории перенести в методы.
    Само создание новой директории и разных файлов перенести в класс FileRunner и, например вывести на консоль размер
    созданной дирректории.
     */
//    Directory directory1 = new Directory(4.3);
//    AudioFile audio1 = new AudioFile("mp3", 2.3);
//    ImageFile image1 = new ImageFile("jpg", 1.0);
//    TextFile text1 = new TextFile("txt", 1.0);


}
