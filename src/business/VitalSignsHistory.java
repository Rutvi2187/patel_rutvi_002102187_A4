package business;

import java.util.ArrayList;
/**
 *
 * @author Rutvi Patel
 */
public class VitalSignsHistory {
    
    private ArrayList<VitalSigns> history;
    
    public VitalSignsHistory() {
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns createAndAddVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSigns vitalSign) {
        history.remove(vitalSign);
    }
}
