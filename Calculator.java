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
    
