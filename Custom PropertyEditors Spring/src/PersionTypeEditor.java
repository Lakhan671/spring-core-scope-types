
import java.beans.PropertyEditorSupport;


public class PersionTypeEditor extends PropertyEditorSupport{
		
	public void setAsText(String text) {
        setValue(new PersionType(text.toUpperCase()));
	}
}
