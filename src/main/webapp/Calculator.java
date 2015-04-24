import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener
{
   Label result = new Label("Result", Label.CENTER);

   Button add = new Button("Add");

   Button sub = new Button("Sub");

   Button mul = new Button("Mul");

   Button div = new Button("Div");

   TextField n1 = new TextField(5);

   TextField n2 = new TextField(5);

   public void init()
   {
      this.setLayout(new BorderLayout());

      Panel p = new Panel();
      p.add(new Label("Enter Number 1:"));
      p.add(n1);

      p.add(new Label("Enter Number 2:"));
      p.add(n2);

      this.add(p, BorderLayout.CENTER);

      p = new Panel();
      p.add(add);
      p.add(sub);
      p.add(mul);
      p.add(div);

      add.addActionListener(this);
      sub.addActionListener(this);
      mul.addActionListener(this);
      div.addActionListener(this);

      this.add(p, BorderLayout.SOUTH);

      this.add(result, BorderLayout.NORTH);
   }

   public void actionPerformed(ActionEvent e)
   {
      String cmd = e.getActionCommand();
      result.setText(cmd);
      Double res = 0.0;
      if (n1.getText() != null && n2.getText() != null && !n1.getText().equals("") && !n2.getText().equals(""))
      {
         if (cmd.equals("Add"))
         {
            res = Integer.parseInt(n1.getText()) + Double.parseDouble(n2.getText());
         }
         else if (cmd.equals("Sub"))
         {
            res = Integer.parseInt(n1.getText()) - Double.parseDouble(n2.getText());
         }
         else if (cmd.equals("Mul"))
         {
            res = Integer.parseInt(n1.getText()) * Double.parseDouble(n2.getText());
         }
         else if (cmd.equals("Div"))
         {
            if (Integer.parseInt(n2.getText()) != 0)
            {
               res = Double.parseDouble(n1.getText()) / Double.parseDouble(n2.getText());
            }
         }

         result.setText(String.valueOf(res));

      }
   }

}