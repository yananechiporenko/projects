package ua.com.goit.task3.FileFlowerTool.file;


public class File {
    private double size;
    private String format;

        public String getFormat() {
            return format;
        }

        public double getSize() {
            return size;
        }

        public File(String format, double size) {
            this.format = format;
            this.size = size;
        }
    public boolean run (){
        return true;
    }

}
