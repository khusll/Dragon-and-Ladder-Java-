
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class dragon extends JFrame implements ActionListener {

    private JLabel lblstart, lblstarttop, lblstartbottom, lblstartbottomlogo, lbls1, lbls2, lbls3, lbls4, lbls5, lbls6, lbls7, lbls8, lbls9, lbls10, lbls11, lbls12, lbls13, lbls14, lbls15, lbls16, lbls17, lbls18, lbls19, lbls20, lbls21, lbls22, lbls23, lbls24, lbls25, lbls26, lbls27, lbls28, lbls29, lbls30, lbls31, lbls32, lbls33, lbls34, lbls35, lbls36, lbls37, lbls38, lbls39, lbls40, lbls41, lbls42, lbls43, lbls44, lbls45, lbls46, lbls47, lbls48, lbls49, lbls50, lbls51, lbls52, lbls53, lbls54, lbls55, lbls56, lbls57, lbls58, lbls59, lbls60, lbls61, lbls62, lbls63, lbls64, lbls65, lbls66, lbls67, lbls68, lbls69, lbls70, lbls71, lbls72, lbls73, lbls74, lbls75, lbls76, lbls77, lbls78, lbls79, lbls80, lbls81, lbls82, lbls83, lbls84, lbls85, lbls86, lbls87, lbls88, lbls89, lbls90, lbls91, lbls92, lbls93, lbls94, lbls95, lbls96, lbls97, lbls98, lbls99, lbls100;
    private JLabel lblsblue, lblsred, lbldice, lbldice1, lbldice2, lbldice3, lbldice4, lbldice5, lbldice6, lblname, lblborder1, lblborder2, lblborder3, lblborder4;
    private JButton btnstart, lblplayer1, lblplayer2;
    private JProgressBar progstartl, progstart2;
    private JPanel pnlstart, p2;
    private JLabel lblp, lbll, lbla, lbly, lble, lblr, lblnull, lbl1, lbl2, lblw, lbli, lbln, lbls;
    int moveplayer1 = 0, moveplayer2 = 0, tmp1, tmp2;

    public dragon() {
        setIconImage(new ImageIcon("op.png").getImage());
        setResizable(false);
        setTitle("Dragon & Ladder");
        setSize(00, 322);
        //DECLARE OBJECTS

        ImageIcon img = new ImageIcon("joj.jpg");

        lblstart = new JLabel(img);

        lblstarttop = new JLabel("                    Welcome....");
        lblstartbottom = new JLabel("         Developed & Designed by Divya Thakur");

        ImageIcon img1 = new ImageIcon("op.png");
        lblstartbottomlogo = new JLabel(img1);

        lblplayer1 = new JButton("Player1");
        lblplayer2 = new JButton("Player2");

        ImageIcon blueIcon = new ImageIcon("images/drag1.jpg");
        ImageIcon redIcon = new ImageIcon("images/drag2.jpg");
        lblsblue = new JLabel(blueIcon);
        lblsred = new JLabel(redIcon);

        ImageIcon d1 = new ImageIcon("images/dice1.png");
        ImageIcon d2 = new ImageIcon("images/dice2.png");
        ImageIcon d3 = new ImageIcon("images/dice3.png");
        ImageIcon d4 = new ImageIcon("images/dice4.png");
        ImageIcon d5 = new ImageIcon("images/dice5.png");
        ImageIcon d6 = new ImageIcon("images/dice6.png");
        lbldice = new JLabel();
        lbldice1 = new JLabel(d1);
        lbldice2 = new JLabel(d2);
        lbldice3 = new JLabel(d3);
        lbldice4 = new JLabel(d4);
        lbldice5 = new JLabel(d5);
        lbldice6 = new JLabel(d6);

        lblborder1 = new JLabel();
        lblborder2 = new JLabel();
        lblborder3 = new JLabel();
        lblborder4 = new JLabel();

        lblp = new JLabel();
        lbll = new JLabel();
        lbla = new JLabel();
        lbly = new JLabel();
        lble = new JLabel();
        lblr = new JLabel();
        lblnull = new JLabel();
        lbl1 = new JLabel();
        lbl2 = new JLabel();
        lblw = new JLabel();
        lbli = new JLabel();
        lbln = new JLabel();
        lbls = new JLabel();

        lblname = new JLabel("       .....................................!!!");
        //	SET IMAGES ON LABEL FOR PATTERN

        ImageIcon s1 = new ImageIcon("images/s1.png");
        lbls1 = new JLabel(s1);

        ImageIcon s2 = new ImageIcon("images/S2.png");
        lbls2 = new JLabel(s2);

        ImageIcon s3 = new ImageIcon("images/S3.png");
        lbls3 = new JLabel(s3);

        ImageIcon s4 = new ImageIcon("images/S4.png");
        lbls4 = new JLabel(s4);

        ImageIcon s5 = new ImageIcon("images/S5.png");
        lbls5 = new JLabel(s5);

        ImageIcon s6 = new ImageIcon("images/S6.png");
        lbls6 = new JLabel(s6);

        ImageIcon s7 = new ImageIcon("images/S7.png");
        lbls7 = new JLabel(s7);

        ImageIcon s8 = new ImageIcon("images/S8.png");
        lbls8 = new JLabel(s8);

        ImageIcon s9 = new ImageIcon("images/S9.png");
        lbls9 = new JLabel(s9);

        ImageIcon s10 = new ImageIcon("images/S10.png");
        lbls10 = new JLabel(s10);

        ImageIcon s11 = new ImageIcon("images/S11.png");
        lbls11 = new JLabel(s11);

        ImageIcon s12 = new ImageIcon("images/S12.png");
        lbls12 = new JLabel(s12);

        ImageIcon s13 = new ImageIcon("images/S13.png");
        lbls13 = new JLabel(s13);

        ImageIcon s14 = new ImageIcon("images/S14.png");
        lbls14 = new JLabel(s14);

        ImageIcon s15 = new ImageIcon("images/S15.png");
        lbls15 = new JLabel(s15);

        ImageIcon s16 = new ImageIcon("images/S16.png");
        lbls16 = new JLabel(s16);

        ImageIcon s17 = new ImageIcon("images/S17.png");
        lbls17 = new JLabel(s17);

        ImageIcon s18 = new ImageIcon("images/S18.png");
        lbls18 = new JLabel(s18);

        ImageIcon s19 = new ImageIcon("images/S19.png");
        lbls19 = new JLabel(s19);

        ImageIcon s20 = new ImageIcon("images/S20.png");
        lbls20 = new JLabel(s20);

        ImageIcon s21 = new ImageIcon("images/S21.png");
        lbls21 = new JLabel(s21);

        ImageIcon s22 = new ImageIcon("images/S22.png");
        lbls22 = new JLabel(s22);

        ImageIcon s23 = new ImageIcon("images/S23.png");
        lbls23 = new JLabel(s23);

        ImageIcon s24 = new ImageIcon("images/S24.png");
        lbls24 = new JLabel(s24);

        ImageIcon s25 = new ImageIcon("images/S25.png");
        lbls25 = new JLabel(s25);

        ImageIcon s26 = new ImageIcon("images/S26.png");
        lbls26 = new JLabel(s26);

        ImageIcon s27 = new ImageIcon("images/S27.png");
        lbls27 = new JLabel(s27);

        ImageIcon s28 = new ImageIcon("images/S28.png");
        lbls28 = new JLabel(s28);

        ImageIcon s29 = new ImageIcon("images/S29.png");
        lbls29 = new JLabel(s29);

        ImageIcon s30 = new ImageIcon("images/S30.png");
        lbls30 = new JLabel(s30);

        ImageIcon s31 = new ImageIcon("images/S31.png");
        lbls31 = new JLabel(s31);

        ImageIcon s32 = new ImageIcon("images/S32.png");
        lbls32 = new JLabel(s32);

        ImageIcon s33 = new ImageIcon("images/S33.png");
        lbls33 = new JLabel(s33);

        ImageIcon s34 = new ImageIcon("images/S34.png");
        lbls34 = new JLabel(s34);

        ImageIcon s35 = new ImageIcon("images/S35.png");
        lbls35 = new JLabel(s35);

        ImageIcon s36 = new ImageIcon("images/S36.png");
        lbls36 = new JLabel(s36);

        ImageIcon s37 = new ImageIcon("images/S37.png");
        lbls37 = new JLabel(s37);

        ImageIcon s38 = new ImageIcon("images/S38.png");
        lbls38 = new JLabel(s38);

        ImageIcon s39 = new ImageIcon("images/S39.png");
        lbls39 = new JLabel(s39);

        ImageIcon s40 = new ImageIcon("images/S40.png");
        lbls40 = new JLabel(s40);

        ImageIcon s41 = new ImageIcon("images/S41.png");
        lbls41 = new JLabel(s41);

        ImageIcon s42 = new ImageIcon("images/S42.png");
        lbls42 = new JLabel(s42);

        ImageIcon s43 = new ImageIcon("images/S43.png");
        lbls43 = new JLabel(s43);

        ImageIcon s44 = new ImageIcon("images/S44.png");
        lbls44 = new JLabel(s44);

        ImageIcon s45 = new ImageIcon("images/S45.png");
        lbls45 = new JLabel(s45);

        ImageIcon s46 = new ImageIcon("images/S46.png");
        lbls46 = new JLabel(s46);

        ImageIcon s47 = new ImageIcon("images/S47.png");
        lbls47 = new JLabel(s47);

        ImageIcon s48 = new ImageIcon("images/S48.png");
        lbls48 = new JLabel(s48);

        ImageIcon s49 = new ImageIcon("images/S49.png");
        lbls49 = new JLabel(s49);

        ImageIcon s50 = new ImageIcon("images/S50.png");
        lbls50 = new JLabel(s50);

        ImageIcon s51 = new ImageIcon("images/S51.png");
        lbls51 = new JLabel(s51);

        ImageIcon s52 = new ImageIcon("images/S52.png");
        lbls52 = new JLabel(s52);

        ImageIcon s53 = new ImageIcon("images/S53.png");
        lbls53 = new JLabel(s53);

        ImageIcon s54 = new ImageIcon("images/S54.png");
        lbls54 = new JLabel(s54);

        ImageIcon s55 = new ImageIcon("images/S55.png");
        lbls55 = new JLabel(s55);

        ImageIcon s56 = new ImageIcon("images/S56.png");
        lbls56 = new JLabel(s56);

        ImageIcon s57 = new ImageIcon("images/S57.png");
        lbls57 = new JLabel(s57);

        ImageIcon s58 = new ImageIcon("images/S58.png");
        lbls58 = new JLabel(s58);

        ImageIcon s59 = new ImageIcon("images/S59.png");
        lbls59 = new JLabel(s59);

        ImageIcon s60 = new ImageIcon("images/S60.png");
        lbls60 = new JLabel(s60);

        ImageIcon s61 = new ImageIcon("images/S61.png");
        lbls61 = new JLabel(s61);

        ImageIcon s62 = new ImageIcon("images/S62.png");
        lbls62 = new JLabel(s62);

        ImageIcon s63 = new ImageIcon("images/S63.png");
        lbls63 = new JLabel(s63);

        ImageIcon s64 = new ImageIcon("images/S64.png");
        lbls64 = new JLabel(s64);

        ImageIcon s65 = new ImageIcon("images/S65.png");
        lbls65 = new JLabel(s65);

        ImageIcon s66 = new ImageIcon("images/S66.png");
        lbls66 = new JLabel(s66);

        ImageIcon s67 = new ImageIcon("images/S67.png");
        lbls67 = new JLabel(s67);

        ImageIcon s68 = new ImageIcon("images/S68.png");
        lbls68 = new JLabel(s68);

        ImageIcon s69 = new ImageIcon("images/S69.png");
        lbls69 = new JLabel(s69);

        ImageIcon s70 = new ImageIcon("images/S70.png");
        lbls70 = new JLabel(s70);

        ImageIcon s71 = new ImageIcon("images/S71.png");
        lbls71 = new JLabel(s71);

        ImageIcon s72 = new ImageIcon("images/S72.png");
        lbls72 = new JLabel(s72);

        ImageIcon s73 = new ImageIcon("images/S73.png");
        lbls73 = new JLabel(s73);

        ImageIcon s74 = new ImageIcon("images/S74.png");
        lbls74 = new JLabel(s74);

        ImageIcon s75 = new ImageIcon("images/S75.png");
        lbls75 = new JLabel(s75);

        ImageIcon s76 = new ImageIcon("images/S76.png");
        lbls76 = new JLabel(s76);

        ImageIcon s77 = new ImageIcon("images/S77.png");
        lbls77 = new JLabel(s77);

        ImageIcon s78 = new ImageIcon("images/S78.png");
        lbls78 = new JLabel(s78);

        ImageIcon s79 = new ImageIcon("images/S79.png");
        lbls79 = new JLabel(s79);

        ImageIcon s80 = new ImageIcon("images/S80.png");
        lbls80 = new JLabel(s80);

        ImageIcon s81 = new ImageIcon("images/S81.png");
        lbls81 = new JLabel(s81);

        ImageIcon s82 = new ImageIcon("images/S82.png");
        lbls82 = new JLabel(s82);

        ImageIcon s83 = new ImageIcon("images/S83.png");
        lbls83 = new JLabel(s83);

        ImageIcon s84 = new ImageIcon("images/S84.png");
        lbls84 = new JLabel(s84);

        ImageIcon s85 = new ImageIcon("images/S85.png");
        lbls85 = new JLabel(s85);

        ImageIcon s86 = new ImageIcon("images/S86.png");
        lbls86 = new JLabel(s86);

        ImageIcon s87 = new ImageIcon("images/S87.png");
        lbls87 = new JLabel(s87);

        ImageIcon s88 = new ImageIcon("images/S88.png");
        lbls88 = new JLabel(s88);

        ImageIcon s89 = new ImageIcon("images/S89.png");
        lbls89 = new JLabel(s89);

        ImageIcon s90 = new ImageIcon("images/S90.png");
        lbls90 = new JLabel(s90);

        ImageIcon s91 = new ImageIcon("images/S91.png");
        lbls91 = new JLabel(s91);

        ImageIcon s92 = new ImageIcon("images/S92.png");
        lbls92 = new JLabel(s92);

        ImageIcon s93 = new ImageIcon("images/S93.png");
        lbls93 = new JLabel(s93);

        ImageIcon s94 = new ImageIcon("images/S94.png");
        lbls94 = new JLabel(s94);

        ImageIcon s95 = new ImageIcon("images/S95.png");
        lbls95 = new JLabel(s95);

        ImageIcon s96 = new ImageIcon("images/S96.png");
        lbls96 = new JLabel(s96);

        ImageIcon s97 = new ImageIcon("images/S97.png");
        lbls97 = new JLabel(s97);

        ImageIcon s98 = new ImageIcon("images/S98.png");
        lbls98 = new JLabel(s98);

        ImageIcon s99 = new ImageIcon("images/S99.png");
        lbls99 = new JLabel(s99);

        ImageIcon s100 = new ImageIcon("images/S100.png");
        lbls100 = new JLabel(s100);

        btnstart = new JButton("Start Game");

        pnlstart = new JPanel();
        pnlstart.setPreferredSize(new Dimension(300, 200));

        progstartl = new JProgressBar();
        progstartl.setPreferredSize(new Dimension(300, 10));
        progstartl.setMaximum(100);
        progstartl.setMinimum(0);

        progstart2 = new JProgressBar();
        progstart2.setPreferredSize(new Dimension(100, 10));
        progstart2.setMaximum(50);
        progstart2.setMinimum(0);

        //Prgoress Bar	POSITION AND SIZE
        progstartl.setBounds(50, 140, 280, 7);

        //Label POSITION AND SIZE
        lblstart.setBounds(0, 0, 400, 300);
        lblstarttop.setBounds(0, 0, 400, 50);
        lblstartbottom.setBounds(0, 253, 344, 40);
        lblstartbottomlogo.setBounds(340, 253, 68, 40);

        lbls1.setBounds(60, 550, 50, 53);
        lbls2.setBounds(110, 550, 50, 53);
        lbls3.setBounds(160, 550, 50, 53);
        lbls4.setBounds(210, 550, 50, 53);
        lbls5.setBounds(260, 550, 50, 53);
        lbls6.setBounds(310, 550, 50, 53);
        lbls7.setBounds(360, 550, 50, 53);
        lbls8.setBounds(410, 550, 50, 53);
        lbls9.setBounds(460, 550, 50, 53);
        lbls10.setBounds(510, 550, 50, 53);
        lbls20.setBounds(60, 500, 50, 53);
        lbls19.setBounds(110, 500, 50, 53);
        lbls18.setBounds(160, 500, 50, 53);
        lbls17.setBounds(210, 500, 50, 53);
        lbls16.setBounds(260, 500, 50, 53);
        lbls15.setBounds(310, 500, 50, 53);
        lbls14.setBounds(360, 500, 50, 53);
        lbls13.setBounds(410, 500, 50, 53);
        lbls12.setBounds(460, 500, 50, 53);
        lbls11.setBounds(510, 500, 50, 53);
        lbls21.setBounds(60, 450, 50, 53);
        lbls22.setBounds(110, 450, 50, 53);
        lbls23.setBounds(160, 450, 50, 53);
        lbls24.setBounds(210, 450, 50, 53);
        lbls25.setBounds(260, 450, 50, 53);
        lbls26.setBounds(310, 450, 50, 53);
        lbls27.setBounds(360, 450, 50, 53);
        lbls28.setBounds(410, 450, 50, 53);
        lbls29.setBounds(460, 450, 50, 53);
        lbls30.setBounds(510, 450, 50, 53);
        lbls40.setBounds(60, 400, 50, 53);
        lbls39.setBounds(110, 400, 50, 53);
        lbls38.setBounds(160, 400, 50, 53);
        lbls37.setBounds(210, 400, 50, 53);
        lbls36.setBounds(260, 400, 50, 53);
        lbls35.setBounds(310, 400, 50, 53);
        lbls34.setBounds(360, 400, 50, 53);
        lbls33.setBounds(410, 400, 50, 53);
        lbls32.setBounds(460, 400, 50, 53);
        lbls31.setBounds(510, 400, 50, 53);
        lbls41.setBounds(60, 350, 50, 53);
        lbls42.setBounds(110, 350, 50, 53);
        lbls43.setBounds(160, 350, 50, 53);
        lbls44.setBounds(210, 350, 50, 53);
        lbls45.setBounds(260, 350, 50, 53);
        lbls46.setBounds(310, 350, 50, 53);
        lbls47.setBounds(360, 350, 50, 53);
        lbls48.setBounds(410, 350, 50, 53);
        lbls49.setBounds(460, 350, 50, 53);
        lbls50.setBounds(510, 350, 50, 53);
        lbls60.setBounds(60, 300, 50, 53);
        lbls59.setBounds(110, 300, 50, 53);
        lbls58.setBounds(160, 300, 50, 53);
        lbls57.setBounds(210, 300, 50, 53);
        lbls56.setBounds(260, 300, 50, 53);
        lbls55.setBounds(310, 300, 50, 53);
        lbls54.setBounds(360, 300, 50, 53);
        lbls53.setBounds(410, 300, 50, 53);
        lbls52.setBounds(460, 300, 50, 53);
        lbls51.setBounds(510, 300, 50, 53);
        lbls61.setBounds(60, 250, 50, 53);
        lbls62.setBounds(110, 250, 50, 53);
        lbls63.setBounds(160, 250, 50, 53);
        lbls64.setBounds(210, 250, 50, 53);
        lbls65.setBounds(260, 250, 50, 53);
        lbls66.setBounds(310, 250, 50, 53);
        lbls67.setBounds(360, 250, 50, 53);
        lbls68.setBounds(410, 250, 50, 53);
        lbls69.setBounds(460, 250, 50, 53);
        lbls70.setBounds(510, 250, 50, 53);
        lbls80.setBounds(60, 200, 50, 53);
        lbls79.setBounds(110, 200, 50, 53);
        lbls78.setBounds(160, 200, 50, 53);
        lbls77.setBounds(210, 200, 50, 53);
        lbls76.setBounds(260, 200, 50, 53);
        lbls75.setBounds(310, 200, 50, 53);
        lbls74.setBounds(360, 200, 50, 53);
        lbls73.setBounds(410, 200, 50, 53);
        lbls72.setBounds(460, 200, 50, 53);
        lbls71.setBounds(510, 200, 50, 53);
        lbls81.setBounds(60, 150, 50, 53);
        lbls82.setBounds(110, 150, 50, 53);
        lbls83.setBounds(160, 150, 50, 53);
        lbls84.setBounds(210, 150, 50, 53);
        lbls85.setBounds(260, 150, 50, 53);
        lbls86.setBounds(310, 150, 50, 53);
        lbls87.setBounds(360, 150, 50, 53);
        lbls88.setBounds(410, 150, 50, 53);
        lbls89.setBounds(460, 150, 50, 53);
        lbls90.setBounds(510, 150, 50, 53);
        lbls100.setBounds(60, 100, 50, 53);
        lbls99.setBounds(110, 100, 50, 53);
        lbls98.setBounds(160, 100, 50, 53);
        lbls97.setBounds(210, 100, 50, 53);
        lbls96.setBounds(260, 100, 50, 53);
        lbls95.setBounds(310, 100, 50, 53);
        lbls94.setBounds(360, 100, 50, 53);
        lbls93.setBounds(410, 100, 50, 53);
        lbls92.setBounds(460, 100, 50, 53);
        lbls91.setBounds(510, 100, 50, 53);

        lblplayer1.setBounds(615, 500, 150, 35);
        lblplayer2.setBounds(615, 550, 150, 35);

        lblsblue.setBounds(30, 555, 20, 20);
        lblsred.setBounds(30, 580, 20, 20);

        lbldice.setBounds(645, 145, 90, 90);
        lbldice1.setBounds(645, 145, 90, 90);
        lbldice2.setBounds(645, 145, 90, 90);
        lbldice3.setBounds(645, 145, 90, 90);
        lbldice4.setBounds(645, 145, 90, 90);
        lbldice5.setBounds(645, 145, 90, 90);
        lbldice6.setBounds(645, 145, 90, 90);

        lblname.setBounds(590, 105, 210, 30);

        lblborder1.setBounds(55, 95, 510, 10);
        lblborder2.setBounds(560, 95, 10, 510);
        lblborder3.setBounds(55, 600, 515, 10);
        lblborder4.setBounds(55, 95, 10, 510);

        progstart2.setBounds(640, 250, 100, 10);
        //	SET BORDERS................

        Border b1 = BorderFactory.createLineBorder(Color.BLACK);
        lbls1.setBorder(b1);
        lbls2.setBorder(b1);
        lbls3.setBorder(b1);
        lbls4.setBorder(b1);
        lbls5.setBorder(b1);
        lbls6.setBorder(b1);
        lbls7.setBorder(b1);
        lbls8.setBorder(b1);
        lbls9.setBorder(b1);
        lbls10.setBorder(b1);
        lbls11.setBorder(b1);
        lbls12.setBorder(b1);
        lbls13.setBorder(b1);
        lbls14.setBorder(b1);
        lbls15.setBorder(b1);
        lbls16.setBorder(b1);
        lbls17.setBorder(b1);
        lbls18.setBorder(b1);
        lbls19.setBorder(b1);
        lbls20.setBorder(b1);
        lbls21.setBorder(b1);
        lbls22.setBorder(b1);
        lbls23.setBorder(b1);
        lbls24.setBorder(b1);
        lbls25.setBorder(b1);
        lbls26.setBorder(b1);
        lbls27.setBorder(b1);
        lbls28.setBorder(b1);
        lbls29.setBorder(b1);
        lbls30.setBorder(b1);
        lbls31.setBorder(b1);
        lbls32.setBorder(b1);
        lbls33.setBorder(b1);
        lbls34.setBorder(b1);
        lbls35.setBorder(b1);
        lbls36.setBorder(b1);
        lbls37.setBorder(b1);
        lbls38.setBorder(b1);
        lbls39.setBorder(b1);
        lbls40.setBorder(b1);
        lbls41.setBorder(b1);
        lbls42.setBorder(b1);
        lbls43.setBorder(b1);
        lbls44.setBorder(b1);
        lbls45.setBorder(b1);
        lbls46.setBorder(b1);
        lbls47.setBorder(b1);
        lbls48.setBorder(b1);
        lbls49.setBorder(b1);
        lbls50.setBorder(b1);
        lbls51.setBorder(b1);
        lbls52.setBorder(b1);
        lbls53.setBorder(b1);
        lbls54.setBorder(b1);
        lbls55.setBorder(b1);
        lbls56.setBorder(b1);
        lbls57.setBorder(b1);
        lbls58.setBorder(b1);
        lbls59.setBorder(b1);
        lbls60.setBorder(b1);
        lbls61.setBorder(b1);
        lbls62.setBorder(b1);
        lbls63.setBorder(b1);
        lbls64.setBorder(b1);
        lbls65.setBorder(b1);
        lbls66.setBorder(b1);
        lbls67.setBorder(b1);
        lbls68.setBorder(b1);
        lbls69.setBorder(b1);
        lbls70.setBorder(b1);
        lbls71.setBorder(b1);
        lbls72.setBorder(b1);
        lbls73.setBorder(b1);
        lbls74.setBorder(b1);
        lbls75.setBorder(b1);
        lbls76.setBorder(b1);
        lbls77.setBorder(b1);
        lbls78.setBorder(b1);
        lbls79.setBorder(b1);
        lbls80.setBorder(b1);
        lbls81.setBorder(b1);
        lbls82.setBorder(b1);
        lbls83.setBorder(b1);
        lbls84.setBorder(b1);
        lbls85.setBorder(b1);
        lbls86.setBorder(b1);
        lbls87.setBorder(b1);
        lbls88.setBorder(b1);
        lbls89.setBorder(b1);
        lbls90.setBorder(b1);
        lbls91.setBorder(b1);
        lbls92.setBorder(b1);
        lbls93.setBorder(b1);
        lbls94.setBorder(b1);
        lbls95.setBorder(b1);
        lbls96.setBorder(b1);
        lbls97.setBorder(b1);
        lbls98.setBorder(b1);
        lbls99.setBorder(b1);
        lbls100.setBorder(b1);
        lbldice.setBorder(b1);
        lbldice1.setBorder(b1);
        lbldice2.setBorder(b1);
        lbldice3.setBorder(b1);
        lbldice4.setBorder(b1);
        lbldice5.setBorder(b1);
        lbldice6.setBorder(b1);

        //Button	POSITION AND SIZE
        btnstart.setOpaque(true);
        btnstart.setBounds(125, 210, 150, 30);

        //SET COLOR
        lblstarttop.setOpaque(true);
        lblstarttop.setBackground(new Color(0, 0, 0));
        lblstarttop.setForeground(new Color(255, 255, 255));

        lblstartbottom.setOpaque(true);
        lblstartbottom.setBackground(new Color(0, 0, 0));
        lblstartbottom.setForeground(new Color(255, 255, 255));

        lblstartbottomlogo.setOpaque(true);
        lblstartbottomlogo.setBackground(new Color(0, 0, 0));

        btnstart.setBackground(new Color(65, 67, 46));
        btnstart.setForeground(new Color(255, 255, 255));

        lbls1.setOpaque(true);
        lbls1.setBackground(new Color(0, 0, 0));

        lbls2.setOpaque(true);
        lbls2.setBackground(new Color(0, 0, 0));

        lbls3.setOpaque(true);
        lbls3.setBackground(new Color(0, 0, 0));

        lbls4.setOpaque(true);
        lbls4.setBackground(new Color(0, 0, 0));

        lbls5.setOpaque(true);
        lbls5.setBackground(new Color(0, 0, 0));

        lblsblue.setOpaque(true);
        lblsblue.setBackground(new Color(11, 55, 183));

        lblsred.setOpaque(true);
        lblsred.setBackground(new Color(207, 30, 47));

        lblplayer1.setOpaque(true);
        lblplayer1.setBackground(new Color(11, 55, 183));
        lblplayer1.setForeground(new Color(255, 255, 255));

        lblplayer2.setOpaque(true);
        lblplayer2.setBackground(new Color(207, 30, 47));
        lblplayer2.setForeground(new Color(255, 255, 255));

        lbldice.setOpaque(true);
        lbldice.setBackground(new Color(255, 255, 255));

        lblname.setOpaque(true);
        lblname.setBackground(new Color(222, 110, 0));
        lblname.setForeground(new Color(255, 255, 255));

        lblborder1.setOpaque(true);
        lblborder1.setBackground(new Color(0, 0, 0));
        lblborder2.setOpaque(true);
        lblborder2.setBackground(new Color(0, 0, 0));
        lblborder3.setOpaque(true);
        lblborder3.setBackground(new Color(0, 0, 0));
        lblborder4.setOpaque(true);
        lblborder4.setBackground(new Color(0, 0, 0));
        //ADD COMPONENTS
        add(pnlstart);
        add(lblstart);
        add(lblstarttop);
        add(btnstart);
        add(progstartl);
        add(lblstartbottom);
        add(lblstartbottomlogo);
        add(lblsblue);
        add(lblsred);

        add(lblp);
        add(lbll);
        add(lbla);
        add(lbly);
        add(lble);
        add(lblr);
        add(lblnull);
        add(lbl1);
        add(lbl2);
        add(lblw);
        add(lbli);
        add(lbln);
        add(lbls);

        add(lbls1);
        add(lbls2);
        add(lbls3);
        add(lbls4);
        add(lbls5);
        add(lbls6);
        add(lbls7);
        add(lbls8);
        add(lbls9);
        add(lbls10);
        add(lbls11);
        add(lbls12);
        add(lbls13);
        add(lbls14);
        add(lbls15);
        add(lbls16);
        add(lbls17);
        add(lbls18);
        add(lbls19);
        add(lbls20);
        add(lbls21);
        add(lbls22);
        add(lbls23);
        add(lbls24);
        add(lbls25);
        add(lbls26);
        add(lbls27);
        add(lbls28);
        add(lbls29);
        add(lbls30);
        add(lbls31);
        add(lbls32);
        add(lbls33);
        add(lbls34);
        add(lbls35);
        add(lbls36);
        add(lbls37);
        add(lbls38);
        add(lbls39);
        add(lbls40);
        add(lbls41);
        add(lbls42);
        add(lbls43);
        add(lbls44);
        add(lbls45);
        add(lbls46);
        add(lbls47);
        add(lbls48);
        add(lbls49);
        add(lbls50);
        add(lbls51);
        add(lbls52);
        add(lbls53);
        add(lbls54);
        add(lbls55);
        add(lbls56);
        add(lbls57);
        add(lbls58);
        add(lbls59);
        add(lbls60);
        add(lbls61);
        add(lbls62);
        add(lbls63);
        add(lbls64);
        add(lbls65);
        add(lbls66);
        add(lbls67);
        add(lbls68);
        add(lbls69);
        add(lbls70);
        add(lbls71);
        add(lbls72);
        add(lbls73);
        add(lbls74);
        add(lbls75);
        add(lbls76);
        add(lbls77);
        add(lbls78);
        add(lbls79);
        add(lbls80);
        add(lbls81);
        add(lbls82);
        add(lbls83);
        add(lbls84);
        add(lbls85);
        add(lbls86);
        add(lbls87);
        add(lbls88);
        add(lbls89);
        add(lbls90);
        add(lbls91);
        add(lbls92);
        add(lbls93);
        add(lbls94);
        add(lbls95);
        add(lbls96);
        add(lbls97);
        add(lbls98);
        add(lbls99);
        add(lbls100);

        add(lblplayer1);
        add(lblplayer2);

        add(lbldice);
        add(lbldice1);
        add(lbldice2);
        add(lbldice3);
        add(lbldice4);
        add(lbldice5);
        add(lbldice6);

        add(progstart2);

        add(lblname);

        add(lblborder1);
        add(lblborder2);
        add(lblborder3);
        add(lblborder4);

        lblp.setVisible(false);
        lbll.setVisible(false);
        lbla.setVisible(false);
        lbly.setVisible(false);
        lble.setVisible(false);
        lblr.setVisible(false);
        lblnull.setVisible(false);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lblw.setVisible(false);
        lbli.setVisible(false);
        lbln.setVisible(false);
        lbls.setVisible(false);

        //SET fONTSS
        Font f1 = new Font("arial", 1, 24);
        lblstarttop.setFont(f1);

        Font f3 = new Font("arial", 1, 13);
        lblstartbottom.setFont(f3);

        Font f2 = new Font("arial", 1, 14);
        btnstart.setFont(f2);

        Font f4 = new Font("Segoe Print", 1, 20);
        lblplayer1.setFont(f4);
        lblplayer2.setFont(f4);

        Font f5 = new Font("Segoe Print", 0, 16);
        lblname.setFont(f5);

        //SET VISIBILITY
        progstartl.setVisible(true);

        lbls1.setVisible(false);
        lbls2.setVisible(false);
        lbls3.setVisible(false);
        lbls4.setVisible(false);
        lbls5.setVisible(false);
        lbls6.setVisible(false);
        lbls7.setVisible(false);
        lbls8.setVisible(false);
        lbls9.setVisible(false);
        lbls10.setVisible(false);
        lbls11.setVisible(false);
        lbls12.setVisible(false);
        lbls13.setVisible(false);
        lbls14.setVisible(false);
        lbls15.setVisible(false);
        lbls16.setVisible(false);
        lbls17.setVisible(false);
        lbls18.setVisible(false);
        lbls19.setVisible(false);
        lbls20.setVisible(false);
        lbls21.setVisible(false);
        lbls22.setVisible(false);
        lbls23.setVisible(false);
        lbls24.setVisible(false);
        lbls25.setVisible(false);
        lbls26.setVisible(false);
        lbls27.setVisible(false);
        lbls28.setVisible(false);
        lbls29.setVisible(false);
        lbls30.setVisible(false);
        lbls31.setVisible(false);
        lbls32.setVisible(false);
        lbls33.setVisible(false);
        lbls34.setVisible(false);
        lbls35.setVisible(false);
        lbls36.setVisible(false);
        lbls37.setVisible(false);
        lbls38.setVisible(false);
        lbls39.setVisible(false);
        lbls40.setVisible(false);
        lbls41.setVisible(false);
        lbls42.setVisible(false);
        lbls43.setVisible(false);
        lbls44.setVisible(false);
        lbls45.setVisible(false);
        lbls46.setVisible(false);
        lbls47.setVisible(false);
        lbls48.setVisible(false);
        lbls49.setVisible(false);
        lbls50.setVisible(false);
        lbls51.setVisible(false);
        lbls52.setVisible(false);
        lbls53.setVisible(false);
        lbls54.setVisible(false);
        lbls55.setVisible(false);
        lbls56.setVisible(false);
        lbls57.setVisible(false);
        lbls58.setVisible(false);
        lbls59.setVisible(false);
        lbls60.setVisible(false);
        lbls61.setVisible(false);
        lbls62.setVisible(false);
        lbls63.setVisible(false);
        lbls64.setVisible(false);
        lbls65.setVisible(false);
        lbls66.setVisible(false);
        lbls67.setVisible(false);
        lbls68.setVisible(false);
        lbls69.setVisible(false);
        lbls70.setVisible(false);
        lbls71.setVisible(false);
        lbls72.setVisible(false);
        lbls73.setVisible(false);
        lbls74.setVisible(false);
        lbls75.setVisible(false);
        lbls76.setVisible(false);
        lbls77.setVisible(false);
        lbls78.setVisible(false);
        lbls79.setVisible(false);
        lbls80.setVisible(false);
        lbls81.setVisible(false);
        lbls82.setVisible(false);
        lbls83.setVisible(false);
        lbls84.setVisible(false);
        lbls85.setVisible(false);
        lbls86.setVisible(false);
        lbls87.setVisible(false);
        lbls88.setVisible(false);
        lbls89.setVisible(false);
        lbls90.setVisible(false);
        lbls91.setVisible(false);
        lbls92.setVisible(false);
        lbls93.setVisible(false);
        lbls94.setVisible(false);
        lbls95.setVisible(false);
        lbls96.setVisible(false);
        lbls97.setVisible(false);
        lbls98.setVisible(false);
        lbls99.setVisible(false);
        lbls100.setVisible(false);
        lblsblue.setVisible(false);
        lblsred.setVisible(false);
        lblplayer1.setVisible(false);
        lblplayer2.setVisible(false);
        lbldice.setVisible(false);
        lbldice1.setVisible(false);
        lbldice2.setVisible(false);
        lbldice3.setVisible(false);
        lbldice4.setVisible(false);
        lbldice5.setVisible(false);
        lbldice6.setVisible(false);
        progstart2.setVisible(false);

        lblborder1.setVisible(false);
        lblborder2.setVisible(false);
        lblborder3.setVisible(false);
        lblborder4.setVisible(false);

        lblname.setVisible(false);
        btnstart.addActionListener(this);
        lblplayer1.addActionListener(this);
        lblplayer2.addActionListener(this);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int i, j, dice;
        dice = (int) ((Math.random() * 6) + 1);
        if (e.getSource() == btnstart) {
            try {
                for (i = 0; i <= 100; i++) {
                    Thread.sleep(500);
                    i = i + 6;
                    progstartl.setValue(i);
                    Rectangle progRect = progstartl.getBounds();
                    progRect.x = 0;
                    progRect.y = 0;
                    progstartl.paintImmediately(progRect);
                }
                if (i == 100);
                {
                    setSize(850, 700);
                    setBackground(new Color(106, 12, 23));
                    lbls1.setVisible(true);
                    lblstart.setVisible(false);
                    lblstarttop.setVisible(false);
                    btnstart.setVisible(false);
                    progstartl.setVisible(false);
                    lblstartbottom.setVisible(false);
                    lblstartbottomlogo.setVisible(false);
                    lbls1.setVisible(true);
                    lbls2.setVisible(true);
                    lbls3.setVisible(true);
                    lbls4.setVisible(true);
                    lbls5.setVisible(true);
                    lbls6.setVisible(true);
                    lbls7.setVisible(true);
                    lbls8.setVisible(true);
                    lbls9.setVisible(true);
                    lbls10.setVisible(true);
                    lbls11.setVisible(true);
                    lbls12.setVisible(true);
                    lbls13.setVisible(true);
                    lbls14.setVisible(true);
                    lbls15.setVisible(true);
                    lbls16.setVisible(true);
                    lbls17.setVisible(true);
                    lbls18.setVisible(true);
                    lbls19.setVisible(true);
                    lbls20.setVisible(true);
                    lbls21.setVisible(true);
                    lbls22.setVisible(true);
                    lbls23.setVisible(true);
                    lbls24.setVisible(true);
                    lbls25.setVisible(true);
                    lbls26.setVisible(true);
                    lbls27.setVisible(true);
                    lbls28.setVisible(true);
                    lbls29.setVisible(true);
                    lbls30.setVisible(true);
                    lbls31.setVisible(true);
                    lbls32.setVisible(true);
                    lbls33.setVisible(true);
                    lbls34.setVisible(true);
                    lbls35.setVisible(true);
                    lbls36.setVisible(true);
                    lbls37.setVisible(true);
                    lbls38.setVisible(true);
                    lbls39.setVisible(true);
                    lbls40.setVisible(true);
                    lbls41.setVisible(true);
                    lbls42.setVisible(true);
                    lbls43.setVisible(true);
                    lbls44.setVisible(true);
                    lbls45.setVisible(true);
                    lbls46.setVisible(true);
                    lbls47.setVisible(true);
                    lbls48.setVisible(true);
                    lbls49.setVisible(true);
                    lbls50.setVisible(true);
                    lbls51.setVisible(true);
                    lbls52.setVisible(true);
                    lbls53.setVisible(true);
                    lbls54.setVisible(true);
                    lbls55.setVisible(true);
                    lbls56.setVisible(true);
                    lbls57.setVisible(true);
                    lbls58.setVisible(true);
                    lbls59.setVisible(true);
                    lbls60.setVisible(true);
                    lbls61.setVisible(true);
                    lbls62.setVisible(true);
                    lbls63.setVisible(true);
                    lbls64.setVisible(true);
                    lbls65.setVisible(true);
                    lbls66.setVisible(true);
                    lbls67.setVisible(true);
                    lbls68.setVisible(true);
                    lbls69.setVisible(true);
                    lbls70.setVisible(true);
                    lbls71.setVisible(true);
                    lbls72.setVisible(true);
                    lbls73.setVisible(true);
                    lbls74.setVisible(true);
                    lbls75.setVisible(true);
                    lbls76.setVisible(true);
                    lbls77.setVisible(true);
                    lbls78.setVisible(true);
                    lbls79.setVisible(true);
                    lbls80.setVisible(true);
                    lbls81.setVisible(true);
                    lbls82.setVisible(true);
                    lbls83.setVisible(true);
                    lbls84.setVisible(true);
                    lbls85.setVisible(true);
                    lbls86.setVisible(true);
                    lbls87.setVisible(true);
                    lbls88.setVisible(true);
                    lbls89.setVisible(true);
                    lbls90.setVisible(true);
                    lbls91.setVisible(true);
                    lbls92.setVisible(true);
                    lbls93.setVisible(true);
                    lbls94.setVisible(true);
                    lbls95.setVisible(true);
                    lbls96.setVisible(true);
                    lbls97.setVisible(true);
                    lbls98.setVisible(true);
                    lbls99.setVisible(true);
                    lbls100.setVisible(true);

                    lblplayer1.setVisible(true);
                    lblplayer2.setVisible(true);

                    lblsred.setVisible(true);
                    lblsblue.setVisible(true);
                    lbldice.setVisible(true);

                    lblborder1.setVisible(true);
                    lblborder2.setVisible(true);
                    lblborder3.setVisible(true);
                    lblborder4.setVisible(true);

                    lblname.setVisible(true);
                }
            } catch (InterruptedException in) {
                Thread.currentThread().interrupt();
            }
        }

        if (e.getSource() == lblplayer1) {

            try {

                lblname.setText("");
                lblname.setForeground(new Color(207, 30, 47));

                for (i = 0; i <= 18; i++) {
                    progstart2.setVisible(true);
                    Thread.sleep(10);

                    progstart2.setValue(i);
                    Rectangle progRect = progstart2.getBounds();
                    progRect.x = 0;
                    progRect.y = 0;
                    progstart2.paintImmediately(progRect);

                }
                if (i == 18);
                {

                    progstart2.setVisible(false);

                    if (dice == 1) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(true);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);
                        lblplayer1.setEnabled(false);
                        lblplayer2.setEnabled(true);
                        lblname.setText(" Now Player2 Turns..!");
                    } else if (dice == 2) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(true);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);
                        lblplayer1.setEnabled(false);
                        lblplayer2.setEnabled(true);
                        lblname.setText(" Now Player2 Turns..!");
                    } else if (dice == 3) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(true);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);
                        lblplayer1.setEnabled(false);
                        lblplayer2.setEnabled(true);
                        lblname.setText(" Now Player2 Turns..!");
                    } else if (dice == 4) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(true);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);
                        lblplayer1.setEnabled(false);
                        lblplayer2.setEnabled(true);
                        lblname.setText(" Now Player2 Turns..!");
                    } else if (dice == 5) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(true);
                        lbldice6.setVisible(false);
                        lblplayer1.setEnabled(false);
                        lblplayer2.setEnabled(true);
                        lblname.setText(" Now Player2 Turns..!");
                    } else if (dice == 6) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(true);
                        lblplayer2.setEnabled(false);
                        lblname.setText(" Now Player1 Turns..!");
                    }
                    moveplayer1 = moveplayer1 + dice;

                    if (moveplayer1 == 1) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(65, 555, 20, 20);
                    } else if (moveplayer1 == 2) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(165, 455, 20, 20);
                    } else if (moveplayer1 == 3) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(165, 555, 20, 20);
                    } else if (moveplayer1 == 4) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(215, 555, 20, 20);
                    } else if (moveplayer1 == 5) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(265, 555, 20, 20);
                    } else if (moveplayer1 == 6) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 45;
                        lblsblue.setBounds(265, 355, 20, 20);
                    } else if (moveplayer1 == 7) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(365, 555, 20, 20);
                    } else if (moveplayer1 == 8) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 555, 20, 20);
                    } else if (moveplayer1 == 9) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(465, 555, 20, 20);
                    } else if (moveplayer1 == 10) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(515, 555, 20, 20);
                    } else if (moveplayer1 == 11) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(515, 505, 20, 20);
                    } else if (moveplayer1 == 12) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(465, 505, 20, 20);
                    } else if (moveplayer1 == 13) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 505, 20, 20);
                    } else if (moveplayer1 == 14) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(365, 505, 20, 20);
                    } else if (moveplayer1 == 15) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(315, 505, 20, 20);
                    } else if (moveplayer1 == 16) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(265, 505, 20, 20);
                    } else if (moveplayer1 == 17) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(215, 505, 20, 20);
                    } else if (moveplayer1 == 18) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(165, 505, 20, 20);
                    } else if (moveplayer1 == 19) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(115, 505, 20, 20);
                    } else if (moveplayer1 == 20) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 59;
                        lblsblue.setBounds(115, 305, 20, 20);
                    } else if (moveplayer1 == 21) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(65, 455, 20, 20);
                    } else if (moveplayer1 == 22) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(115, 455, 20, 20);
                    } else if (moveplayer1 == 23) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(165, 455, 20, 20);
                    } else if (moveplayer1 == 24) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(215, 455, 20, 20);
                    } else if (moveplayer1 == 25) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(265, 455, 20, 20);
                    } else if (moveplayer1 == 26) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(315, 455, 20, 20);
                    } else if (moveplayer1 == 27) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(365, 455, 20, 20);
                    } else if (moveplayer1 == 28) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 455, 20, 20);
                    } else if (moveplayer1 == 29) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(465, 455, 20, 20);
                    } else if (moveplayer1 == 30) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 16;
                        lblsblue.setBounds(265, 555, 20, 20);
                    } else if (moveplayer1 == 31) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(515, 405, 20, 20);
                    } else if (moveplayer1 == 32) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(465, 405, 20, 20);
                    } else if (moveplayer1 == 33) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 405, 20, 20);
                    } else if (moveplayer1 == 34) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(365, 405, 20, 20);
                    } else if (moveplayer1 == 35) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(315, 405, 20, 20);
                    } else if (moveplayer1 == 36) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(265, 405, 20, 20);
                    } else if (moveplayer1 == 37) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 3;
                        lblsblue.setBounds(165, 555, 20, 20);
                    } else if (moveplayer1 == 38) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(165, 405, 20, 20);
                    } else if (moveplayer1 == 39) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(115, 405, 20, 20);
                    } else if (moveplayer1 == 40) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(65, 405, 20, 20);
                    } else if (moveplayer1 == 41) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(65, 355, 20, 20);
                    } else if (moveplayer1 == 42) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(155, 355, 20, 20);
                    } else if (moveplayer1 == 43) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(165, 355, 20, 20);
                    } else if (moveplayer1 == 44) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(215, 355, 20, 20);
                    } else if (moveplayer1 == 45) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(265, 355, 20, 20);
                    } else if (moveplayer1 == 46) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(315, 355, 20, 20);
                    } else if (moveplayer1 == 47) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(365, 355, 20, 20);
                    } else if (moveplayer1 == 48) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 355, 20, 20);
                    } else if (moveplayer1 == 49) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(465, 355, 20, 20);
                    } else if (moveplayer1 == 50) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(515, 355, 20, 20);
                    } else if (moveplayer1 == 51) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(515, 305, 20, 20);
                    } else if (moveplayer1 == 52) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 72;
                        lblsblue.setBounds(465, 205, 20, 20);
                    } else if (moveplayer1 == 53) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 305, 20, 20);
                    } else if (moveplayer1 == 54) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(365, 305, 20, 20);
                    } else if (moveplayer1 == 55) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(315, 305, 20, 20);
                    } else if (moveplayer1 == 56) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 8;
                        lblsblue.setBounds(415, 555, 20, 20);
                    } else if (moveplayer1 == 57) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 96;
                        lblsblue.setBounds(265, 105, 20, 20);
                    } else if (moveplayer1 == 58) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(165, 305, 20, 20);
                    } else if (moveplayer1 == 59) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(115, 305, 20, 20);
                    } else if (moveplayer1 == 60) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(65, 305, 20, 20);
                    } else if (moveplayer1 == 61) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(65, 255, 20, 20);
                    } else if (moveplayer1 == 62) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(115, 255, 20, 20);
                    } else if (moveplayer1 == 63) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(165, 255, 20, 20);
                    } else if (moveplayer1 == 64) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(215, 255, 20, 20);
                    } else if (moveplayer1 == 65) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(265, 255, 20, 20);
                    } else if (moveplayer1 == 66) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(315, 255, 20, 20);
                    } else if (moveplayer1 == 67) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(365, 255, 20, 20);
                    } else if (moveplayer1 == 68) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 255, 20, 20);
                    } else if (moveplayer1 == 69) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(465, 255, 20, 20);
                    } else if (moveplayer1 == 70) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(515, 255, 20, 20);
                    } else if (moveplayer1 == 71) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(515, 205, 20, 20);
                    } else if (moveplayer1 == 72) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(465, 205, 20, 20);
                    } else if (moveplayer1 == 73) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 205, 20, 20);
                    } else if (moveplayer1 == 74) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 94;
                        lblsblue.setBounds(365, 105, 20, 20);
                    } else if (moveplayer1 == 75) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(315, 205, 20, 20);
                    } else if (moveplayer1 == 76) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(265, 205, 20, 20);
                    } else if (moveplayer1 == 77) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(215, 205, 20, 20);
                    } else if (moveplayer1 == 78) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 98;
                        lblsblue.setBounds(165, 105, 20, 20);
                    } else if (moveplayer1 == 79) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 29;
                        lblsblue.setBounds(115, 205, 20, 20);
                    } else if (moveplayer1 == 80) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(65, 205, 20, 20);
                    } else if (moveplayer1 == 81) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(65, 155, 20, 20);
                    } else if (moveplayer1 == 82) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(115, 155, 20, 20);
                    } else if (moveplayer1 == 83) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(165, 155, 20, 20);
                    } else if (moveplayer1 == 84) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 64;
                        lblsblue.setBounds(215, 255, 20, 20);
                    } else if (moveplayer1 == 85) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(265, 155, 20, 20);
                    } else if (moveplayer1 == 86) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(315, 155, 20, 20);
                    } else if (moveplayer1 == 87) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 31;
                        lblsblue.setBounds(515, 405, 20, 20);
                    } else if (moveplayer1 == 88) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 155, 20, 20);
                    } else if (moveplayer1 == 89) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(465, 155, 20, 20);
                    } else if (moveplayer1 == 90) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(515, 155, 20, 20);
                    } else if (moveplayer1 == 91) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(515, 105, 20, 20);
                    } else if (moveplayer1 == 92) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(465, 105, 20, 20);
                    } else if (moveplayer1 == 93) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(415, 105, 20, 20);
                    } else if (moveplayer1 == 94) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(365, 105, 20, 20);
                    } else if (moveplayer1 == 95) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(315, 105, 20, 20);
                    } else if (moveplayer1 == 96) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(265, 105, 20, 20);
                    } else if (moveplayer1 == 97) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(215, 105, 20, 20);
                    } else if (moveplayer1 == 98) {
                        lblsblue.setVisible(true);
                        moveplayer1 = 41;
                        lblsblue.setBounds(65, 355, 20, 20);
                    } else if (moveplayer1 == 99) {
                        lblsblue.setVisible(true);

                        lblsblue.setBounds(115, 105, 20, 20);
                    } else if (moveplayer1 == 100) {

                        lblsblue.setVisible(false);

                        lblp.setVisible(true);
                        lbll.setVisible(true);
                        lbla.setVisible(true);
                        lbly.setVisible(true);
                        lble.setVisible(true);
                        lblr.setVisible(true);
                        lblnull.setVisible(true);
                        lbl1.setVisible(true);
                        lbl2.setVisible(true);
                        lblw.setVisible(true);
                        lbli.setVisible(true);
                        lbln.setVisible(true);
                        lbls.setVisible(true);

                        lbls59.setVisible(false);
                        lbls58.setVisible(false);
                        lbls57.setVisible(false);
                        lbls56.setVisible(false);
                        lbls55.setVisible(false);
                        lbls54.setVisible(false);
                        lbls53.setVisible(false);
                        lbls52.setVisible(false);
                        lbls44.setVisible(false);
                        lbls45.setVisible(false);
                        lbls46.setVisible(false);
                        lbls47.setVisible(false);

                        lblsblue.setBounds(65, 105, 20, 20);

                        lblp.setOpaque(true);
                        lbll.setOpaque(true);
                        lbla.setOpaque(true);
                        lbly.setOpaque(true);
                        lble.setOpaque(true);
                        lblr.setOpaque(true);
                        lblnull.setOpaque(true);
                        lbl1.setOpaque(true);
                        lblw.setOpaque(true);
                        lbli.setOpaque(true);
                        lbln.setOpaque(true);
                        lbls.setOpaque(true);

                        lblp.setText("   P");
                        lblp.setFont(new Font("segoe UI", 1, 24));
                        lblp.setBackground(new Color(0, 0, 0));
                        lblp.setForeground(new Color(255, 255, 255));
                        lblp.setBounds(110, 300, 50, 53);
                        lbll.setText("   L");
                        lbll.setFont(new Font("segoe UI", 1, 24));
                        lbll.setBackground(new Color(0, 0, 0));
                        lbll.setForeground(new Color(255, 255, 255));
                        lbll.setBounds(160, 300, 50, 53);
                        lbla.setText("   A");
                        lbla.setFont(new Font("segoe UI", 1, 24));
                        lbla.setBackground(new Color(0, 0, 0));
                        lbla.setForeground(new Color(255, 255, 255));
                        lbla.setBounds(210, 300, 50, 53);
                        lbly.setText("   Y");
                        lbly.setFont(new Font("segoe UI", 1, 24));
                        lbly.setBackground(new Color(0, 0, 0));
                        lbly.setForeground(new Color(255, 255, 255));
                        lbly.setBounds(260, 300, 50, 53);
                        lble.setText("  E");
                        lble.setFont(new Font("segoe UI", 1, 24));
                        lble.setBackground(new Color(0, 0, 0));
                        lble.setForeground(new Color(255, 255, 255));
                        lble.setBounds(310, 300, 50, 53);
                        lblr.setText("   R");
                        lblr.setFont(new Font("segoe UI", 1, 24));
                        lblr.setBackground(new Color(0, 0, 0));
                        lblr.setForeground(new Color(255, 255, 255));
                        lblr.setBounds(360, 300, 50, 53);
                        lblnull.setText("");
                        lblnull.setFont(new Font("segoe UI", 1, 24));
                        lblnull.setBackground(new Color(0, 0, 0));
                        lblnull.setForeground(new Color(255, 255, 255));
                        lblnull.setBounds(410, 300, 50, 53);
                        lbl1.setText("   1");
                        lbl1.setFont(new Font("segoe UI", 1, 24));
                        lbl1.setBackground(new Color(0, 0, 0));
                        lbll.setForeground(new Color(255, 255, 255));
                        lbl1.setBounds(460, 300, 50, 53);
                        lblw.setText("   W");
                        lblw.setFont(new Font("segoe UI", 1, 24));
                        lblw.setBackground(new Color(0, 0, 0));
                        lblw.setForeground(new Color(255, 255, 255));
                        lblw.setBounds(210, 350, 50, 53);
                        lbli.setText("   I");
                        lbli.setFont(new Font("segoe UI", 1, 24));
                        lbli.setBackground(new Color(0, 0, 0));
                        lbli.setForeground(new Color(255, 255, 255));
                        lbli.setBounds(260, 350, 50, 53);
                        lbln.setText("    N");
                        lbln.setFont(new Font("segoe UI", 1, 24));
                        lbln.setBackground(new Color(0, 0, 0));
                        lbln.setForeground(new Color(255, 255, 255));
                        lbln.setBounds(310, 350, 50, 53);
                        lbls.setText("   S");
                        lbls.setFont(new Font("segoe UI", 1, 24));
                        lbls.setBackground(new Color(0, 0, 0));
                        lbls.setForeground(new Color(255, 255, 255));
                        lbls.setBounds(360, 350, 50, 53);
                        lblsblue.setVisible(false);
                        JOptionPane.showMessageDialog(null, "New Game");
                        lblsblue.setVisible(true);
                        moveplayer1 = 0;
                        moveplayer2 = 0;
                        lblplayer1.setEnabled(true);
                        lblplayer2.setEnabled(true);
                        lblsblue.setBounds(30, 555, 20, 20);
                        lblsred.setBounds(30, 580, 20, 20);

                        lbldice.setVisible(true);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);

                        lblp.setVisible(false);
                        lbll.setVisible(false);
                        lbla.setVisible(false);
                        lbly.setVisible(false);
                        lble.setVisible(false);
                        lblr.setVisible(false);
                        lblnull.setVisible(false);
                        lbl1.setVisible(false);
                        lbl2.setVisible(false);
                        lblw.setVisible(false);
                        lbli.setVisible(false);
                        lbln.setVisible(false);
                        lbls.setVisible(false);

                        lbls59.setVisible(true);
                        lbls58.setVisible(true);
                        lbls57.setVisible(true);
                        lbls56.setVisible(true);
                        lbls55.setVisible(true);
                        lbls54.setVisible(true);
                        lbls53.setVisible(true);
                        lbls52.setVisible(true);
                        lbls44.setVisible(true);
                        lbls45.setVisible(true);
                        lbls46.setVisible(true);
                        lbls47.setVisible(true);

                    } else if (moveplayer1 != 100) {
                        moveplayer1 = moveplayer1 - dice;
                        lblsblue.setVisible(true);

                    }

                }
            } catch (InterruptedException in) {
                Thread.currentThread().interrupt();
            }
        } else if (e.getSource() == lblplayer2) {

            try {
                lblname.setText("");
                lblname.setForeground(new Color(11, 55, 183));

                for (i = 0; i <= 50; i++) {
                    progstart2.setVisible(true);
                    lbldice.setVisible(true);
                    Thread.sleep(10);
                    i = i + 6;
                    progstart2.setValue(i);
                    Rectangle progRect = progstart2.getBounds();
                    progRect.x = 0;
                    progRect.y = 0;
                    progstart2.paintImmediately(progRect);
                }
                if (i == 50);
                {
                    progstart2.setVisible(false);

                    dice = (int) ((Math.random() * 6) + 1);
                    if (dice == 1) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(true);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);
                        lblplayer2.setEnabled(false);
                        lblplayer1.setEnabled(true);
                        lblname.setText(" Now Player1 Turns..!");
                    } else if (dice == 2) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(true);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);
                        lblplayer2.setEnabled(false);
                        lblplayer1.setEnabled(true);
                        lblname.setText(" Now Player1 Turns..!");
                    } else if (dice == 3) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(true);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);
                        lblplayer2.setEnabled(false);
                        lblplayer1.setEnabled(true);
                        lblname.setText(" Now Player1 Turns..!");
                    } else if (dice == 4) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(true);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);
                        lblplayer2.setEnabled(false);
                        lblplayer1.setEnabled(true);
                        lblname.setText(" Now Player1 Turns..!");
                    } else if (dice == 5) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(true);
                        lbldice6.setVisible(false);
                        lblplayer2.setEnabled(false);
                        lblplayer1.setEnabled(true);
                        lblname.setText(" Now Player1 Turns..!");
                    } else if (dice == 6) {
                        lbldice.setVisible(false);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(true);
                        lblplayer1.setEnabled(false);
                        lblname.setText(" Now Player2 Turns..!");
                    }
                    moveplayer2 = moveplayer2 + dice;

                    if (moveplayer2 == 1) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(65, 575, 20, 20);
                    } else if (moveplayer2 == 2) {
                        lblsred.setVisible(true);
                        moveplayer2 = 23;
                        Thread.sleep(100);
                        lblsred.setBounds(115, 455, 20, 20);

                    } else if (moveplayer2 == 3) {

                        lblsred.setVisible(true);

                        Thread.sleep(100);
                        lblsred.setBounds(165, 575, 20, 20);

                    } else if (moveplayer2 == 4) {
                        lblsred.setVisible(true);

                        Thread.sleep(100);
                        lblsred.setBounds(215, 575, 20, 20);

                    } else if (moveplayer2 == 5) {
                        lblsred.setVisible(true);

                        Thread.sleep(100);
                        lblsred.setBounds(265, 555, 20, 20);
                    } else if (moveplayer2 == 6) {
                        lblsred.setVisible(true);
                        moveplayer2 = 45;
                        Thread.sleep(100);
                        lblsred.setBounds(315, 555, 20, 20);
                    } else if (moveplayer2 == 7) {
                        lblsred.setVisible(true);

                        Thread.sleep(100);
                        lblsred.setBounds(365, 575, 20, 20);
                    } else if (moveplayer2 == 8) {
                        lblsred.setVisible(true);

                        Thread.sleep(100);
                        lblsred.setBounds(415, 555, 20, 20);
                    } else if (moveplayer2 == 9) {
                        lblsred.setVisible(true);

                        Thread.sleep(100);
                        lblsred.setBounds(465, 575, 20, 20);
                    } else if (moveplayer2 == 10) {
                        lblsred.setVisible(true);

                        Thread.sleep(100);
                        lblsred.setBounds(515, 575, 20, 20);
                    } else if (moveplayer2 == 11) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(515, 525, 20, 20);
                    } else if (moveplayer2 == 12) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(465, 525, 20, 20);
                    } else if (moveplayer2 == 13) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(415, 525, 20, 20);
                    } else if (moveplayer2 == 14) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(365, 525, 20, 20);
                    } else if (moveplayer2 == 15) {
                        lblsred.setVisible(true);

                        Thread.sleep(100);
                        lblsred.setBounds(315, 505, 20, 20);
                    } else if (moveplayer2 == 16) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(265, 525, 20, 20);
                    } else if (moveplayer2 == 17) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(215, 525, 20, 20);
                    } else if (moveplayer2 == 18) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(165, 525, 20, 20);
                    } else if (moveplayer2 == 19) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(115, 525, 20, 20);
                    } else if (moveplayer2 == 20) {
                        lblsred.setVisible(true);
                        moveplayer2 = 59;
                        Thread.sleep(100);
                        lblsred.setBounds(115, 305, 20, 20);
                    } else if (moveplayer2 == 21) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(65, 475, 20, 20);
                    } else if (moveplayer2 == 22) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(115, 475, 20, 20);
                    } else if (moveplayer2 == 23) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(165, 475, 20, 20);
                    } else if (moveplayer2 == 24) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(215, 455, 20, 20);
                    } else if (moveplayer2 == 25) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(265, 475, 20, 20);
                    } else if (moveplayer2 == 26) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(315, 475, 20, 20);
                    } else if (moveplayer2 == 27) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(365, 475, 20, 20);
                    } else if (moveplayer2 == 28) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(415, 475, 20, 20);
                    } else if (moveplayer2 == 29) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(465, 475, 20, 20);
                    } else if (moveplayer2 == 30) {
                        lblsred.setVisible(true);
                        moveplayer2 = 16;
                        Thread.sleep(100);
                        lblsred.setBounds(265, 505, 20, 20);
                    } else if (moveplayer2 == 31) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(515, 425, 20, 20);
                    } else if (moveplayer2 == 32) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(465, 425, 20, 20);
                    } else if (moveplayer2 == 33) {
                        lblsred.setVisible(true);
                        Thread.sleep(100);
                        lblsred.setBounds(415, 425, 20, 20);
                    } else if (moveplayer2 == 34) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(365, 425, 20, 20);
                    } else if (moveplayer2 == 35) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(315, 425, 20, 20);
                    } else if (moveplayer2 == 36) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(265, 425, 20, 20);
                    } else if (moveplayer2 == 37) {
                        lblsred.setVisible(true);
                        moveplayer2 = 3;
                        lblsred.setBounds(165, 555, 20, 20);
                    } else if (moveplayer2 == 38) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(165, 425, 20, 20);
                    } else if (moveplayer2 == 39) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(115, 425, 20, 20);
                    } else if (moveplayer2 == 40) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(65, 425, 20, 20);
                    } // CHANGED APPLIED FROM 40
                    else if (moveplayer2 == 41) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(65, 375, 20, 20);
                    } else if (moveplayer2 == 42) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(115, 355, 20, 20);
                    } else if (moveplayer2 == 43) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(165, 375, 20, 20);
                    } else if (moveplayer2 == 44) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(215, 375, 20, 20);
                    } else if (moveplayer2 == 45) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(265, 375, 20, 20);
                    } else if (moveplayer2 == 46) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(315, 375, 20, 20);
                    } else if (moveplayer2 == 47) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(365, 375, 20, 20);
                    } else if (moveplayer2 == 48) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(415, 375, 20, 20);
                    } else if (moveplayer2 == 49) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(465, 375, 20, 20);
                    } else if (moveplayer2 == 50) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(515, 375, 20, 20);
                    } else if (moveplayer2 == 51) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(515, 325, 20, 20);
                    } else if (moveplayer2 == 52) {
                        lblsred.setVisible(true);
                        moveplayer2 = 72;
                        lblsred.setBounds(465, 205, 50, 50);
                    } else if (moveplayer2 == 53) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(415, 325, 20, 20);
                    } else if (moveplayer2 == 54) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(365, 325, 20, 20);
                    } else if (moveplayer2 == 55) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(315, 305, 20, 20);
                    } else if (moveplayer2 == 56) {
                        lblsred.setVisible(true);
                        moveplayer2 = 8;
                        lblsred.setBounds(415, 555, 20, 20);
                    } else if (moveplayer2 == 57) {
                        lblsred.setVisible(true);
                        moveplayer2 = 96;
                        lblsred.setBounds(265, 105, 20, 20);
                    } else if (moveplayer2 == 58) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(165, 325, 20, 20);
                    } else if (moveplayer2 == 59) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(115, 325, 20, 20);
                    } else if (moveplayer2 == 60) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(65, 325, 20, 20);
                    } else if (moveplayer2 == 61) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(65, 275, 20, 20);
                    } else if (moveplayer2 == 62) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(115, 275, 20, 20);
                    } else if (moveplayer2 == 63) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(165, 275, 20, 20);
                    } else if (moveplayer2 == 64) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(215, 275, 20, 20);
                    } else if (moveplayer2 == 65) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(265, 275, 20, 20);
                    } else if (moveplayer2 == 66) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(315, 255, 20, 20);
                    } else if (moveplayer2 == 67) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(365, 275, 20, 20);
                    } else if (moveplayer2 == 68) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(415, 275, 20, 20);
                    } else if (moveplayer2 == 69) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(465, 275, 20, 20);
                    } else if (moveplayer2 == 70) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(515, 275, 20, 20);
                    } else if (moveplayer2 == 71) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(515, 205, 20, 20);
                    } else if (moveplayer2 == 72) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(465, 225, 20, 20);
                    } else if (moveplayer2 == 73) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(415, 225, 20, 20);
                    } else if (moveplayer2 == 74) {
                        lblsred.setVisible(true);
                        moveplayer2 = 94;
                        lblsred.setBounds(365, 105, 20, 20);
                    } else if (moveplayer2 == 75) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(315, 225, 20, 20);
                    } else if (moveplayer2 == 76) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(265, 225, 20, 20);
                    } else if (moveplayer2 == 77) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(215, 225, 20, 20);
                    } else if (moveplayer2 == 78) {
                        lblsred.setVisible(true);
                        moveplayer2 = 98;
                        lblsred.setBounds(165, 105, 20, 20);
                    } else if (moveplayer2 == 79) {
                        lblsred.setVisible(true);
                        moveplayer2 = 29;
                        lblsred.setBounds(115, 225, 20, 20);
                    } else if (moveplayer2 == 80) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(65, 225, 20, 20);
                    } else if (moveplayer2 == 81) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(65, 175, 20, 20);
                    } else if (moveplayer2 == 82) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(115, 175, 20, 20);
                    } else if (moveplayer2 == 83) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(165, 175, 20, 20);
                    } else if (moveplayer2 == 84) {
                        lblsred.setVisible(true);
                        moveplayer2 = 64;
                        lblsred.setBounds(215, 255, 20, 20);
                    } else if (moveplayer2 == 85) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(265, 175, 20, 20);
                    } else if (moveplayer2 == 86) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(315, 175, 20, 20);
                    } else if (moveplayer2 == 87) {
                        lblsred.setVisible(true);
                        moveplayer2 = 31;
                        lblsred.setBounds(515, 405, 20, 20);
                    } else if (moveplayer2 == 88) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(415, 155, 20, 20);
                    } else if (moveplayer2 == 89) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(465, 175, 20, 20);
                    } else if (moveplayer2 == 90) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(515, 175, 20, 20);
                    } else if (moveplayer1 == 91) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(515, 125, 20, 20);
                    } else if (moveplayer2 == 92) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(465, 125, 20, 20);
                    } else if (moveplayer2 == 93) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(415, 125, 20, 20);
                    } else if (moveplayer2 == 94) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(365, 125, 20, 20);
                    } else if (moveplayer2 == 95) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(315, 125, 20, 20);
                    } else if (moveplayer2 == 96) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(265, 125, 20, 20);
                    } else if (moveplayer2 == 97) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(215, 125, 20, 20);
                    } else if (moveplayer2 == 98) {
                        lblsred.setVisible(true);
                        moveplayer2 = 41;
                        lblsred.setBounds(65, 355, 20, 20);
                    } else if (moveplayer2 == 99) {
                        lblsred.setVisible(true);

                        lblsred.setBounds(115, 105, 20, 20);
                    } else if (moveplayer2 == 100) {

                        lblsred.setVisible(false);
                        lblp.setVisible(true);
                        lbll.setVisible(true);
                        lbla.setVisible(true);
                        lbly.setVisible(true);
                        lble.setVisible(true);
                        lblr.setVisible(true);
                        lblnull.setVisible(true);
                        lbl1.setVisible(true);
                        lbl2.setVisible(true);
                        lblw.setVisible(true);
                        lbli.setVisible(true);
                        lbln.setVisible(true);
                        lbls.setVisible(true);

                        lbls59.setVisible(false);
                        lbls58.setVisible(false);
                        lbls57.setVisible(false);
                        lbls56.setVisible(false);
                        lbls55.setVisible(false);
                        lbls54.setVisible(false);
                        lbls53.setVisible(false);
                        lbls52.setVisible(false);
                        lbls44.setVisible(false);
                        lbls45.setVisible(false);
                        lbls46.setVisible(false);
                        lbls47.setVisible(false);

                        lblsred.setBounds(65, 125, 20, 20);

                        lblp.setOpaque(true);
                        lbll.setOpaque(true);
                        lbla.setOpaque(true);
                        lbly.setOpaque(true);
                        lble.setOpaque(true);
                        lblr.setOpaque(true);
                        lblnull.setOpaque(true);
                        lbl2.setOpaque(true);
                        lblw.setOpaque(true);
                        lbli.setOpaque(true);
                        lbln.setOpaque(true);
                        lbls.setOpaque(true);

                        lblp.setText("   P");
                        lblp.setFont(new Font("segoe UI", 1, 24));
                        lblp.setBackground(new Color(0, 0, 0));
                        lblp.setForeground(new Color(255, 255, 255));
                        lblp.setBounds(110, 300, 50, 53);
                        lbll.setText("   L");
                        lbll.setFont(new Font("segoe UI", 1, 24));
                        lbll.setBackground(new Color(0, 0, 0));
                        lbll.setForeground(new Color(255, 255, 255));
                        lbll.setBounds(160, 300, 50, 53);
                        lbla.setText("   A");
                        lbla.setFont(new Font("segoe UI", 1, 24));
                        lbla.setBackground(new Color(0, 0, 0));
                        lbla.setForeground(new Color(255, 255, 255));
                        lbla.setBounds(210, 300, 50, 53);
                        lbly.setText("   Y");
                        lbly.setFont(new Font("segoe UI", 1, 24));
                        lbly.setBackground(new Color(0, 0, 0));
                        lbly.setForeground(new Color(255, 255, 255));
                        lbly.setBounds(260, 300, 50, 53);
                        lble.setText("   E");
                        lble.setFont(new Font("segoe UI", 1, 24));
                        lble.setBackground(new Color(0, 0, 0));
                        lble.setForeground(new Color(255, 255, 255));
                        lble.setBounds(310, 300, 50, 53);
                        lblr.setText("   R");
                        lblr.setFont(new Font("segoe UI", 1, 24));
                        lblr.setBackground(new Color(0, 0, 0));
                        lblr.setForeground(new Color(255, 255, 255));
                        lblr.setBounds(360, 300, 50, 53);

                        lblnull.setText("");
                        lblnull.setFont(new Font("segoe UI", 1, 24));
                        lblnull.setBackground(new Color(0, 0, 0));
                        lblnull.setForeground(new Color(255, 255, 255));
                        lblnull.setBounds(410, 300, 50, 53);

                        lbl2.setText("   2");
                        lbl2.setFont(new Font("segoe UI", 1, 24));
                        lbl2.setBackground(new Color(0, 0, 0));
                        lbl2.setForeground(new Color(255, 255, 255));
                        lbl2.setBounds(460, 300, 50, 53);

                        lblw.setText("   W");
                        lblw.setFont(new Font("segoe UI", 1, 24));
                        lblw.setBackground(new Color(0, 0, 0));
                        lblw.setForeground(new Color(255, 255, 255));
                        lblw.setBounds(210, 350, 50, 53);
                        lbli.setText("   I");
                        lbli.setFont(new Font("segoe UI", 1, 24));
                        lbli.setBackground(new Color(0, 0, 0));
                        lbli.setForeground(new Color(255, 255, 255));
                        lbli.setBounds(260, 350, 50, 53);
                        lbln.setText("   N");
                        lbln.setFont(new Font("segoe UI", 1, 24));
                        lbln.setBackground(new Color(0, 0, 0));
                        lbln.setForeground(new Color(255, 255, 255));
                        lbln.setBounds(310, 350, 50, 53);
                        lbls.setText("   S");
                        lbls.setFont(new Font("segoe UI", 1, 24));

                        lbls.setBackground(new Color(20, 0, 0));
                        lbls.setForeground(new Color(255, 255, 255));
                        lbls.setBounds(360, 350, 50, 53);
                        lblsred.setVisible(false);
                        JOptionPane.showMessageDialog(null, "New Game");
                        lblsred.setVisible(true);
                        moveplayer1 = 0;
                        moveplayer2 = 0;
                        lblplayer1.setEnabled(true);
                        lblplayer2.setEnabled(true);
                        lblsblue.setBounds(30, 555, 20, 20);
                        lblsred.setBounds(30, 580, 20, 20);

                        lbldice.setVisible(true);
                        lbldice1.setVisible(false);
                        lbldice2.setVisible(false);
                        lbldice3.setVisible(false);
                        lbldice4.setVisible(false);
                        lbldice5.setVisible(false);
                        lbldice6.setVisible(false);

                        lblp.setVisible(false);
                        lbll.setVisible(false);
                        lbla.setVisible(false);
                        lbly.setVisible(false);
                        lble.setVisible(false);
                        lblr.setVisible(false);
                        lblnull.setVisible(false);
                        lbl1.setVisible(false);
                        lbl2.setVisible(false);
                        lblw.setVisible(false);
                        lbli.setVisible(false);
                        lbln.setVisible(false);
                        lbls.setVisible(false);

                        lbls59.setVisible(true);
                        lbls58.setVisible(true);
                        lbls57.setVisible(true);
                        lbls56.setVisible(true);
                        lbls55.setVisible(true);
                        lbls54.setVisible(true);
                        lbls53.setVisible(true);
                        lbls52.setVisible(true);
                        lbls44.setVisible(true);
                        lbls45.setVisible(true);
                        lbls46.setVisible(true);
                        lbls47.setVisible(true);

                    } else if (moveplayer2 != 100) {
                        moveplayer2 = moveplayer2 - dice;
                        lblsred.setVisible(true);

                    }

                }
            } catch (InterruptedException in) {
                Thread.currentThread().interrupt();
            }
        }

    }

    public static void main(String[] s) {
        dragon Dragon = new dragon();

    }
}
