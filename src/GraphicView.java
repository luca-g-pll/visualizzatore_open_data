import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GraphicView extends JFrame {

    private JFrame fr1 = new JFrame();
    private JFrame fr2 = new JFrame();

    private JRadioButton[] jRadioFr1 = new JRadioButton[50];
    private JList<String> listPezzi;

    private String[] s1;
    private ArrayList<Pezzo> arrayListPezzo;
    private ArrayList<String> s2 = new ArrayList<String>();
    private ButtonGroup bg;


    private void createJRadio(){
        this.bg = new ButtonGroup();

        for(int i = 0; i< jRadioFr1.length; i++) {
            this.jRadioFr1[i] = new JRadioButton(this.arrayListPezzo.get(i).getInventario());
            this.bg.add(this.jRadioFr1[i]);//per rendere selezionabile un solo elemento
            this.jRadioFr1[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    returnInformation();
                }
            });
            this.fr1.add(this.jRadioFr1[i]);





        }
    }

    private void returnInformation(){
        int valoreSelezionato = -1;
        for(int i = 0; i< jRadioFr1.length; i++) {
            valoreSelezionato = (jRadioFr1[i].isSelected() ? i : valoreSelezionato); //operazione ternaria di if


            if (this.s1[i].contains(this.jRadioFr1[valoreSelezionato].getText())){
                this.s2.add(this.s1[i]);
                DefaultListModel<String> listModel = new DefaultListModel<String>();

                for(int e  = 0; e < this.s2.size(); e++ ){
                    listModel.addElement(this.s2.get(e));
                }
                this.listPezzi = listModel;
            }

        }




    }




    private void settingsFrame1(){
        //setting frame

        fr1.setTitle("Visualizzazione identificativi pezzi");
        fr1.setSize(500,650);
        fr1.setResizable(false);
        fr1.setLayout(new GridLayout(10,5, 2, 2));
        fr1.setLocation(250,100);



        //termina programma se chiudi schermata
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void settingsFrame2(){
        //setting frame

        fr2.setTitle("Visualizzazione dati del pezzo specifico");
        fr2.setSize(500,650);
        fr2.setResizable(false);
        fr2.setVisible(true);
        fr2.setLayout(null);
        fr2.setLocation(900,100 );

        //termina programma se chiudi schermata
        fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void view(ArrayList arrayList, String[] s){

        this.arrayListPezzo = arrayList;
        this.s1  = s;
        this.settingsFrame1();
        this.settingsFrame2();

        this.createJRadio();
        fr1.setVisible(true);





    }




}
