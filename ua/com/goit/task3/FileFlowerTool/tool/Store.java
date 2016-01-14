package ua.com.goit.task3.FileFlowerTool.tool;

public class Store {
    private String address;
    private Object[] tools;
    boolean open1(){
        return true;
    }
    boolean close(){
        return false;
    }

    public Object[] getTools() {
        return tools;
    }

    public void setTools(Object[] tools) {
        this.tools = tools;
    }

    public Store(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Object[] stringTools () {
        for (int i = 0; i < tools.length; i++){
            tools[i]= tools[i].getClass().getSimpleName();
        }
        return tools;
    }


}
