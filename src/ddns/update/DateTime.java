
package ddns.update;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author james
 */
public class DateTime {
    
    DateFormat df;
    
    
    public DateTime()
    {
        df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }
    
    public String getDate()
    {
        Date dateobj = new Date();
        return df.format(dateobj);
        
    }
    
}
