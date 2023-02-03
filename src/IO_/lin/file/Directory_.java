package IO_.lin.file;

import org.junit.Test;

import java.io.File;

/**
 * @author lin
 * @creat 2022--12--11:00
 */
public class Directory_ {
    public static void main(String[] args) {

        //
    }

    //判断 d:\\news1.txt 是否存在，如果存在就删除(判断文件是否存在）
    @Test
    public void m1() {

        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {//delete返回的是布尔值
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }

    }

    //判断 D:\\demo02 是否存在，存在就删除，否则提示不存在（判断目录是否存在）
    //这里我们需要体会到，在java编程中，目录也被当做文件
    @Test
    public void m2() {

        String filePath = "D:\\demo02";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该目录不存在...");
        }

    }

    //判断 D:\\demo\\a\\b\\c 目录是否存在，如果存在就提示已经存在，否则就创建
    @Test
    public void m3() {

        String directoryPath = "D:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "存在..");
        } else {
            if (file.mkdirs()) { //创建一级目录使用mkdir() ，创建多级目录使用mkdirs()
                System.out.println(directoryPath + "创建成功..");
            } else {
                System.out.println(directoryPath + "创建失败...");
            }
        }
    }
}

