package org.example;

public class Main {
    public static class Infomation {
        String name = "Nguyễn Việt Bắc";
        String id = "22022511";
        String grade = "QH-2022-I/CQ-AI1";
        String username = "kaitobac";
        String email = "bac17012004@gmail.com";

        String getName() {
            return name;
        }

        String getId() {
            return id;
        }

        String getGrade() {
            return grade;
        }

        String getUsername() {
            return username;
        }

        String getEmail() {
            return email;
        }

    }
    public static void essayLoop(){
        for(int i=9;i>=1;i--){
            System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer.\n" +"Take one down, pass it around, ");
        }
        System.out.println("No more bottles of beer on the wall.");
    }
    public static void main(String[] args) {
        Infomation inf = new Infomation();
        System.out.println(inf.getName() + '\t' + inf.getId() + '\t' + inf.getGrade() + '\t' + inf.getUsername() + '\t' + inf.getEmail());
        essayLoop();
    }
}