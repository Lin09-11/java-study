package Tank.Tanggame02;

import javax.swing.*;

/**
 * @author lin
 * @creat 2022--11--22:10
 */
public class LinTankGame02 extends JFrame {

    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {

        LinTankGame02 hspTankGame01 = new LinTankGame02();
    }

    public LinTankGame02() {
        mp = new MyPanel();
        this.add(mp);//把面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.addKeyListener(mp);//让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

