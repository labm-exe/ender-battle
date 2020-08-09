package game.ui;

import com.badlogic.gdx.audio.Sound;
import game.actors.Player;
import game.inventario.Inventory;
import game.inventario.food.Food;
import game.tools.Constant.Farming;
import game.tools.Sonido;
import static game.tools.Sonido.soundManager;
import java.util.HashMap;
import javax.swing.JLabel;

/**
 *
 * @author luisb
 */
public final class FrmInventario extends javax.swing.JFrame
{
    private Player player;
    private HashMap<String, JLabel> vistasAlimentos;
    
    /**
     * Ventana que ofrece la vista del inventario del jugador.
     * @param player jugador que posee el inventario.
     */
    public FrmInventario(Player player)
    {
        super("Inventario");
        initComponents();
        setResizable(false);
        this.player = player;
        
        vistasAlimentos = new HashMap<>();
        vistasAlimentos.put("manzana", lblManzana);
        vistasAlimentos.put("pera", lblPera);
        vistasAlimentos.put("zanahoria", lblZanahoria);
        vistasAlimentos.put("baya", lblBaya);
        vistasAlimentos.put("papa", lblPapa);
        vistasAlimentos.put("sandia", lblSandia);
        vistasAlimentos.put("conejo", lblConejo);
        vistasAlimentos.put("pollo", lblPollo);
        vistasAlimentos.put("carne", lblCarne);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel5 = new javax.swing.JLabel();
        imgManzana = new javax.swing.JLabel();
        imgPera = new javax.swing.JLabel();
        imgZanahoria = new javax.swing.JLabel();
        imgBaya = new javax.swing.JLabel();
        imgPapa = new javax.swing.JLabel();
        imgSandia = new javax.swing.JLabel();
        imgConejo = new javax.swing.JLabel();
        imgPollo = new javax.swing.JLabel();
        imgCarne = new javax.swing.JLabel();
        lblComida = new javax.swing.JLabel();
        lblManzana = new javax.swing.JLabel();
        lblPera = new javax.swing.JLabel();
        lblZanahoria = new javax.swing.JLabel();
        lblBaya = new javax.swing.JLabel();
        lblPapa = new javax.swing.JLabel();
        lblSandia = new javax.swing.JLabel();
        lblConejo = new javax.swing.JLabel();
        lblPollo = new javax.swing.JLabel();
        lblCarne = new javax.swing.JLabel();
        lblCasco = new javax.swing.JLabel();
        lblCasco1 = new javax.swing.JLabel();
        lblCasco2 = new javax.swing.JLabel();
        lblCasco3 = new javax.swing.JLabel();
        lblCasco4 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1");

        setPreferredSize(new java.awt.Dimension(685, 430));
        setType(java.awt.Window.Type.UTILITY);
        addWindowFocusListener(new java.awt.event.WindowFocusListener()
        {
            public void windowGainedFocus(java.awt.event.WindowEvent evt)
            {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt)
            {
                formWindowLostFocus(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                formKeyPressed(evt);
            }
        });

        imgManzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/comida/manzana.png"))); // NOI18N
        imgManzana.setToolTipText("manzana");
        imgManzana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgManzana.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                alimentoClicked(evt);
            }
        });

        imgPera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/comida/pera.png"))); // NOI18N
        imgPera.setToolTipText("pera");
        imgPera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgPera.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                alimentoClicked(evt);
            }
        });

        imgZanahoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/comida/zanahoria.png"))); // NOI18N
        imgZanahoria.setToolTipText("zanahoria");
        imgZanahoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgZanahoria.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                alimentoClicked(evt);
            }
        });

        imgBaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/comida/bayas.png"))); // NOI18N
        imgBaya.setToolTipText("baya");
        imgBaya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBaya.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                alimentoClicked(evt);
            }
        });

        imgPapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/comida/papa.png"))); // NOI18N
        imgPapa.setToolTipText("papa");
        imgPapa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgPapa.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                alimentoClicked(evt);
            }
        });

        imgSandia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/comida/sandia.png"))); // NOI18N
        imgSandia.setToolTipText("sandia");
        imgSandia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgSandia.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                alimentoClicked(evt);
            }
        });

        imgConejo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/comida/conejo_carne.png"))); // NOI18N
        imgConejo.setToolTipText("conejo");
        imgConejo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgConejo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                alimentoClicked(evt);
            }
        });

        imgPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/comida/pollo_carne.png"))); // NOI18N
        imgPollo.setToolTipText("pollo");
        imgPollo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgPollo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                alimentoClicked(evt);
            }
        });

        imgCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/comida/ganado_carne.png"))); // NOI18N
        imgCarne.setToolTipText("carne");
        imgCarne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgCarne.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                alimentoClicked(evt);
            }
        });

        lblComida.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblComida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComida.setText("Comida");

        lblManzana.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblManzana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManzana.setLabelFor(imgManzana);
        lblManzana.setText("1");

        lblPera.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblPera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPera.setLabelFor(imgPera);
        lblPera.setText("1");

        lblZanahoria.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblZanahoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblZanahoria.setLabelFor(imgZanahoria);
        lblZanahoria.setText("1");

        lblBaya.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblBaya.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBaya.setLabelFor(imgBaya);
        lblBaya.setText("1");

        lblPapa.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblPapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPapa.setLabelFor(imgPapa);
        lblPapa.setText("1");

        lblSandia.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblSandia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSandia.setLabelFor(imgSandia);
        lblSandia.setText("1");

        lblConejo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblConejo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConejo.setLabelFor(imgConejo);
        lblConejo.setText("1");

        lblPollo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblPollo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPollo.setLabelFor(imgPollo);
        lblPollo.setText("1");

        lblCarne.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCarne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarne.setLabelFor(imgCarne);
        lblCarne.setText("1");

        lblCasco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/objetos/botas1.png"))); // NOI18N

        lblCasco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/objetos/botas1.png"))); // NOI18N

        lblCasco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/objetos/botas1.png"))); // NOI18N

        lblCasco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/objetos/botas1.png"))); // NOI18N

        lblCasco4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/objetos/botas1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lblCasco4)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCasco1)
                    .addComponent(lblCasco2)
                    .addComponent(lblCasco3)
                    .addComponent(lblCasco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBaya, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPapa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSandia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgBaya)
                                .addGap(6, 6, 6)
                                .addComponent(imgPapa))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imgConejo))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imgPollo)
                                    .addComponent(lblPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(imgSandia))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCarne))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgManzana))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgPera)
                                .addGap(6, 6, 6)
                                .addComponent(imgZanahoria))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPera, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblZanahoria, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblComida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imgManzana)
                                    .addComponent(imgPera)
                                    .addComponent(imgZanahoria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblManzana)
                                    .addComponent(lblPera)
                                    .addComponent(lblZanahoria)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCasco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCasco3)
                                .addGap(11, 11, 11)
                                .addComponent(lblCasco2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCasco1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgBaya)
                            .addComponent(imgPapa)
                            .addComponent(imgSandia))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCasco4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSandia)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblBaya)
                                        .addComponent(lblPapa)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(imgConejo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblConejo)
                                            .addComponent(lblPollo)
                                            .addComponent(lblCarne)))
                                    .addComponent(imgPollo)
                                    .addComponent(imgCarne))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_formKeyPressed
    {//GEN-HEADEREND:event_formKeyPressed
        if(evt.getKeyChar() == 'E' || evt.getKeyChar() == 'e')
        {
            this.setVisible(false);
        }
    }//GEN-LAST:event_formKeyPressed

    private void alimentoClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_alimentoClicked
    {//GEN-HEADEREND:event_alimentoClicked
        //Obtener label clickeado
        JLabel origen = ((JLabel)evt.getSource());
        
        //Alimento que se decidió comer
        Farming alimento = Farming.getEnumByDesc(origen.getToolTipText());
        
        //Obtener la cantidad de vida a curar
        int index = Inventory.getIndex(alimento);
        Food food = player.getInventory().getFood()[index];
        
        //Si no tiene en el inventario
        if(food.getCant() <= 0)
        {
            //No hacer nada
            return;
        }
        
        //<editor-fold defaultstate="collapsed" desc="Sonido comer">
        int eatToSound = (int) ((Math.random() * ((3 - 1) + 1)) + 1);
        Sonido.soundManager.get("sonidos/eat"+eatToSound+".ogg", Sound.class).play();
        //</editor-fold>    
        
        //Añadir vida al jugador
        player.addLife(food.getFood());
        
        //Sacar el alimento
        player.getInventory().removeFood(alimento);
        
        actualizarVista();
    }//GEN-LAST:event_alimentoClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowLostFocus
    {//GEN-HEADEREND:event_formWindowLostFocus
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_formWindowLostFocus

    /**
     * Muestra la ventana del inventario.
     */
    public void mostrar()
    {
        setVisible(true);
        requestFocus();
        actualizarVista();
    }
    
    /**
     * Actualiza los componentes de acuerdo al inventario del jugador.
     */
    private void actualizarVista()
    {
        JLabel label;
        
        //Por cada comida del inventario
        for(Food food : player.getInventory().getFood())
        {
            //Tomar el label correspondiente
            label = vistasAlimentos.get(Farming.getDescByEnum(food.getType()));

            //Actualizar cantidad de comida
            label.setText(food.getCant() + "");
            
            //Si no tiene esa comida, deshabilitar botón
            if(food.getCant() == 0)
            {
                label.getLabelFor().setEnabled(false);
            }
            else
            {
                label.getLabelFor().setEnabled(true);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgBaya;
    private javax.swing.JLabel imgCarne;
    private javax.swing.JLabel imgConejo;
    private javax.swing.JLabel imgManzana;
    private javax.swing.JLabel imgPapa;
    private javax.swing.JLabel imgPera;
    private javax.swing.JLabel imgPollo;
    private javax.swing.JLabel imgSandia;
    private javax.swing.JLabel imgZanahoria;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBaya;
    private javax.swing.JLabel lblCarne;
    private javax.swing.JLabel lblCasco;
    private javax.swing.JLabel lblCasco1;
    private javax.swing.JLabel lblCasco2;
    private javax.swing.JLabel lblCasco3;
    private javax.swing.JLabel lblCasco4;
    private javax.swing.JLabel lblComida;
    private javax.swing.JLabel lblConejo;
    private javax.swing.JLabel lblManzana;
    private javax.swing.JLabel lblPapa;
    private javax.swing.JLabel lblPera;
    private javax.swing.JLabel lblPollo;
    private javax.swing.JLabel lblSandia;
    private javax.swing.JLabel lblZanahoria;
    // End of variables declaration//GEN-END:variables
}
