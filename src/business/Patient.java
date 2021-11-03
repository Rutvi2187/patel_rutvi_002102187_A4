package business;

/**
 *
 * @author Rutvi Patel
 */
public class Patient {
    
    private String patientID;
    private String primaryDoctorName;
    private String prefferedPharmacy;

//    public String getCommunity() {
//        return Community;
//    }

//    public void setCommunity(String Community) {
//        this.Community = Community;
//    }
//    private String Community;
    private VitalSignsHistory vitalSignHistory;
    
    public Patient() {
        this.vitalSignHistory = new VitalSignsHistory();
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }
    
    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }
    
    public String getPrefferedPharmacy() {
        return prefferedPharmacy;
    }
    
    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.prefferedPharmacy = prefferedPharmacy;
    }
    
    public VitalSignsHistory getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(VitalSignsHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
}
