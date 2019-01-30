/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culturalorganization;

import java.util.Date;
import culturalorganization.object.CulturalObject;

/**
 *
 * @author adnag
 */
public class Loan {
    protected Date startDate;
    protected Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Loan(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public CulturalObject getObject()
    {
        CulturalObject object = new CulturalObject();
        return object;
    }
}
