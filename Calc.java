import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calc extends JFrame {
    /*
      By Rabia Akhtar and Fanny Ma
    */
    double firstnum;
    double secondnum;
    double result;
    String operation;
   
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnclear;
    private JButton btncos;
    private JButton btndel;
    private JButton btndivide;
    private JButton btndot;
    private JButton btne;
    private JButton btnequals;
    private JButton btnln;
    private JButton btnlog;
    private JButton btnminus;
    private JButton btnpi;
    private JButton btnplus;
    private JButton btnplusminus;
    private JButton btnpower;
    private JButton btnroot;
    private JButton btnsin;
    private JButton btntan;
    private JButton btntimes;
    private JTextField txtDisplay;
  
    public Calc() {
	setup();
    }
  
    private void setup(){    

        txtDisplay = new JTextField();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btndot = new JButton();
        btnclear = new JButton();
        btn0 = new JButton();
        btndivide = new JButton();
        btnplus = new JButton();
        btntimes = new JButton();
        btnminus = new JButton();
        btnequals = new JButton();
        btnplusminus = new JButton();
        btntan = new JButton();
        btnsin = new JButton();
        btncos = new JButton();
        btnlog = new JButton();
        btnln = new JButton();
        btne = new JButton();
        btndel = new JButton();
        btnroot = new JButton();
        btnpower = new JButton();
        btnpi = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        txtDisplay.setFont(new Font("BatangChe", 1, 14)); 
        txtDisplay.setHorizontalAlignment(JTextField.RIGHT);
        txtDisplay.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    txtDisplayActionPerformed(evt);
		}
	    });

        btn1.setFont(new Font("BatangChe", 1, 14)); 
        btn1.setText("1");
        btn1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn1ActionPerformed(evt);
		}
	    });

        btn2.setFont(new Font("BatangChe", 1, 14)); 
        btn2.setText("2");
        btn2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn2ActionPerformed(evt);
		}
	    });

        btn3.setFont(new Font("BatangChe", 1, 14)); 
        btn3.setText("3");
        btn3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn3ActionPerformed(evt);
		}
	    });

        btn4.setFont(new Font("BatangChe", 1, 14)); 
        btn4.setText("4");
        btn4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn4ActionPerformed(evt);
		}
	    });

        btn5.setFont(new Font("BatangChe", 1, 14)); 
        btn5.setText("5");
        btn5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn5ActionPerformed(evt);
		}
	    });

        btn6.setFont(new Font("BatangChe", 1, 14)); 
        btn6.setText("6");
        btn6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn6ActionPerformed(evt);
		}
	    });

        btn7.setFont(new Font("BatangChe", 1, 14)); 
        btn7.setText("7");
        btn7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn7ActionPerformed(evt);
		}
	    });

        btn8.setFont(new Font("BatangChe", 1, 14)); 
        btn8.setText("8");
        btn8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn8ActionPerformed(evt);
		}
	    });

        btn9.setFont(new Font("BatangChe", 1, 14)); 
        btn9.setText("9");
        btn9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn9ActionPerformed(evt);
		}
	    });

        btndot.setFont(new Font("BatangChe", 1, 14)); 
        btndot.setText(".");
        btndot.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btndotActionPerformed(evt);
		}
	    });

        btnclear.setFont(new Font("BatangChe", 1, 14)); 
        btnclear.setText("C");
        btnclear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btnclearActionPerformed(evt);
		}
	    });

        btn0.setFont(new Font("BatangChe", 1, 14)); 
        btn0.setText("0");
        btn0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    btn0ActionPerformed(evt);
		}
	    });

        btndivide.setFont(new Font("BatangChe", 1, 14)); 
        btndivide.setText("/");
        btndivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btndivideActionPerformed(evt);
            }
        });

        btnplus.setFont(new Font("BatangChe", 1, 14)); 
        btnplus.setText("+");
        btnplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });

        btntimes.setFont(new Font("BatangChe", 1, 14)); 
        btntimes.setText("*");
        btntimes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btntimesActionPerformed(evt);
            }
        });

        btnminus.setFont(new Font("BatangChe", 1, 14)); 
        btnminus.setText("-");
        btnminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnminusActionPerformed(evt);
            }
        });

        btnequals.setFont(new Font("BatangChe", 1, 14)); 
        btnequals.setText("=");
        btnequals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnequalsActionPerformed(evt);
            }
        });

        btnplusminus.setFont(new Font("BatangChe", 1, 14)); 
        btnplusminus.setText("(-)");
        btnplusminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnplusminusActionPerformed(evt);
            }
        });

        btntan.setFont(new Font("BatangChe", 1, 14)); 
        btntan.setText("Tan");
        btntan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btntanActionPerformed(evt);
            }
        });

        btnsin.setFont(new Font("BatangChe", 1, 14)); 
        btnsin.setText("Sin");
        btnsin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnsinActionPerformed(evt);
            }
        });

        btncos.setFont(new Font("BatangChe", 1, 14)); 
        btncos.setText("Cos");
        btncos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btncosActionPerformed(evt);
            }
        });

        btnlog.setFont(new Font("BatangChe", 1, 14)); 
        btnlog.setText("Log");
        btnlog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });

        btnln.setFont(new Font("BatangChe", 1, 14)); 
        btnln.setText("Ln");
        btnln.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnlnActionPerformed(evt);
            }
        });

        btne.setFont(new Font("BatangChe", 1, 14)); 
        btne.setText("e^x");
        btne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btneActionPerformed(evt);
            }
        });

        btndel.setFont(new Font("BatangChe", 1, 14)); 
        btndel.setText("Del");
        btndel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnroot.setFont(new Font("BatangChe", 1, 14)); 
        btnroot.setText("√");
        btnroot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnrootActionPerformed(evt);
            }
        });

        btnpower.setFont(new Font("BatangChe", 1, 14)); 
        btnpower.setText("^");
        btnpower.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnpowerActionPerformed(evt);
            }
        });

        btnpi.setFont(new Font("BatangChe", 1, 14)); 
        btnpi.setText("π");
        btnpi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnpiActionPerformed(evt);
            }
        });


 GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btndot, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnplusminus, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(btntimes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnplus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnminus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndivide, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btndel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnequals, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnsin, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btntan, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btncos, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnlog, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnln, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtDisplay))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btne, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpi, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnroot, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpower, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclear, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtDisplay, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnsin, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btntan, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncos, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnlog, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnln, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btne, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnroot, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpower, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpi, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnminus, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btndot, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnplusminus, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnplus, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btntimes, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndivide, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnequals, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))))
                .addGap(298, 298, 298))
        );

        pack();

    }

    private void txtDisplayActionPerformed(ActionEvent evt) {
      
    }

    private void btn1ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn1.getText();
        txtDisplay.setText(takein);    
    }

    private void btn2ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn2.getText();
        txtDisplay.setText(takein);
    }

    private void btn3ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn3.getText();
        txtDisplay.setText(takein);
    }

    private void btn4ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn4.getText();
        txtDisplay.setText(takein);
    }

    private void btn5ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn5.getText();
        txtDisplay.setText(takein);
      
    }

    private void btn6ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn6.getText();
        txtDisplay.setText(takein);
    }

    private void btn7ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn7.getText();
        txtDisplay.setText(takein);
    }

    private void btn8ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn8.getText();
        txtDisplay.setText(takein);
    }

    private void btn9ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn9.getText();
        txtDisplay.setText(takein);
    }

    private void btn0ActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btn0.getText();
        txtDisplay.setText(takein);
    }

    private void btndotActionPerformed(ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText()+ btndot.getText();
        txtDisplay.setText(takein);
    }

    private void btnclearActionPerformed(ActionEvent evt) {
        txtDisplay.setText("");
    }

    private void btnplusActionPerformed(ActionEvent evt) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "+";
    }

    private void btnminusActionPerformed(ActionEvent evt) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "-";
    }

    private void btntimesActionPerformed(ActionEvent evt) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "*";
    }

    private void btndivideActionPerformed(ActionEvent evt) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "/";
    }

    private void btnequalsActionPerformed(ActionEvent evt) {
        secondnum = Double.parseDouble(txtDisplay.getText());
        String answer;
        if (operation.equals("+")){
            result = firstnum + secondnum;
            answer = Double.toString(result);
            txtDisplay.setText(answer);
        }
        if (operation.equals("-")){
            result = firstnum - secondnum;
            answer = Double.toString(result);
            txtDisplay.setText(answer);
        }
        if (operation.equals("*")){
            result = firstnum * secondnum;
            answer = Double.toString(result);
            txtDisplay.setText(answer);
        }
        if (operation.equals("/")){
            result = firstnum / secondnum;
            answer = Double.toString(result);
            txtDisplay.setText(answer);
        }
        
    }

    private void btnplusminusActionPerformed(ActionEvent evt) {
    }

    private void btntanActionPerformed(ActionEvent evt) {
    }

    private void btnsinActionPerformed(ActionEvent evt) {
    }

    private void btncosActionPerformed(ActionEvent evt) {
    }

    private void btnlogActionPerformed(ActionEvent evt) {
    }

    private void btnlnActionPerformed(ActionEvent evt) {
    }

    private void btneActionPerformed(ActionEvent evt) {
    }

    private void btndelActionPerformed(ActionEvent evt) {
    }

    private void btnrootActionPerformed(ActionEvent evt) {
    }

    private void btnpowerActionPerformed(ActionEvent evt) {
    }

    private void btnpiActionPerformed(ActionEvent evt) {
    }
    public static void main(String args[]) {

	new Calc().setVisible(true);
        
    }
   
}
