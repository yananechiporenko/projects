package ua.com.goit.task9;

import ua.com.goit.task8.ObjectListCreate;
import java.util.stream.Collectors;


public class TextForCipher {
    String textForCipherCreate (){
        ObjectListCreate fileList = new ObjectListCreate();

        String textOfCollectionsEllements = fileList.fileListCreate()
                .stream()
                .map(file -> file.getClass().getSimpleName())
                .collect(Collectors.toList())
                .toString();

        textOfCollectionsEllements += ", " + fileList.flowerListCreate()
                .stream()
                .map(file -> file.getClass().getSimpleName())
                .collect(Collectors.toList())
                .toString();

        textOfCollectionsEllements += ", " + fileList.toolListCreate()
                .stream()
                .map(file -> file.getClass().getSimpleName())
                .collect(Collectors.toList())
                .toString();

        String finalText = textOfCollectionsEllements.replace("[","")
                .replace("]","");

        return finalText;
    }
}
