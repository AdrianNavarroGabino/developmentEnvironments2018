/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culturalorganization.object;

/**
 *
 * @author adnag
 */
public class MusicDisc extends CulturalObject {
    protected String recordCompany;

    public String getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
    }

    public MusicDisc(String recordCompany, int id, String title, String author) {
        super(id, title, author);
        this.recordCompany = recordCompany;
    }
}
