package ua.com.goit.task8;

import ua.com.goit.task3.FileFlowerTool.file.*;
import ua.com.goit.task3.FileFlowerTool.flower.*;
import ua.com.goit.task3.FileFlowerTool.tool.*;

import java.util.TreeSet;

public class ObjectListCreate {
    private TreeSet<File> fileList1;
    private TreeSet<Flower> flowerList1;
    private TreeSet<Tool> toolList1;

    public TreeSet<File> fileListCreate () {
        fileList1 =  new TreeSet<>();
        fileList1.add(new AudioFile("mp3", 1.8));
        fileList1.add(new ImageFile("jpg", 2.1));
        fileList1.add(new TextFile("txt", 1.1));
        return fileList1;
    }

    public TreeSet<Flower> flowerListCreate () {
        flowerList1 = new TreeSet<>();
        flowerList1.add(new Aster("yellow"));
        flowerList1.add(new Chamomile("white"));
        flowerList1.add(new Rose("red"));
        flowerList1.add(new Tulip("pink"));
        return flowerList1;
    }

    public TreeSet<Tool> toolListCreate () {
        toolList1 = new TreeSet<>();
        toolList1.add(new Guitar("roundish"));
        toolList1.add(new Piano("square"));
        toolList1.add(new Trumpet("linear"));
        return toolList1;
    }

    public TreeSet<File> getFileList1() {
        return fileList1;
    }

    public TreeSet<Flower> getFlowerList1() {
        return flowerList1;
    }

    public TreeSet<Tool> getToolList1() {
        return toolList1;
    }

}
