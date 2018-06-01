package com.hy.file;

import java.io.*;

/**
 * @ClassName ReadLine
 * @Desc 将n万条数据的文件，拆分成几个文件
 * @Author wyx
 * @Date 2018/5/3 16:15
 * @Version 1.0
 */
public class ReadLine {
    public static void main(String[] args) throws IOException {
        String encoding = "GBK";
        String path = "D:\\delete\\";
        File file = new File(path + "big.txt");
        if (file.isFile() && file.exists()) {
            InputStreamReader read = null;
            try {
                read = new InputStreamReader(new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                Integer size = 0;
                String filename = "";
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    if (size == 3 || size == 0) {
                        filename = path + System.currentTimeMillis() + ".txt";
                        boolean isCreate = createFile(filename);
                        if (!isCreate) {
                            continue;
                        }
                        size = 0;
                    }
                    writeLine(filename, lineTxt);
                    size++;
                }
                read.close();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 向一个文件中追加内容
     *
     * @param fileName
     * @param content
     */
    public static void writeLine(String fileName, String content) {
        try {
            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean createFile(String name) throws IOException {
        File filename = new File(name);
        if (!filename.exists()) {
            return filename.createNewFile();
        }
        return false;
    }
}
