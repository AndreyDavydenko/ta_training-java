package com.epam.training.student_andrey_davydenko;

import java.util.Scanner;
public class ElectronicWatch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int seconds = scanner.nextInt();
            if (seconds < 60) {
                System.out.println("0:00:"+seconds);
            } else if (seconds > 60) {
                if (seconds < 3600) {
                    if(seconds/60<10 && seconds%60<10){
                        System.out.println("0:0"+seconds/60+":0"+seconds%60);}
                    else if(seconds/60>10 && seconds%60>10){
                        System.out.println("0:"+seconds/60+":"+seconds%60);}
                    else if(seconds/60>10 && seconds%60<10){
                        System.out.println("0:"+seconds/60+":0"+seconds%60);}
                    else if(seconds/60<10 && seconds%60>10){
                        System.out.println("0:0"+seconds/60+":"+seconds%60);}
                } else {
                    if(seconds/3600<10 && seconds%3600/60<10 && seconds%3600%60<10){
                        System.out.println("0"+seconds/3600%24+":0"+seconds%3600/60+":0"+seconds%3600%60);}
                    else if(seconds/3600>10 && seconds%3600/60>10 && seconds%3600%60>10){
                        System.out.println(seconds/3600%24+":"+seconds%3600/60+":"+seconds%3600%60);}
                    else if(seconds/3600>10 && seconds%3600/60>10 && seconds%3600%60<10){
                        System.out.println(seconds/3600%24+":"+seconds%3600/60+":0"+seconds%3600%60);}
                    else if(seconds/3600>10 && seconds%3600/60<10 && seconds%3600%60>10){
                        System.out.println(seconds/3600%24+":0"+seconds%3600/60+":"+seconds%3600%60);}
                    else if(seconds/3600<10 && seconds%3600/60>10 && seconds%3600%60>10){
                        System.out.println("0"+seconds/3600%24+":"+seconds%3600/60+":"+seconds%3600%60);}
                    else if(seconds/3600<10 && seconds%3600/60<10 && seconds%3600%60>10){
                        System.out.println("0"+seconds/3600%24+":0"+seconds%3600/60+":"+seconds%3600%60);}
                    else if(seconds/3600<10 && seconds%3600/60>10 && seconds%3600%60<10){
                        System.out.println("0"+seconds/3600%24+":"+seconds%3600/60+":0"+seconds%3600%60);}
                    else if(seconds/3600>10 && seconds%3600/60<10 && seconds%3600%60<10){
                        System.out.println(seconds/3600%24+":0"+seconds%3600/60+":0"+seconds%3600%60);
                    }
                }
            }

        }
    }
