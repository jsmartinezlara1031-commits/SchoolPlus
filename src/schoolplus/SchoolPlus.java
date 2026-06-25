package schoolplus;
import java.awt.Image;
    import javax.swing.ImageIcon;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SchoolPlus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String producto="";
        int  op=0, tcant=0;
        double precio=0, total=0, tglobal=0, descuento=0;
     ImageIcon iconoOriginal = new ImageIcon("C:\\Users\\glvju\\Downloads\\logotipo.png");
        Image imagen = iconoOriginal.getImage();
        Image imagenEscalada = imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon icono = new ImageIcon(imagenEscalada);
JOptionPane.showMessageDialog(null, "Bienvenido a SchoolPlus", "Bienvenida", JOptionPane.INFORMATION_MESSAGE, icono);

      String nombre = JOptionPane.showInputDialog("Digite su nombre:");
        
        System.out.println("Cuantas compras desea realizar?  ");
        int can=in.nextInt();
        for (int i=0; i<can;i++){
         System.out.println("Menu: seleccione la opcion acorde al producto\n"
                + "1: Cuaderno para nino 3500\n"
                + "2: Cuaderno para nina 3750\n"
                + "3: Lapices por unidad 1200\n"
                + "4: Caja de colores 8750\n"
                + "5: Caja de plastilinas 4000\n"
                + "6: Borrador por unidad 800\n"
                + "7: Salir");
            op=in.nextInt();
           int cant = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas unidades desea comprar? (20% descuento si compra 5 o más)"));
            
            switch(op){
                case 1: producto= "cuaderno para nino"; 
                     precio=3500;
                     break; 
                case 2: 
                    producto="cuaderno para nina";
                        precio=3750;
                        break;
                case 3: 
                    producto="lapiz (unidad";
                        precio=1200;
                        break;
                 case 4: 
                    producto="caja de colores";
                        precio=8750;
                        break;
                 case 5: 
                    producto="caja de plastilina";
                        precio=4000;
                        break;
                case 6: 
                    producto="borrador (unidad)";
                        precio=800;
                        break;
                case 7: 
                    producto="Adios";
                        break; 
                default:
                System.out.println("Opcion invalida");
            break;
            }
            if (cant >=5){
                total=cant*precio;
                descuento=total*0.2;
                total-=descuento;
            }else{
                total=cant*precio;
            }
                 tcant+=cant;
                 tglobal+=total; 
             JOptionPane.showMessageDialog(null, "El total a pagar por el producto: "+producto+" es de: "+total);
        }
        JOptionPane.showMessageDialog(null, "Hola "+nombre+" El total de su compra es de: "+tglobal+" Total productos comprados: "+tcant);
    }   
    
}
