package ua.com.goit.task3.FileFlowerTool.file;


public class Directory {

    private double size;

        public Directory(double size) {
            this.size = size;
        }

        public double getSize() {
            return size;
        }

   public boolean open (){
        return true;
    }
    /*
    По-моему, следующие 4 строчки относятся к антипаттерну Boat Anchor, так как нигде в программе не используются.
    Предлагаю сделать класс File полем класса Directory, а вот вычисление размера директории перенести в методы.
    Само создание новой директории и разных файлов перенести в класс FileRunner и, например вывести на консоль размер
    созданной дирректории.
     */
    Directory directory1 = new Directory(4.3);
    AudioFile audio1 = new AudioFile("mp3", 2.3);
    ImageFile image1 = new ImageFile("jpg", 1.0);
    TextFile text1 = new TextFile("txt", 1.0);


}
