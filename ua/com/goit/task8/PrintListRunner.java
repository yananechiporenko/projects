package ua.com.goit.task8;

import ua.com.goit.task3.FileFlowerTool.file.AudioFile;

public class PrintListRunner {
    public static void main(String[] args) {


    ObjectListCreate fileList = new ObjectListCreate();

        fileList.fileListCreate();
        fileList.getFileList1().add(new AudioFile("mp3", 0.8)); //пример динамического изменения размера списка
        fileList.getFileList1().stream().forEach(f -> System.out.println(f));
        // файлы отсортированы по возростанию их размера
        System.out.println();

    ObjectListCreate flowerList = new ObjectListCreate();

        flowerList.flowerListCreate();
        flowerList.getFlowerList1().stream().forEach(fl -> System.out.println(fl));
        // цветы отсортированы по цвету
        System.out.println();

    ObjectListCreate toolList = new ObjectListCreate();

        toolList.toolListCreate();
        toolList.getToolList1().stream().forEach(t -> System.out.println(t));
        //инструменты отсортированы по названию инструмента

    }
}
