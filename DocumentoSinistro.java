package com.azure.app.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The DocumentoSinistro model.
 */
@Fluent
public final class DocumentoSinistro implements JsonSerializable<DocumentoSinistro> {
    /*
     * The compagnia property.
     */
    @Generated
    private String compagnia;

    /*
     * The agenzia property.
     */
    @Generated
    private String agenzia;

    /*
     * The annoPolizza property.
     */
    @Generated
    private Integer annoPolizza;

    /*
     * The areaDiBusiness property.
     */
    @Generated
    private String areaDiBusiness;

    /*
     * The codiceFiscale property.
     */
    @Generated
    private String codiceFiscale;

    /*
     * The codiceUnitaOrganizzativa property.
     */
    @Generated
    private String codiceUnitaOrganizzativa;

    /*
     * The tipoUnitaOrganizzativa property.
     */
    @Generated
    private String tipoUnitaOrganizzativa;

    /*
     * The contentSize property.
     */
    @Generated
    private String contentSize;

    /*
     * The dataInvioAnia property.
     */
    @Generated
    private String dataInvioAnia;

    /*
     * The dataRicezioneDaAnia property.
     */
    @Generated
    private String dataRicezioneDaAnia;

    /*
     * The dataSinistro property.
     */
    @Generated
    private String dataSinistro;

    /*
     * The enteGestore property.
     */
    @Generated
    private String enteGestore;

    /*
     * The nomeContraentePolizza property.
     */
    @Generated
    private String nomeContraentePolizza;

    /*
     * The numeroPolizzaColpita property.
     */
    @Generated
    private String numeroPolizzaColpita;

    /*
     * The partitaIva property.
     */
    @Generated
    private String partitaIva;

    /*
     * The ramoPolizza property.
     */
    @Generated
    private String ramoPolizza;

    /*
     * The ramoTecnico property.
     */
    @Generated
    private String ramoTecnico;

    /*
     * The riferimentoSinistro property.
     */
    @Generated
    private String riferimentoSinistro;

    /*
     * The sinistroChiuso property.
     */
    @Generated
    private Boolean sinistroChiuso;

    /*
     * The targa property.
     */
    @Generated
    private String targa;

    /*
     * The annoIncarico property.
     */
    @Generated
    private Integer annoIncarico;

    /*
     * The barcode property.
     */
    @Generated
    private String barcode;

    /*
     * The codiceAllegato property.
     */
    @Generated
    private String codiceAllegato;

    /*
     * The codiceIncarico property.
     */
    @Generated
    private String codiceIncarico;

    /*
     * The codicePrimoUtentePubblicante property.
     */
    @Generated
    private String codicePrimoUtentePubblicante;

    /*
     * The codiceTicketIsaac property.
     */
    @Generated
    private String codiceTicketIsaac;

    /*
     * The codiceTipologiaDocumento property.
     */
    @Generated
    private String codiceTipologiaDocumento;

    /*
     * The codiceUtentePubblicante property.
     */
    @Generated
    private String codiceUtentePubblicante;

    /*
     * The codiceVisibilitaEnti property.
     */
    @Generated
    private String codiceVisibilitaEnti;

    /*
     * The documentoArchiviato property.
     */
    @Generated
    private Boolean documentoArchiviato;

    /*
     * The documentoDaLeggere property.
     */
    @Generated
    private Boolean documentoDaLeggere;

    /*
     * The documentoNonCompleto property.
     */
    @Generated
    private Boolean documentoNonCompleto;

    /*
     * The entePubblicante property.
     */
    @Generated
    private String entePubblicante;

    /*
     * The idStampa property.
     */
    @Generated
    private String idStampa;

    /*
     * The limitazioneVisibilitaAgenzia property.
     */
    @Generated
    private Boolean limitazioneVisibilitaAgenzia;

    /*
     * The limitazioneVisibilitaCarrozzeria property.
     */
    @Generated
    private Boolean limitazioneVisibilitaCarrozzeria;

    /*
     * The limitazioneVisibilitaLegali property.
     */
    @Generated
    private Boolean limitazioneVisibilitaLegali;

    /*
     * The limitazioneVisibilitaMedici property.
     */
    @Generated
    private Boolean limitazioneVisibilitaMedici;

    /*
     * The limitazioneVisibilitaPeriti property.
     */
    @Generated
    private Boolean limitazioneVisibilitaPeriti;

    /*
     * The enteEmittenteIncarico property.
     */
    @Generated
    private String enteEmittenteIncarico;

    /*
     * The liquidatoreIncaricato property.
     */
    @Generated
    private String liquidatoreIncaricato;

    /*
     * The livello property.
     */
    @Generated
    private String livello;

    /*
     * The nomePosizione property.
     */
    @Generated
    private String nomePosizione;

    /*
     * The numeroFattura property.
     */
    @Generated
    private String numeroFattura;

    /*
     * The numeroIncarico property.
     */
    @Generated
    private Integer numeroIncarico;

    /*
     * The numeroPosizione property.
     */
    @Generated
    private String numeroPosizione;

    /*
     * The origine property.
     */
    @Generated
    private String origine;

    /*
     * The statoAnia property.
     */
    @Generated
    private Integer statoAnia;

    /*
     * The tipologiaDocumento property.
     */
    @Generated
    private String tipologiaDocumento;

    /*
     * The contentType property.
     */
    @Generated
    private String contentType;

    /*
     * The dataPubblicazione property.
     */
    @Generated
    private String dataPubblicazione;

    /*
     * The idDocumento property.
     */
    @Generated
    private String idDocumento;

    /*
     * The nomeAllegato property.
     */
    @Generated
    private String nomeAllegato;

    /*
     * The dataConferimentoIncarico property.
     */
    @Generated
    private String dataConferimentoIncarico;

    /*
     * The contenuto property.
     */
    @Generated
    private String contenuto;

    /**
     * Creates an instance of DocumentoSinistro class.
     */
    @Generated
    public DocumentoSinistro() {
    }

    /**
     * Get the compagnia property: The compagnia property.
     * 
     * @return the compagnia value.
     */
    @Generated
    public String getCompagnia() {
        return this.compagnia;
    }

    /**
     * Set the compagnia property: The compagnia property.
     * 
     * @param compagnia the compagnia value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCompagnia(String compagnia) {
        this.compagnia = compagnia;
        return this;
    }

    /**
     * Get the agenzia property: The agenzia property.
     * 
     * @return the agenzia value.
     */
    @Generated
    public String getAgenzia() {
        return this.agenzia;
    }

    /**
     * Set the agenzia property: The agenzia property.
     * 
     * @param agenzia the agenzia value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setAgenzia(String agenzia) {
        this.agenzia = agenzia;
        return this;
    }

    /**
     * Get the annoPolizza property: The annoPolizza property.
     * 
     * @return the annoPolizza value.
     */
    @Generated
    public Integer getAnnoPolizza() {
        return this.annoPolizza;
    }

    /**
     * Set the annoPolizza property: The annoPolizza property.
     * 
     * @param annoPolizza the annoPolizza value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setAnnoPolizza(Integer annoPolizza) {
        this.annoPolizza = annoPolizza;
        return this;
    }

    /**
     * Get the areaDiBusiness property: The areaDiBusiness property.
     * 
     * @return the areaDiBusiness value.
     */
    @Generated
    public String getAreaDiBusiness() {
        return this.areaDiBusiness;
    }

    /**
     * Set the areaDiBusiness property: The areaDiBusiness property.
     * 
     * @param areaDiBusiness the areaDiBusiness value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setAreaDiBusiness(String areaDiBusiness) {
        this.areaDiBusiness = areaDiBusiness;
        return this;
    }

    /**
     * Get the codiceFiscale property: The codiceFiscale property.
     * 
     * @return the codiceFiscale value.
     */
    @Generated
    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }

    /**
     * Set the codiceFiscale property: The codiceFiscale property.
     * 
     * @param codiceFiscale the codiceFiscale value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
        return this;
    }

    /**
     * Get the codiceUnitaOrganizzativa property: The codiceUnitaOrganizzativa property.
     * 
     * @return the codiceUnitaOrganizzativa value.
     */
    @Generated
    public String getCodiceUnitaOrganizzativa() {
        return this.codiceUnitaOrganizzativa;
    }

    /**
     * Set the codiceUnitaOrganizzativa property: The codiceUnitaOrganizzativa property.
     * 
     * @param codiceUnitaOrganizzativa the codiceUnitaOrganizzativa value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCodiceUnitaOrganizzativa(String codiceUnitaOrganizzativa) {
        this.codiceUnitaOrganizzativa = codiceUnitaOrganizzativa;
        return this;
    }

    /**
     * Get the tipoUnitaOrganizzativa property: The tipoUnitaOrganizzativa property.
     * 
     * @return the tipoUnitaOrganizzativa value.
     */
    @Generated
    public String getTipoUnitaOrganizzativa() {
        return this.tipoUnitaOrganizzativa;
    }

    /**
     * Set the tipoUnitaOrganizzativa property: The tipoUnitaOrganizzativa property.
     * 
     * @param tipoUnitaOrganizzativa the tipoUnitaOrganizzativa value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setTipoUnitaOrganizzativa(String tipoUnitaOrganizzativa) {
        this.tipoUnitaOrganizzativa = tipoUnitaOrganizzativa;
        return this;
    }

    /**
     * Get the contentSize property: The contentSize property.
     * 
     * @return the contentSize value.
     */
    @Generated
    public String getContentSize() {
        return this.contentSize;
    }

    /**
     * Set the contentSize property: The contentSize property.
     * 
     * @param contentSize the contentSize value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setContentSize(String contentSize) {
        this.contentSize = contentSize;
        return this;
    }

    /**
     * Get the dataInvioAnia property: The dataInvioAnia property.
     * 
     * @return the dataInvioAnia value.
     */
    @Generated
    public String getDataInvioAnia() {
        return this.dataInvioAnia;
    }

    /**
     * Set the dataInvioAnia property: The dataInvioAnia property.
     * 
     * @param dataInvioAnia the dataInvioAnia value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setDataInvioAnia(String dataInvioAnia) {
        this.dataInvioAnia = dataInvioAnia;
        return this;
    }

    /**
     * Get the dataRicezioneDaAnia property: The dataRicezioneDaAnia property.
     * 
     * @return the dataRicezioneDaAnia value.
     */
    @Generated
    public String getDataRicezioneDaAnia() {
        return this.dataRicezioneDaAnia;
    }

    /**
     * Set the dataRicezioneDaAnia property: The dataRicezioneDaAnia property.
     * 
     * @param dataRicezioneDaAnia the dataRicezioneDaAnia value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setDataRicezioneDaAnia(String dataRicezioneDaAnia) {
        this.dataRicezioneDaAnia = dataRicezioneDaAnia;
        return this;
    }

    /**
     * Get the dataSinistro property: The dataSinistro property.
     * 
     * @return the dataSinistro value.
     */
    @Generated
    public String getDataSinistro() {
        return this.dataSinistro;
    }

    /**
     * Set the dataSinistro property: The dataSinistro property.
     * 
     * @param dataSinistro the dataSinistro value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setDataSinistro(String dataSinistro) {
        this.dataSinistro = dataSinistro;
        return this;
    }

    /**
     * Get the enteGestore property: The enteGestore property.
     * 
     * @return the enteGestore value.
     */
    @Generated
    public String getEnteGestore() {
        return this.enteGestore;
    }

    /**
     * Set the enteGestore property: The enteGestore property.
     * 
     * @param enteGestore the enteGestore value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setEnteGestore(String enteGestore) {
        this.enteGestore = enteGestore;
        return this;
    }

    /**
     * Get the nomeContraentePolizza property: The nomeContraentePolizza property.
     * 
     * @return the nomeContraentePolizza value.
     */
    @Generated
    public String getNomeContraentePolizza() {
        return this.nomeContraentePolizza;
    }

    /**
     * Set the nomeContraentePolizza property: The nomeContraentePolizza property.
     * 
     * @param nomeContraentePolizza the nomeContraentePolizza value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setNomeContraentePolizza(String nomeContraentePolizza) {
        this.nomeContraentePolizza = nomeContraentePolizza;
        return this;
    }

    /**
     * Get the numeroPolizzaColpita property: The numeroPolizzaColpita property.
     * 
     * @return the numeroPolizzaColpita value.
     */
    @Generated
    public String getNumeroPolizzaColpita() {
        return this.numeroPolizzaColpita;
    }

    /**
     * Set the numeroPolizzaColpita property: The numeroPolizzaColpita property.
     * 
     * @param numeroPolizzaColpita the numeroPolizzaColpita value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setNumeroPolizzaColpita(String numeroPolizzaColpita) {
        this.numeroPolizzaColpita = numeroPolizzaColpita;
        return this;
    }

    /**
     * Get the partitaIva property: The partitaIva property.
     * 
     * @return the partitaIva value.
     */
    @Generated
    public String getPartitaIva() {
        return this.partitaIva;
    }

    /**
     * Set the partitaIva property: The partitaIva property.
     * 
     * @param partitaIva the partitaIva value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
        return this;
    }

    /**
     * Get the ramoPolizza property: The ramoPolizza property.
     * 
     * @return the ramoPolizza value.
     */
    @Generated
    public String getRamoPolizza() {
        return this.ramoPolizza;
    }

    /**
     * Set the ramoPolizza property: The ramoPolizza property.
     * 
     * @param ramoPolizza the ramoPolizza value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setRamoPolizza(String ramoPolizza) {
        this.ramoPolizza = ramoPolizza;
        return this;
    }

    /**
     * Get the ramoTecnico property: The ramoTecnico property.
     * 
     * @return the ramoTecnico value.
     */
    @Generated
    public String getRamoTecnico() {
        return this.ramoTecnico;
    }

    /**
     * Set the ramoTecnico property: The ramoTecnico property.
     * 
     * @param ramoTecnico the ramoTecnico value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setRamoTecnico(String ramoTecnico) {
        this.ramoTecnico = ramoTecnico;
        return this;
    }

    /**
     * Get the riferimentoSinistro property: The riferimentoSinistro property.
     * 
     * @return the riferimentoSinistro value.
     */
    @Generated
    public String getRiferimentoSinistro() {
        return this.riferimentoSinistro;
    }

    /**
     * Set the riferimentoSinistro property: The riferimentoSinistro property.
     * 
     * @param riferimentoSinistro the riferimentoSinistro value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setRiferimentoSinistro(String riferimentoSinistro) {
        this.riferimentoSinistro = riferimentoSinistro;
        return this;
    }

    /**
     * Get the sinistroChiuso property: The sinistroChiuso property.
     * 
     * @return the sinistroChiuso value.
     */
    @Generated
    public Boolean isSinistroChiuso() {
        return this.sinistroChiuso;
    }

    /**
     * Set the sinistroChiuso property: The sinistroChiuso property.
     * 
     * @param sinistroChiuso the sinistroChiuso value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setSinistroChiuso(Boolean sinistroChiuso) {
        this.sinistroChiuso = sinistroChiuso;
        return this;
    }

    /**
     * Get the targa property: The targa property.
     * 
     * @return the targa value.
     */
    @Generated
    public String getTarga() {
        return this.targa;
    }

    /**
     * Set the targa property: The targa property.
     * 
     * @param targa the targa value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setTarga(String targa) {
        this.targa = targa;
        return this;
    }

    /**
     * Get the annoIncarico property: The annoIncarico property.
     * 
     * @return the annoIncarico value.
     */
    @Generated
    public Integer getAnnoIncarico() {
        return this.annoIncarico;
    }

    /**
     * Set the annoIncarico property: The annoIncarico property.
     * 
     * @param annoIncarico the annoIncarico value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setAnnoIncarico(Integer annoIncarico) {
        this.annoIncarico = annoIncarico;
        return this;
    }

    /**
     * Get the barcode property: The barcode property.
     * 
     * @return the barcode value.
     */
    @Generated
    public String getBarcode() {
        return this.barcode;
    }

    /**
     * Set the barcode property: The barcode property.
     * 
     * @param barcode the barcode value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    /**
     * Get the codiceAllegato property: The codiceAllegato property.
     * 
     * @return the codiceAllegato value.
     */
    @Generated
    public String getCodiceAllegato() {
        return this.codiceAllegato;
    }

    /**
     * Set the codiceAllegato property: The codiceAllegato property.
     * 
     * @param codiceAllegato the codiceAllegato value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCodiceAllegato(String codiceAllegato) {
        this.codiceAllegato = codiceAllegato;
        return this;
    }

    /**
     * Get the codiceIncarico property: The codiceIncarico property.
     * 
     * @return the codiceIncarico value.
     */
    @Generated
    public String getCodiceIncarico() {
        return this.codiceIncarico;
    }

    /**
     * Set the codiceIncarico property: The codiceIncarico property.
     * 
     * @param codiceIncarico the codiceIncarico value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCodiceIncarico(String codiceIncarico) {
        this.codiceIncarico = codiceIncarico;
        return this;
    }

    /**
     * Get the codicePrimoUtentePubblicante property: The codicePrimoUtentePubblicante property.
     * 
     * @return the codicePrimoUtentePubblicante value.
     */
    @Generated
    public String getCodicePrimoUtentePubblicante() {
        return this.codicePrimoUtentePubblicante;
    }

    /**
     * Set the codicePrimoUtentePubblicante property: The codicePrimoUtentePubblicante property.
     * 
     * @param codicePrimoUtentePubblicante the codicePrimoUtentePubblicante value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCodicePrimoUtentePubblicante(String codicePrimoUtentePubblicante) {
        this.codicePrimoUtentePubblicante = codicePrimoUtentePubblicante;
        return this;
    }

    /**
     * Get the codiceTicketIsaac property: The codiceTicketIsaac property.
     * 
     * @return the codiceTicketIsaac value.
     */
    @Generated
    public String getCodiceTicketIsaac() {
        return this.codiceTicketIsaac;
    }

    /**
     * Set the codiceTicketIsaac property: The codiceTicketIsaac property.
     * 
     * @param codiceTicketIsaac the codiceTicketIsaac value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCodiceTicketIsaac(String codiceTicketIsaac) {
        this.codiceTicketIsaac = codiceTicketIsaac;
        return this;
    }

    /**
     * Get the codiceTipologiaDocumento property: The codiceTipologiaDocumento property.
     * 
     * @return the codiceTipologiaDocumento value.
     */
    @Generated
    public String getCodiceTipologiaDocumento() {
        return this.codiceTipologiaDocumento;
    }

    /**
     * Set the codiceTipologiaDocumento property: The codiceTipologiaDocumento property.
     * 
     * @param codiceTipologiaDocumento the codiceTipologiaDocumento value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCodiceTipologiaDocumento(String codiceTipologiaDocumento) {
        this.codiceTipologiaDocumento = codiceTipologiaDocumento;
        return this;
    }

    /**
     * Get the codiceUtentePubblicante property: The codiceUtentePubblicante property.
     * 
     * @return the codiceUtentePubblicante value.
     */
    @Generated
    public String getCodiceUtentePubblicante() {
        return this.codiceUtentePubblicante;
    }

    /**
     * Set the codiceUtentePubblicante property: The codiceUtentePubblicante property.
     * 
     * @param codiceUtentePubblicante the codiceUtentePubblicante value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCodiceUtentePubblicante(String codiceUtentePubblicante) {
        this.codiceUtentePubblicante = codiceUtentePubblicante;
        return this;
    }

    /**
     * Get the codiceVisibilitaEnti property: The codiceVisibilitaEnti property.
     * 
     * @return the codiceVisibilitaEnti value.
     */
    @Generated
    public String getCodiceVisibilitaEnti() {
        return this.codiceVisibilitaEnti;
    }

    /**
     * Set the codiceVisibilitaEnti property: The codiceVisibilitaEnti property.
     * 
     * @param codiceVisibilitaEnti the codiceVisibilitaEnti value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setCodiceVisibilitaEnti(String codiceVisibilitaEnti) {
        this.codiceVisibilitaEnti = codiceVisibilitaEnti;
        return this;
    }

    /**
     * Get the documentoArchiviato property: The documentoArchiviato property.
     * 
     * @return the documentoArchiviato value.
     */
    @Generated
    public Boolean isDocumentoArchiviato() {
        return this.documentoArchiviato;
    }

    /**
     * Set the documentoArchiviato property: The documentoArchiviato property.
     * 
     * @param documentoArchiviato the documentoArchiviato value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setDocumentoArchiviato(Boolean documentoArchiviato) {
        this.documentoArchiviato = documentoArchiviato;
        return this;
    }

    /**
     * Get the documentoDaLeggere property: The documentoDaLeggere property.
     * 
     * @return the documentoDaLeggere value.
     */
    @Generated
    public Boolean isDocumentoDaLeggere() {
        return this.documentoDaLeggere;
    }

    /**
     * Set the documentoDaLeggere property: The documentoDaLeggere property.
     * 
     * @param documentoDaLeggere the documentoDaLeggere value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setDocumentoDaLeggere(Boolean documentoDaLeggere) {
        this.documentoDaLeggere = documentoDaLeggere;
        return this;
    }

    /**
     * Get the documentoNonCompleto property: The documentoNonCompleto property.
     * 
     * @return the documentoNonCompleto value.
     */
    @Generated
    public Boolean isDocumentoNonCompleto() {
        return this.documentoNonCompleto;
    }

    /**
     * Set the documentoNonCompleto property: The documentoNonCompleto property.
     * 
     * @param documentoNonCompleto the documentoNonCompleto value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setDocumentoNonCompleto(Boolean documentoNonCompleto) {
        this.documentoNonCompleto = documentoNonCompleto;
        return this;
    }

    /**
     * Get the entePubblicante property: The entePubblicante property.
     * 
     * @return the entePubblicante value.
     */
    @Generated
    public String getEntePubblicante() {
        return this.entePubblicante;
    }

    /**
     * Set the entePubblicante property: The entePubblicante property.
     * 
     * @param entePubblicante the entePubblicante value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setEntePubblicante(String entePubblicante) {
        this.entePubblicante = entePubblicante;
        return this;
    }

    /**
     * Get the idStampa property: The idStampa property.
     * 
     * @return the idStampa value.
     */
    @Generated
    public String getIdStampa() {
        return this.idStampa;
    }

    /**
     * Set the idStampa property: The idStampa property.
     * 
     * @param idStampa the idStampa value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setIdStampa(String idStampa) {
        this.idStampa = idStampa;
        return this;
    }

    /**
     * Get the limitazioneVisibilitaAgenzia property: The limitazioneVisibilitaAgenzia property.
     * 
     * @return the limitazioneVisibilitaAgenzia value.
     */
    @Generated
    public Boolean isLimitazioneVisibilitaAgenzia() {
        return this.limitazioneVisibilitaAgenzia;
    }

    /**
     * Set the limitazioneVisibilitaAgenzia property: The limitazioneVisibilitaAgenzia property.
     * 
     * @param limitazioneVisibilitaAgenzia the limitazioneVisibilitaAgenzia value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setLimitazioneVisibilitaAgenzia(Boolean limitazioneVisibilitaAgenzia) {
        this.limitazioneVisibilitaAgenzia = limitazioneVisibilitaAgenzia;
        return this;
    }

    /**
     * Get the limitazioneVisibilitaCarrozzeria property: The limitazioneVisibilitaCarrozzeria property.
     * 
     * @return the limitazioneVisibilitaCarrozzeria value.
     */
    @Generated
    public Boolean isLimitazioneVisibilitaCarrozzeria() {
        return this.limitazioneVisibilitaCarrozzeria;
    }

    /**
     * Set the limitazioneVisibilitaCarrozzeria property: The limitazioneVisibilitaCarrozzeria property.
     * 
     * @param limitazioneVisibilitaCarrozzeria the limitazioneVisibilitaCarrozzeria value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setLimitazioneVisibilitaCarrozzeria(Boolean limitazioneVisibilitaCarrozzeria) {
        this.limitazioneVisibilitaCarrozzeria = limitazioneVisibilitaCarrozzeria;
        return this;
    }

    /**
     * Get the limitazioneVisibilitaLegali property: The limitazioneVisibilitaLegali property.
     * 
     * @return the limitazioneVisibilitaLegali value.
     */
    @Generated
    public Boolean isLimitazioneVisibilitaLegali() {
        return this.limitazioneVisibilitaLegali;
    }

    /**
     * Set the limitazioneVisibilitaLegali property: The limitazioneVisibilitaLegali property.
     * 
     * @param limitazioneVisibilitaLegali the limitazioneVisibilitaLegali value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setLimitazioneVisibilitaLegali(Boolean limitazioneVisibilitaLegali) {
        this.limitazioneVisibilitaLegali = limitazioneVisibilitaLegali;
        return this;
    }

    /**
     * Get the limitazioneVisibilitaMedici property: The limitazioneVisibilitaMedici property.
     * 
     * @return the limitazioneVisibilitaMedici value.
     */
    @Generated
    public Boolean isLimitazioneVisibilitaMedici() {
        return this.limitazioneVisibilitaMedici;
    }

    /**
     * Set the limitazioneVisibilitaMedici property: The limitazioneVisibilitaMedici property.
     * 
     * @param limitazioneVisibilitaMedici the limitazioneVisibilitaMedici value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setLimitazioneVisibilitaMedici(Boolean limitazioneVisibilitaMedici) {
        this.limitazioneVisibilitaMedici = limitazioneVisibilitaMedici;
        return this;
    }

    /**
     * Get the limitazioneVisibilitaPeriti property: The limitazioneVisibilitaPeriti property.
     * 
     * @return the limitazioneVisibilitaPeriti value.
     */
    @Generated
    public Boolean isLimitazioneVisibilitaPeriti() {
        return this.limitazioneVisibilitaPeriti;
    }

    /**
     * Set the limitazioneVisibilitaPeriti property: The limitazioneVisibilitaPeriti property.
     * 
     * @param limitazioneVisibilitaPeriti the limitazioneVisibilitaPeriti value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setLimitazioneVisibilitaPeriti(Boolean limitazioneVisibilitaPeriti) {
        this.limitazioneVisibilitaPeriti = limitazioneVisibilitaPeriti;
        return this;
    }

    /**
     * Get the enteEmittenteIncarico property: The enteEmittenteIncarico property.
     * 
     * @return the enteEmittenteIncarico value.
     */
    @Generated
    public String getEnteEmittenteIncarico() {
        return this.enteEmittenteIncarico;
    }

    /**
     * Set the enteEmittenteIncarico property: The enteEmittenteIncarico property.
     * 
     * @param enteEmittenteIncarico the enteEmittenteIncarico value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setEnteEmittenteIncarico(String enteEmittenteIncarico) {
        this.enteEmittenteIncarico = enteEmittenteIncarico;
        return this;
    }

    /**
     * Get the liquidatoreIncaricato property: The liquidatoreIncaricato property.
     * 
     * @return the liquidatoreIncaricato value.
     */
    @Generated
    public String getLiquidatoreIncaricato() {
        return this.liquidatoreIncaricato;
    }

    /**
     * Set the liquidatoreIncaricato property: The liquidatoreIncaricato property.
     * 
     * @param liquidatoreIncaricato the liquidatoreIncaricato value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setLiquidatoreIncaricato(String liquidatoreIncaricato) {
        this.liquidatoreIncaricato = liquidatoreIncaricato;
        return this;
    }

    /**
     * Get the livello property: The livello property.
     * 
     * @return the livello value.
     */
    @Generated
    public String getLivello() {
        return this.livello;
    }

    /**
     * Set the livello property: The livello property.
     * 
     * @param livello the livello value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setLivello(String livello) {
        this.livello = livello;
        return this;
    }

    /**
     * Get the nomePosizione property: The nomePosizione property.
     * 
     * @return the nomePosizione value.
     */
    @Generated
    public String getNomePosizione() {
        return this.nomePosizione;
    }

    /**
     * Set the nomePosizione property: The nomePosizione property.
     * 
     * @param nomePosizione the nomePosizione value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setNomePosizione(String nomePosizione) {
        this.nomePosizione = nomePosizione;
        return this;
    }

    /**
     * Get the numeroFattura property: The numeroFattura property.
     * 
     * @return the numeroFattura value.
     */
    @Generated
    public String getNumeroFattura() {
        return this.numeroFattura;
    }

    /**
     * Set the numeroFattura property: The numeroFattura property.
     * 
     * @param numeroFattura the numeroFattura value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setNumeroFattura(String numeroFattura) {
        this.numeroFattura = numeroFattura;
        return this;
    }

    /**
     * Get the numeroIncarico property: The numeroIncarico property.
     * 
     * @return the numeroIncarico value.
     */
    @Generated
    public Integer getNumeroIncarico() {
        return this.numeroIncarico;
    }

    /**
     * Set the numeroIncarico property: The numeroIncarico property.
     * 
     * @param numeroIncarico the numeroIncarico value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setNumeroIncarico(Integer numeroIncarico) {
        this.numeroIncarico = numeroIncarico;
        return this;
    }

    /**
     * Get the numeroPosizione property: The numeroPosizione property.
     * 
     * @return the numeroPosizione value.
     */
    @Generated
    public String getNumeroPosizione() {
        return this.numeroPosizione;
    }

    /**
     * Set the numeroPosizione property: The numeroPosizione property.
     * 
     * @param numeroPosizione the numeroPosizione value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setNumeroPosizione(String numeroPosizione) {
        this.numeroPosizione = numeroPosizione;
        return this;
    }

    /**
     * Get the origine property: The origine property.
     * 
     * @return the origine value.
     */
    @Generated
    public String getOrigine() {
        return this.origine;
    }

    /**
     * Set the origine property: The origine property.
     * 
     * @param origine the origine value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setOrigine(String origine) {
        this.origine = origine;
        return this;
    }

    /**
     * Get the statoAnia property: The statoAnia property.
     * 
     * @return the statoAnia value.
     */
    @Generated
    public Integer getStatoAnia() {
        return this.statoAnia;
    }

    /**
     * Set the statoAnia property: The statoAnia property.
     * 
     * @param statoAnia the statoAnia value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setStatoAnia(Integer statoAnia) {
        this.statoAnia = statoAnia;
        return this;
    }

    /**
     * Get the tipologiaDocumento property: The tipologiaDocumento property.
     * 
     * @return the tipologiaDocumento value.
     */
    @Generated
    public String getTipologiaDocumento() {
        return this.tipologiaDocumento;
    }

    /**
     * Set the tipologiaDocumento property: The tipologiaDocumento property.
     * 
     * @param tipologiaDocumento the tipologiaDocumento value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setTipologiaDocumento(String tipologiaDocumento) {
        this.tipologiaDocumento = tipologiaDocumento;
        return this;
    }

    /**
     * Get the contentType property: The contentType property.
     * 
     * @return the contentType value.
     */
    @Generated
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The contentType property.
     * 
     * @param contentType the contentType value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the dataPubblicazione property: The dataPubblicazione property.
     * 
     * @return the dataPubblicazione value.
     */
    @Generated
    public String getDataPubblicazione() {
        return this.dataPubblicazione;
    }

    /**
     * Set the dataPubblicazione property: The dataPubblicazione property.
     * 
     * @param dataPubblicazione the dataPubblicazione value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setDataPubblicazione(String dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
        return this;
    }

    /**
     * Get the idDocumento property: The idDocumento property.
     * 
     * @return the idDocumento value.
     */
    @Generated
    public String getIdDocumento() {
        return this.idDocumento;
    }

    /**
     * Set the idDocumento property: The idDocumento property.
     * 
     * @param idDocumento the idDocumento value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
        return this;
    }

    /**
     * Get the nomeAllegato property: The nomeAllegato property.
     * 
     * @return the nomeAllegato value.
     */
    @Generated
    public String getNomeAllegato() {
        return this.nomeAllegato;
    }

    /**
     * Set the nomeAllegato property: The nomeAllegato property.
     * 
     * @param nomeAllegato the nomeAllegato value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setNomeAllegato(String nomeAllegato) {
        this.nomeAllegato = nomeAllegato;
        return this;
    }

    /**
     * Get the dataConferimentoIncarico property: The dataConferimentoIncarico property.
     * 
     * @return the dataConferimentoIncarico value.
     */
    @Generated
    public String getDataConferimentoIncarico() {
        return this.dataConferimentoIncarico;
    }

    /**
     * Set the dataConferimentoIncarico property: The dataConferimentoIncarico property.
     * 
     * @param dataConferimentoIncarico the dataConferimentoIncarico value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setDataConferimentoIncarico(String dataConferimentoIncarico) {
        this.dataConferimentoIncarico = dataConferimentoIncarico;
        return this;
    }

    /**
     * Get the contenuto property: The contenuto property.
     * 
     * @return the contenuto value.
     */
    @Generated
    public String getContenuto() {
        return this.contenuto;
    }

    /**
     * Set the contenuto property: The contenuto property.
     * 
     * @param contenuto the contenuto value to set.
     * @return the DocumentoSinistro object itself.
     */
    @Generated
    public DocumentoSinistro setContenuto(String contenuto) {
        this.contenuto = contenuto;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("compagnia", this.compagnia);
        jsonWriter.writeStringField("agenzia", this.agenzia);
        jsonWriter.writeNumberField("annoPolizza", this.annoPolizza);
        jsonWriter.writeStringField("areaDiBusiness", this.areaDiBusiness);
        jsonWriter.writeStringField("codiceFiscale", this.codiceFiscale);
        jsonWriter.writeStringField("codiceUnitaOrganizzativa", this.codiceUnitaOrganizzativa);
        jsonWriter.writeStringField("tipoUnitaOrganizzativa", this.tipoUnitaOrganizzativa);
        jsonWriter.writeStringField("contentSize", this.contentSize);
        jsonWriter.writeStringField("dataInvioAnia", this.dataInvioAnia);
        jsonWriter.writeStringField("dataRicezioneDaAnia", this.dataRicezioneDaAnia);
        jsonWriter.writeStringField("dataSinistro", this.dataSinistro);
        jsonWriter.writeStringField("enteGestore", this.enteGestore);
        jsonWriter.writeStringField("nomeContraentePolizza", this.nomeContraentePolizza);
        jsonWriter.writeStringField("numeroPolizzaColpita", this.numeroPolizzaColpita);
        jsonWriter.writeStringField("partitaIva", this.partitaIva);
        jsonWriter.writeStringField("ramoPolizza", this.ramoPolizza);
        jsonWriter.writeStringField("ramoTecnico", this.ramoTecnico);
        jsonWriter.writeStringField("riferimentoSinistro", this.riferimentoSinistro);
        jsonWriter.writeBooleanField("sinistroChiuso", this.sinistroChiuso);
        jsonWriter.writeStringField("targa", this.targa);
        jsonWriter.writeNumberField("annoIncarico", this.annoIncarico);
        jsonWriter.writeStringField("barcode", this.barcode);
        jsonWriter.writeStringField("codiceAllegato", this.codiceAllegato);
        jsonWriter.writeStringField("codiceIncarico", this.codiceIncarico);
        jsonWriter.writeStringField("codicePrimoUtentePubblicante", this.codicePrimoUtentePubblicante);
        jsonWriter.writeStringField("codiceTicketIsaac", this.codiceTicketIsaac);
        jsonWriter.writeStringField("codiceTipologiaDocumento", this.codiceTipologiaDocumento);
        jsonWriter.writeStringField("codiceUtentePubblicante", this.codiceUtentePubblicante);
        jsonWriter.writeStringField("codiceVisibilitaEnti", this.codiceVisibilitaEnti);
        jsonWriter.writeBooleanField("documentoArchiviato", this.documentoArchiviato);
        jsonWriter.writeBooleanField("documentoDaLeggere", this.documentoDaLeggere);
        jsonWriter.writeBooleanField("documentoNonCompleto", this.documentoNonCompleto);
        jsonWriter.writeStringField("entePubblicante", this.entePubblicante);
        jsonWriter.writeStringField("idStampa", this.idStampa);
        jsonWriter.writeBooleanField("limitazioneVisibilitaAgenzia", this.limitazioneVisibilitaAgenzia);
        jsonWriter.writeBooleanField("limitazioneVisibilitaCarrozzeria", this.limitazioneVisibilitaCarrozzeria);
        jsonWriter.writeBooleanField("limitazioneVisibilitaLegali", this.limitazioneVisibilitaLegali);
        jsonWriter.writeBooleanField("limitazioneVisibilitaMedici", this.limitazioneVisibilitaMedici);
        jsonWriter.writeBooleanField("limitazioneVisibilitaPeriti", this.limitazioneVisibilitaPeriti);
        jsonWriter.writeStringField("enteEmittenteIncarico", this.enteEmittenteIncarico);
        jsonWriter.writeStringField("liquidatoreIncaricato", this.liquidatoreIncaricato);
        jsonWriter.writeStringField("livello", this.livello);
        jsonWriter.writeStringField("nomePosizione", this.nomePosizione);
        jsonWriter.writeStringField("numeroFattura", this.numeroFattura);
        jsonWriter.writeNumberField("numeroIncarico", this.numeroIncarico);
        jsonWriter.writeStringField("numeroPosizione", this.numeroPosizione);
        jsonWriter.writeStringField("origine", this.origine);
        jsonWriter.writeNumberField("statoAnia", this.statoAnia);
        jsonWriter.writeStringField("tipologiaDocumento", this.tipologiaDocumento);
        jsonWriter.writeStringField("contentType", this.contentType);
        jsonWriter.writeStringField("dataPubblicazione", this.dataPubblicazione);
        jsonWriter.writeStringField("idDocumento", this.idDocumento);
        jsonWriter.writeStringField("nomeAllegato", this.nomeAllegato);
        jsonWriter.writeStringField("dataConferimentoIncarico", this.dataConferimentoIncarico);
        jsonWriter.writeStringField("contenuto", this.contenuto);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentoSinistro from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentoSinistro if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DocumentoSinistro.
     */
    @Generated
    public static DocumentoSinistro fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DocumentoSinistro deserializedDocumentoSinistro = new DocumentoSinistro();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("compagnia".equals(fieldName)) {
                    deserializedDocumentoSinistro.compagnia = reader.getString();
                } else if ("agenzia".equals(fieldName)) {
                    deserializedDocumentoSinistro.agenzia = reader.getString();
                } else if ("annoPolizza".equals(fieldName)) {
                    deserializedDocumentoSinistro.annoPolizza = reader.getNullable(JsonReader::getInt);
                } else if ("areaDiBusiness".equals(fieldName)) {
                    deserializedDocumentoSinistro.areaDiBusiness = reader.getString();
                } else if ("codiceFiscale".equals(fieldName)) {
                    deserializedDocumentoSinistro.codiceFiscale = reader.getString();
                } else if ("codiceUnitaOrganizzativa".equals(fieldName)) {
                    deserializedDocumentoSinistro.codiceUnitaOrganizzativa = reader.getString();
                } else if ("tipoUnitaOrganizzativa".equals(fieldName)) {
                    deserializedDocumentoSinistro.tipoUnitaOrganizzativa = reader.getString();
                } else if ("contentSize".equals(fieldName)) {
                    deserializedDocumentoSinistro.contentSize = reader.getString();
                } else if ("dataInvioAnia".equals(fieldName)) {
                    deserializedDocumentoSinistro.dataInvioAnia = reader.getString();
                } else if ("dataRicezioneDaAnia".equals(fieldName)) {
                    deserializedDocumentoSinistro.dataRicezioneDaAnia = reader.getString();
                } else if ("dataSinistro".equals(fieldName)) {
                    deserializedDocumentoSinistro.dataSinistro = reader.getString();
                } else if ("enteGestore".equals(fieldName)) {
                    deserializedDocumentoSinistro.enteGestore = reader.getString();
                } else if ("nomeContraentePolizza".equals(fieldName)) {
                    deserializedDocumentoSinistro.nomeContraentePolizza = reader.getString();
                } else if ("numeroPolizzaColpita".equals(fieldName)) {
                    deserializedDocumentoSinistro.numeroPolizzaColpita = reader.getString();
                } else if ("partitaIva".equals(fieldName)) {
                    deserializedDocumentoSinistro.partitaIva = reader.getString();
                } else if ("ramoPolizza".equals(fieldName)) {
                    deserializedDocumentoSinistro.ramoPolizza = reader.getString();
                } else if ("ramoTecnico".equals(fieldName)) {
                    deserializedDocumentoSinistro.ramoTecnico = reader.getString();
                } else if ("riferimentoSinistro".equals(fieldName)) {
                    deserializedDocumentoSinistro.riferimentoSinistro = reader.getString();
                } else if ("sinistroChiuso".equals(fieldName)) {
                    deserializedDocumentoSinistro.sinistroChiuso = reader.getNullable(JsonReader::getBoolean);
                } else if ("targa".equals(fieldName)) {
                    deserializedDocumentoSinistro.targa = reader.getString();
                } else if ("annoIncarico".equals(fieldName)) {
                    deserializedDocumentoSinistro.annoIncarico = reader.getNullable(JsonReader::getInt);
                } else if ("barcode".equals(fieldName)) {
                    deserializedDocumentoSinistro.barcode = reader.getString();
                } else if ("codiceAllegato".equals(fieldName)) {
                    deserializedDocumentoSinistro.codiceAllegato = reader.getString();
                } else if ("codiceIncarico".equals(fieldName)) {
                    deserializedDocumentoSinistro.codiceIncarico = reader.getString();
                } else if ("codicePrimoUtentePubblicante".equals(fieldName)) {
                    deserializedDocumentoSinistro.codicePrimoUtentePubblicante = reader.getString();
                } else if ("codiceTicketIsaac".equals(fieldName)) {
                    deserializedDocumentoSinistro.codiceTicketIsaac = reader.getString();
                } else if ("codiceTipologiaDocumento".equals(fieldName)) {
                    deserializedDocumentoSinistro.codiceTipologiaDocumento = reader.getString();
                } else if ("codiceUtentePubblicante".equals(fieldName)) {
                    deserializedDocumentoSinistro.codiceUtentePubblicante = reader.getString();
                } else if ("codiceVisibilitaEnti".equals(fieldName)) {
                    deserializedDocumentoSinistro.codiceVisibilitaEnti = reader.getString();
                } else if ("documentoArchiviato".equals(fieldName)) {
                    deserializedDocumentoSinistro.documentoArchiviato = reader.getNullable(JsonReader::getBoolean);
                } else if ("documentoDaLeggere".equals(fieldName)) {
                    deserializedDocumentoSinistro.documentoDaLeggere = reader.getNullable(JsonReader::getBoolean);
                } else if ("documentoNonCompleto".equals(fieldName)) {
                    deserializedDocumentoSinistro.documentoNonCompleto = reader.getNullable(JsonReader::getBoolean);
                } else if ("entePubblicante".equals(fieldName)) {
                    deserializedDocumentoSinistro.entePubblicante = reader.getString();
                } else if ("idStampa".equals(fieldName)) {
                    deserializedDocumentoSinistro.idStampa = reader.getString();
                } else if ("limitazioneVisibilitaAgenzia".equals(fieldName)) {
                    deserializedDocumentoSinistro.limitazioneVisibilitaAgenzia
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("limitazioneVisibilitaCarrozzeria".equals(fieldName)) {
                    deserializedDocumentoSinistro.limitazioneVisibilitaCarrozzeria
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("limitazioneVisibilitaLegali".equals(fieldName)) {
                    deserializedDocumentoSinistro.limitazioneVisibilitaLegali
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("limitazioneVisibilitaMedici".equals(fieldName)) {
                    deserializedDocumentoSinistro.limitazioneVisibilitaMedici
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("limitazioneVisibilitaPeriti".equals(fieldName)) {
                    deserializedDocumentoSinistro.limitazioneVisibilitaPeriti
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enteEmittenteIncarico".equals(fieldName)) {
                    deserializedDocumentoSinistro.enteEmittenteIncarico = reader.getString();
                } else if ("liquidatoreIncaricato".equals(fieldName)) {
                    deserializedDocumentoSinistro.liquidatoreIncaricato = reader.getString();
                } else if ("livello".equals(fieldName)) {
                    deserializedDocumentoSinistro.livello = reader.getString();
                } else if ("nomePosizione".equals(fieldName)) {
                    deserializedDocumentoSinistro.nomePosizione = reader.getString();
                } else if ("numeroFattura".equals(fieldName)) {
                    deserializedDocumentoSinistro.numeroFattura = reader.getString();
                } else if ("numeroIncarico".equals(fieldName)) {
                    deserializedDocumentoSinistro.numeroIncarico = reader.getNullable(JsonReader::getInt);
                } else if ("numeroPosizione".equals(fieldName)) {
                    deserializedDocumentoSinistro.numeroPosizione = reader.getString();
                } else if ("origine".equals(fieldName)) {
                    deserializedDocumentoSinistro.origine = reader.getString();
                } else if ("statoAnia".equals(fieldName)) {
                    deserializedDocumentoSinistro.statoAnia = reader.getNullable(JsonReader::getInt);
                } else if ("tipologiaDocumento".equals(fieldName)) {
                    deserializedDocumentoSinistro.tipologiaDocumento = reader.getString();
                } else if ("contentType".equals(fieldName)) {
                    deserializedDocumentoSinistro.contentType = reader.getString();
                } else if ("dataPubblicazione".equals(fieldName)) {
                    deserializedDocumentoSinistro.dataPubblicazione = reader.getString();
                } else if ("idDocumento".equals(fieldName)) {
                    deserializedDocumentoSinistro.idDocumento = reader.getString();
                } else if ("nomeAllegato".equals(fieldName)) {
                    deserializedDocumentoSinistro.nomeAllegato = reader.getString();
                } else if ("dataConferimentoIncarico".equals(fieldName)) {
                    deserializedDocumentoSinistro.dataConferimentoIncarico = reader.getString();
                } else if ("contenuto".equals(fieldName)) {
                    deserializedDocumentoSinistro.contenuto = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDocumentoSinistro;
        });
    }
}
