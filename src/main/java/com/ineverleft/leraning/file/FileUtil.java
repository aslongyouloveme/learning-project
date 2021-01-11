package com.ineverleft.leraning.file;

import cn.hutool.core.img.Img;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.http.HttpUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtil {

    public static void main(String[] args) {

        FileReader fileReader = FileReader.create(new File("/Volumes/work/1.txt"));
        String[] array = fileReader.readString().split("\n");

        List<String> resultList = new ArrayList<>(array.length);
        for (String s : array) {
            resultList.add(s);
        }

        resultList.stream().forEach(r -> HttpUtil.downloadFile("https://banklogo.yfb.now.sh/resource/logo/"+ r ,"/Volumes/work/imgs"));

    }
}
