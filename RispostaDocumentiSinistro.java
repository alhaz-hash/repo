package com.azure.app.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The RispostaDocumentiSinistro model.
 */
@Fluent
public final class RispostaDocumentiSinistro implements JsonSerializable<RispostaDocumentiSinistro> {
    /*
     * The datiTecnici property.
     */
    @Generated
    private RispostaBaseDatiTecnici datiTecnici;

    /*
     * Elenco delle segnalazioni
     */
    @Generated
    private List<String> segnalazioni;

    /*
     * The errori property.
     */
    @Generated
    private List<RispostaBaseErroriInner> errori;

    /*
     * The paginazione property.
     */
    @Generated
    private RispostaBasePaginazione paginazione;

    /*
     * The payload property.
     */
    @Generated
    private List<DocumentoSinistro> payload;

    /**
     * Creates an instance of RispostaDocumentiSinistro class.
     */
    @Generated
    public RispostaDocumentiSinistro() {
    }

    /**
     * Get the datiTecnici property: The datiTecnici property.
     * 
     * @return the datiTecnici value.
     */
    @Generated
    public RispostaBaseDatiTecnici getDatiTecnici() {
        return this.datiTecnici;
    }

    /**
     * Set the datiTecnici property: The datiTecnici property.
     * 
     * @param datiTecnici the datiTecnici value to set.
     * @return the RispostaDocumentiSinistro object itself.
     */
    @Generated
    public RispostaDocumentiSinistro setDatiTecnici(RispostaBaseDatiTecnici datiTecnici) {
        this.datiTecnici = datiTecnici;
        return this;
    }

    /**
     * Get the segnalazioni property: Elenco delle segnalazioni.
     * 
     * @return the segnalazioni value.
     */
    @Generated
    public List<String> getSegnalazioni() {
        return this.segnalazioni;
    }

    /**
     * Set the segnalazioni property: Elenco delle segnalazioni.
     * 
     * @param segnalazioni the segnalazioni value to set.
     * @return the RispostaDocumentiSinistro object itself.
     */
    @Generated
    public RispostaDocumentiSinistro setSegnalazioni(List<String> segnalazioni) {
        this.segnalazioni = segnalazioni;
        return this;
    }

    /**
     * Get the errori property: The errori property.
     * 
     * @return the errori value.
     */
    @Generated
    public List<RispostaBaseErroriInner> getErrori() {
        return this.errori;
    }

    /**
     * Set the errori property: The errori property.
     * 
     * @param errori the errori value to set.
     * @return the RispostaDocumentiSinistro object itself.
     */
    @Generated
    public RispostaDocumentiSinistro setErrori(List<RispostaBaseErroriInner> errori) {
        this.errori = errori;
        return this;
    }

    /**
     * Get the paginazione property: The paginazione property.
     * 
     * @return the paginazione value.
     */
    @Generated
    public RispostaBasePaginazione getPaginazione() {
        return this.paginazione;
    }

    /**
     * Set the paginazione property: The paginazione property.
     * 
     * @param paginazione the paginazione value to set.
     * @return the RispostaDocumentiSinistro object itself.
     */
    @Generated
    public RispostaDocumentiSinistro setPaginazione(RispostaBasePaginazione paginazione) {
        this.paginazione = paginazione;
        return this;
    }

    /**
     * Get the payload property: The payload property.
     * 
     * @return the payload value.
     */
    @Generated
    public List<DocumentoSinistro> getPayload() {
        return this.payload;
    }

    /**
     * Set the payload property: The payload property.
     * 
     * @param payload the payload value to set.
     * @return the RispostaDocumentiSinistro object itself.
     */
    @Generated
    public RispostaDocumentiSinistro setPayload(List<DocumentoSinistro> payload) {
        this.payload = payload;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("datiTecnici", this.datiTecnici);
        jsonWriter.writeArrayField("segnalazioni", this.segnalazioni, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("errori", this.errori, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("paginazione", this.paginazione);
        jsonWriter.writeArrayField("payload", this.payload, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RispostaDocumentiSinistro from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RispostaDocumentiSinistro if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RispostaDocumentiSinistro.
     */
    @Generated
    public static RispostaDocumentiSinistro fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RispostaDocumentiSinistro deserializedRispostaDocumentiSinistro = new RispostaDocumentiSinistro();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("datiTecnici".equals(fieldName)) {
                    deserializedRispostaDocumentiSinistro.datiTecnici = RispostaBaseDatiTecnici.fromJson(reader);
                } else if ("segnalazioni".equals(fieldName)) {
                    List<String> segnalazioni = reader.readArray(reader1 -> reader1.getString());
                    deserializedRispostaDocumentiSinistro.segnalazioni = segnalazioni;
                } else if ("errori".equals(fieldName)) {
                    List<RispostaBaseErroriInner> errori
                        = reader.readArray(reader1 -> RispostaBaseErroriInner.fromJson(reader1));
                    deserializedRispostaDocumentiSinistro.errori = errori;
                } else if ("paginazione".equals(fieldName)) {
                    deserializedRispostaDocumentiSinistro.paginazione = RispostaBasePaginazione.fromJson(reader);
                } else if ("payload".equals(fieldName)) {
                    List<DocumentoSinistro> payload = reader.readArray(reader1 -> DocumentoSinistro.fromJson(reader1));
                    deserializedRispostaDocumentiSinistro.payload = payload;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRispostaDocumentiSinistro;
        });
    }
}
