/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


public class Certificate {
     private String certificateID;
    private String certificateName;
    private String certificateRank;
    private String certificateDate;

    public Certificate(String certificateID, String certificateName, String certificateRank, String certificateDate) {
        this.certificateID = certificateID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public String getCertificateID() {
        return certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    @Override
    public String toString() {
        return "Certificate ID: " + certificateID + ", Name: " + certificateName + ", Rank: " + certificateRank + ", Date: " + certificateDate;
    }
}
