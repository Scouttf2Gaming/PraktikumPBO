package acakEnkapsulasi;

import javax.swing.JOptionPane;
/**
 *
 * @author Kelompok 6
 */
public class GameTebakAngka {

    private String pemain;
    int jawab;
    private int level;
    private int nilai = (int) (100);
    int a = (int) (Math.random() * 50) + 50;
    ;
    int b = (int) (Math.random() * 30) + 20;
    int c = (int) (Math.random() * 10) + 1;

    public String getPemain() {
        return pemain;
    }

    public void setPemain(String pemain) {
        this.pemain = pemain;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    GameTebakAngka(String pemain, int level, int jawab, int nilai) {
        this.pemain = pemain;
        this.level = level;
        this.jawab = jawab;
        this.nilai = nilai;

    }

    private void nama() {
        pemain = JOptionPane.showInputDialog(null, "MASUKAN USERNAME:", "NAMA PEMAIN", JOptionPane.INFORMATION_MESSAGE);

    }

    private void kesulitan() {
        String[] options = {"ADVANCE", "MEDIUM", "EASY"};
        level = JOptionPane.showOptionDialog(null, "PILIH TINGKAT KESULITAN ", "DIFFICULTY", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

    }

    void tampil() {
        this.kesulitan();
        JOptionPane.showMessageDialog(null, "SCORE AWAL     : " + this.nilai,"NILAI AWAL",JOptionPane.INFORMATION_MESSAGE);
        do {
            if (level == 0) {
                JOptionPane.showMessageDialog(null, "TEBAK ANGKA DARI 50-100","JARAK ANGKA",JOptionPane.INFORMATION_MESSAGE);
                jawab = Integer.parseInt(JOptionPane.showInputDialog(null, "MASUKKAN ANGKA YANG ANDA TEBAK????","JAWAB",JOptionPane.INFORMATION_MESSAGE));

                if (jawab > 100 || jawab < 50) {
                    JOptionPane.showMessageDialog(null, "yang anda masukan tidak valid"," ",JOptionPane.INFORMATION_MESSAGE);
                } else if (jawab == a) {
                    this.nilai += 10;
                    JOptionPane.showMessageDialog(null,
                            "CONGRATULATION!!! Angka yang anda masukkan BENAR!"," ",JOptionPane.INFORMATION_MESSAGE);
                } else if (jawab < a) {
                    this.nilai -= 5;
                    JOptionPane.showMessageDialog(null,
                            "Maaf , angka yang anda masukkan terlalu kecil" + "\nskor anda berkurang 5"," ",JOptionPane.INFORMATION_MESSAGE);
                } else if (jawab > a) {
                    this.nilai -= 5;
                    JOptionPane.showMessageDialog(null,
                            "Maaf , angka yang anda masukkan terlalu besar" + "\nskor anda berkurang 5"," ",JOptionPane.INFORMATION_MESSAGE);
                } else {
                }
            } else if (level == 1) {
                JOptionPane.showMessageDialog(null, "TEBAK ANGKA DARI 20-50","JARAK ANGKA",JOptionPane.INFORMATION_MESSAGE);
                jawab = Integer.parseInt(JOptionPane.showInputDialog(null, "MASUKKAN ANGKA YANG ANDA TEBAK????","JAWAB",JOptionPane.INFORMATION_MESSAGE));

                if (jawab > 50 || jawab < 20) {
                    JOptionPane.showMessageDialog(null, "yang anda masukan tidak valid"," ",JOptionPane.INFORMATION_MESSAGE);
                } else if (jawab == b) {
                    this.nilai += 10;
                    JOptionPane.showMessageDialog(null,
                            "CONGRATULATION!!! Angka yang anda masukkan BENAR!"," ",JOptionPane.INFORMATION_MESSAGE);
                } else if (jawab < b) {
                    this.nilai -= 5;
                    JOptionPane.showMessageDialog(null,
                            "Maaf , angka yang anda masukkan terlalu kecil" + "\nskor anda berkurang 5"," ",JOptionPane.INFORMATION_MESSAGE);
                } else if (jawab > b) {
                    this.nilai -= 5;
                    JOptionPane.showMessageDialog(null,
                            "Maaf , angka yang anda masukkan terlalu besar" + "\nskor anda berkurang 5"," ",JOptionPane.INFORMATION_MESSAGE);
                } else {
                }
            } else if (level == 2) {
                JOptionPane.showMessageDialog(null, "TEBAK ANGKA DARI 0-10","JARAK ANGKA",JOptionPane.INFORMATION_MESSAGE);
                jawab = Integer.parseInt(JOptionPane.showInputDialog(null, "MASUKKAN ANGKA YANG ANDA TEBAK????","JAWAB",JOptionPane.INFORMATION_MESSAGE));

                if (jawab > 10 || jawab < 0) {
                    JOptionPane.showMessageDialog(null, "yang anda masukan tidak valid"," ",JOptionPane.INFORMATION_MESSAGE);
                } else if (jawab == c) {
                    this.nilai += 10;
                    JOptionPane.showMessageDialog(null,
                            "CONGRATULATION!!! Angka yang anda masukkan BENAR!"," ",JOptionPane.INFORMATION_MESSAGE);
                } else if (jawab < c) {
                    this.nilai -= 5;
                    JOptionPane.showMessageDialog(null,
                            "Maaf , angka yang anda masukkan terlalu kecil" + "\nskor anda berkurang 5"," ",JOptionPane.INFORMATION_MESSAGE);
                } else if (jawab > c) {
                    this.nilai -= 5;
                    JOptionPane.showMessageDialog(null,
                            "Maaf , angka yang anda masukkan terlalu besar" + "\nskor anda berkurang 5"," ",JOptionPane.INFORMATION_MESSAGE);
                } else {
                }
            } else {
            }
        } while (
               do {}
               while () {            
            
        }
                
               );

        if (level == 0) {
            JOptionPane.showMessageDialog(null, "JAWABAN NYA ADALAH " + a, "JAWABAN", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "USERNAME      : " + pemain
                    + "\nSCORE AKHIR : " + this.nilai,"RESULTS",JOptionPane.INFORMATION_MESSAGE);
        } else if (level == 1) {
            JOptionPane.showMessageDialog(null, "JAWABAN NYA ADALAH " + b, "JAWABAN", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "USERNAME      : " + pemain
                    + "\nSCORE AKHIR : " + this.nilai,"RESULTS",JOptionPane.INFORMATION_MESSAGE);
        } else if (level == 2) {
            JOptionPane.showMessageDialog(null, "JAWABAN NYA ADALAH " + c, "JAWABAN", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "USERNAME      : " + pemain
                    + "\nSCORE AKHIR : " + this.nilai,"RESULTS",JOptionPane.INFORMATION_MESSAGE);
        } else {
        }
    }
}
