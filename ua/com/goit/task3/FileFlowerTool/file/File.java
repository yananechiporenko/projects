package ua.com.goit.task3.FileFlowerTool.file;

public class File implements Comparable {
    private double size;
    private String format;

    @Override
    public int compareTo(Object o) {
        File next = (File)o;
        if (this.size < next.size){
            return -1;
        } else if (this.size > next.size){
            return 1;
        }
        return 0;
    }

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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +" {" +
                "size=" + size +
                ", format='" + format + '\'' +
                '}';
    }
}
