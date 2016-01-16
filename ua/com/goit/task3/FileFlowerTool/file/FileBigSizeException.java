package ua.com.goit.task3.FileFlowerTool.file;

public class FileBigSizeException extends Exception {
    private double fileSize;

    public FileBigSizeException(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
}
