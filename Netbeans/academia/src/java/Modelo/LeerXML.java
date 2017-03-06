package Modelo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder; // |

/**
 *
 * @author Saulo
 */
public class LeerXML {
    public String[] cargarXML()
    {
        //Se crea un SAXBuilder para poder parsear el archivo
        String [] Archivo=new String [6];
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File( "C:\\website\\dbconnection.xml" );
        try
        {
            ActividadLog Log=new ActividadLog(LeerXML.class.getName(),"paso1");
            
            //Se crea el documento a traves del archivo
           Document document = (Document) builder.build( xmlFile );
           ActividadLog Log4=new ActividadLog(LeerXML.class.getName(),"antes de for");
           //Se obtiene la raiz 'tables'
           Element rootNode = document.getRootElement();           
           
           //Se obtiene la lista de hijos de la raiz 'tables'
           List list = rootNode.getChildren( "WebAccess" );
           Archivo[0]=Integer.toString(list.size());
           
           //Se recorre la lista de hijos de 'tables'
           for ( int i = 0; i < list.size(); i++ )
           {
               ActividadLog Log3=new ActividadLog(LeerXML.class.getName(),"paso2");
               //Se obtiene el elemento 'tabla'
               Element tabla = (Element) list.get(i);
               //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
               String nombreTabla = tabla.getAttributeValue("web");
               //System.out.println( "Tabla: " + nombreTabla );
               //Se obtiene la lista de hijos del tag 'tabla'
               List lista_campos = tabla.getChildren();
               //Se recorre la lista de campos
               for ( int j = 0; j < lista_campos.size(); j++ )
               {
                   //Se obtiene el elemento 'campo'
                   Element campo = (Element)lista_campos.get( j );
                   //Se obtienen los valores que estan entre los tags '<Parametros></server>'
                   //Se obtiene el valor que esta entre los tags '<server></server>'
                   Archivo[0] = campo.getChildTextTrim("server");
                   //Se obtiene el valor que esta entre los tags '<port></port>'
                   Archivo[1] = campo.getChildTextTrim("port");
                   //Se obtiene el valor que esta entre los tags '<database></database>'
                   Archivo[2] = campo.getChildTextTrim("database");
                   //Se obtiene el valor que esta entre los tags '<username></username>'
                   Archivo[3] = campo.getChildTextTrim("username");
                   //Se obtiene el valor que esta entre los tags '<password></password>'
                   Archivo[4] = campo.getChildTextTrim("password");
                   //Se obtiene el valor que esta entre los tags '<driver></driver>'
                   Archivo[5] = campo.getChildTextTrim("driver");
                   
               }
           }
        }catch ( IOException io ) {
            ActividadLog Log=new ActividadLog(LeerXML.class.getName(),io.getMessage());
            System.out.println( io.getMessage() );
        }catch ( JDOMException jdomex ) {
            System.out.println( jdomex.getMessage() );
        }
        return Archivo;
    }
}
