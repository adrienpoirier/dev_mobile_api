package com.formation.velo.api.client.pump;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class Fields {
    private String ville;
    private String pop;
    private String regName;
    private String comArmCode;
    private String depName;
    private String prixNom;
    private String comCode;
    private String epciName;
    private String depCode;
    private String prixID;
    private String servicesService;
    private String horairesAutomate24_24;
    private String comArmName;
    private OffsetDateTime prixMaj;
    private String id;
    private String regCode;
    private String adresse;
    private double[] geom;
    private String epciCode;
    private String cp;
    private double prixValeur;
    private String comName;

    @JsonProperty("ville")
    public String getVille() { return ville; }
    @JsonProperty("ville")
    public void setVille(String value) { this.ville = value; }

    @JsonProperty("pop")
    public String getPop() { return pop; }
    @JsonProperty("pop")
    public void setPop(String value) { this.pop = value; }

    @JsonProperty("reg_name")
    public String getRegName() { return regName; }
    @JsonProperty("reg_name")
    public void setRegName(String value) { this.regName = value; }

    @JsonProperty("com_arm_code")
    public String getCOMArmCode() { return comArmCode; }
    @JsonProperty("com_arm_code")
    public void setCOMArmCode(String value) { this.comArmCode = value; }

    @JsonProperty("dep_name")
    public String getDepName() { return depName; }
    @JsonProperty("dep_name")
    public void setDepName(String value) { this.depName = value; }

    @JsonProperty("prix_nom")
    public String getPrixNom() { return prixNom; }
    @JsonProperty("prix_nom")
    public void setPrixNom(String value) { this.prixNom = value; }

    @JsonProperty("com_code")
    public String getCOMCode() { return comCode; }
    @JsonProperty("com_code")
    public void setCOMCode(String value) { this.comCode = value; }

    @JsonProperty("epci_name")
    public String getEpciName() { return epciName; }
    @JsonProperty("epci_name")
    public void setEpciName(String value) { this.epciName = value; }

    @JsonProperty("dep_code")
    public String getDepCode() { return depCode; }
    @JsonProperty("dep_code")
    public void setDepCode(String value) { this.depCode = value; }

    @JsonProperty("prix_id")
    public String getPrixID() { return prixID; }
    @JsonProperty("prix_id")
    public void setPrixID(String value) { this.prixID = value; }

    @JsonProperty("services_service")
    public String getServicesService() { return servicesService; }
    @JsonProperty("services_service")
    public void setServicesService(String value) { this.servicesService = value; }

    @JsonProperty("horaires_automate_24_24")
    public String getHorairesAutomate2424() { return horairesAutomate24_24; }
    @JsonProperty("horaires_automate_24_24")
    public void setHorairesAutomate2424(String value) { this.horairesAutomate24_24 = value; }

    @JsonProperty("com_arm_name")
    public String getCOMArmName() { return comArmName; }
    @JsonProperty("com_arm_name")
    public void setCOMArmName(String value) { this.comArmName = value; }

    @JsonProperty("prix_maj")
    public OffsetDateTime getPrixMaj() { return prixMaj; }
    @JsonProperty("prix_maj")
    public void setPrixMaj(OffsetDateTime value) { this.prixMaj = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("reg_code")
    public String getRegCode() { return regCode; }
    @JsonProperty("reg_code")
    public void setRegCode(String value) { this.regCode = value; }

    @JsonProperty("adresse")
    public String getAdresse() { return adresse; }
    @JsonProperty("adresse")
    public void setAdresse(String value) { this.adresse = value; }

    @JsonProperty("geom")
    public double[] getGeom() { return geom; }
    @JsonProperty("geom")
    public void setGeom(double[] value) { this.geom = value; }

    @JsonProperty("epci_code")
    public String getEpciCode() { return epciCode; }
    @JsonProperty("epci_code")
    public void setEpciCode(String value) { this.epciCode = value; }

    @JsonProperty("cp")
    public String getCp() { return cp; }
    @JsonProperty("cp")
    public void setCp(String value) { this.cp = value; }

    @JsonProperty("prix_valeur")
    public double getPrixValeur() { return prixValeur; }
    @JsonProperty("prix_valeur")
    public void setPrixValeur(double value) { this.prixValeur = value; }

    @JsonProperty("com_name")
    public String getCOMName() { return comName; }
    @JsonProperty("com_name")
    public void setCOMName(String value) { this.comName = value; }
}
