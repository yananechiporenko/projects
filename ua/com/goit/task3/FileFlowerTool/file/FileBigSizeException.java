package ua.com.goit.task3.FileFlowerTool.file;

/**
 * Created by y.nechiporenko on 11.01.2016.
 */
public class FileBigSizeException extends Exception {
    private double fileSize;

    public FileBigSizeException(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
}
