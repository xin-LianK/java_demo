package demo;
import java.lang.*; //��Ҫ�Ǻ����Է���ģ����ɽ��ͳ����Զ����أ�����Ҫ��ʾ˵��

import java.io.*; //��Ҫ����������/�����ص��࣬��Щ���ṩ�˶Բ�ͬ�����������豸��д���ݵ�֧�֣���Щ���������豸�������̡���ʾ������ӡ���������ļ��ȡ�

import java.util.*; //������������ض����ܵ��࣬�����ڡ���������ϣ������ջ�ȣ����� Date��֧����ʱ���йصĲ�����

//import java.swing.*;
import java.awt.*; //�ṩ�˴���ͼ���û�����Ԫ�ص��ࡣͨ����ЩԪ�أ�����߿��Կ�����д�� Applet �� Application ����۽��档���а����˴��ڡ��Ի��򡢲˵����ࡣ

import java.net.*; // ���������������ص��࣬�� TCP Scokets��URL �ȹ��ߡ�

import java.applet.*; //���п��� HTML �ĵ���ʽ��Ӧ�ó����е���������Դ���࣬���� Applet������������������ HTML �� Applet �ز����ٵ��ࡣ

import java.beans.*; // ������Ӧ�ó����̽ӿڣ�API����Java Beans �� Java Ӧ�ó��򻷾�������ƽ̨����ṹ��

//									����10��10~100֮������������
public class Bao {
	public static void main(String[] args) {
		int a;
		System.out.println("�����Ϊ��");
		for(int i = 1; i <= 10; i++) {
			a = (int)( (100 - 10 + 1) * Math.random()+10 );
			System.out.println(" " + a);
		}
		System.out.println();
	}
}