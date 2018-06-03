import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class Calculator {
    // 操作数1，为了程序安全，初始设置为0
    String str1 = "0";
    
    // 操作数2
    String str2 = "0";
    
    // 运算符
    String signal = "+";
    
    // 运算结果
    String result = "";
    
    // 以下K1至k2为状态开关
    
    // 开关1用于选择输入方向，将要写入str1或str2
    int k1 = 1;
    // 开关2用于记录符号键的次数，如果 k2>1， 说明进行的是 2+3-9+8 这样的多符号运算
    int k2 = 1;
    // 开关3用于识别str1 是否可以被清0 ，等于1时可以，不等于1时不能被清0
    int k3 = 1;
    // 开关4用于识别 str2 是否可以被清0
    int k4 = 1;
    // 开关5用于控制小数点可否被录入，等于1时可以， 不为1时，输入的小数点被丢掉
    int k5 = 1;
    // stone的作用类似于寄存器， 用于记录是否连续按下符号键
    JButton store;
    
    @SuppressWarnings("rawtypes")
    Vector vt = new Vector(20, 10);
    
    // 声明各个UI组件对象并初始化
    JFrame frame = new JFrame("Calculator");
    JTextField result_TextField = new JTextField(result, 20);
    JButton clear_Button = new JButton("Clear");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button_dian = new JButton(".");
    JButton button_jia = new JButton("+");
    JButton button_jian = new JButton("-");
    JButton button_cheng = new JButton("*");
    JButton button_chu = new JButton("/");
    JButton button_dy = new JButton("=");
    
