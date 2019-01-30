/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culturalorganization;

/**
 *
 * @author adnag
 */
public class User {
    protected String id;
    protected String name;
    protected Loan[] loans;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.loans = new Loan[5];
    }
    
    public void addLoan(Loan loan) {
        System.out.println("Loan added");
    }
    
    public void removeLoan(Loan loan) {
        System.out.println("Loan removed");
    }
    
    public Loan[] getLoans() {
        int size = 3;
        Loan[] loan = new Loan[size];
        return loan;
    }
}
