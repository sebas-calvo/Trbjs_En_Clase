/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BORRADORES;

/**
 *
 * @author sebas
 */
public class token {
    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
    
            
            if (JOptionPane.showConfirmDialog(this, "Seguro de modificar datos?"
                ,"Sistema de equipos", JOptionPane.ERROR_MESSAGE
                ,JOptionPane.QUESTION_MESSAGE)==0) {
            try{
        String[] data = new String [11];
        data[0]=this.jTextField1.getText();
        data[1]=this.jTextField2.getText();
        data[2]=this.jTextField3.getText();
        data[3]=this.jTextField4.getText();
        data[4]=this.jTextField5.getText();
        data[5]=this.jTextField6.getText();
        data[6]=this.jTextField7.getText();
        data[7]=this.jTextField8.getText();
        data[8]=this.jTextField9.getText();
        if (this.jRadioButton1.isSelected()) {
            data[9]="Local";
        }else{
            data[9]="Visita";
        }
        data[10]=this.jTextField1.getText();

        this.EquipoControl.modificar(data);
        JOptionPane.showMessageDialog(this, "Datos modificados"
                , "Aviso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(){
                    
                }
        
        
        
        
        
        }else{
            
            JOptionPane.showMessageDialog(this, "No se modificaron los datos"
                    , "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
}
